/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzer.code;

import FXML.ReportPlagiat.FXMLReportPlagiatController;
import analyzer.CalculatorPlagiat;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author tigler
 */
public class AnalyzePlagiatSystem {
    private Analyzer firstAnalyzer;
    private Analyzer secondAnalyzer;
    private CalculatorPlagiat calculatorPlagiat;


    public AnalyzePlagiatSystem() {
        firstAnalyzer = null;
        secondAnalyzer = null;
        calculatorPlagiat = new CalculatorPlagiat();
    }

    /**
     * инициализирует первый анализатор
     *
     * @param codeLang - код языка програмирования
     */
    public void setFirstAnalyzer(int codeLang) {
        firstAnalyzer = initAnalyzer(codeLang);
    }

    /**
     * инициализирует первый анализатор
     *
     * @param codeLang - код языка програмирования
     */
    public void setSecondAnalyzer(int codeLang) {
        secondAnalyzer = initAnalyzer(codeLang);
    }

    public void parsingFirst(String path) {
        firstAnalyzer.parsing(path);
    }

    public void parsingSecond(String path) {
        secondAnalyzer.parsing(path);
    }

    public Analyzer getFirstAnalyzer() {
        return firstAnalyzer;
    }

    public Analyzer getSecondAnalyzer() {
        return secondAnalyzer;
    }

    /**
     * инициализирует анализатор по коду языка программирования, и возвращает ссылку на него
     *
     * @param lang - код языка програмирования
     * @return если язык программирования есть с кодом параметра,то ссылку на необходимый анализатор, иначе null
     */

    private Analyzer initAnalyzer(int lang) {
        Analyzer analyzer = null;
        switch (lang) {
            case LanguagePrograming.LANG_C:
                analyzer = new AnalyzerC();
                break;
            case LanguagePrograming.LANG_JAVA:
                analyzer = new AnalyzerJava();
                break;
            default:
        }
        return analyzer;
    }


    /**
     * создает список языков программирования(объектов LanguagePrograming)
     *
     * @return список языков программирования
     */
    public ArrayList<LanguagePrograming> initLanguages() {
        ArrayList<LanguagePrograming> listLanguages = new ArrayList<>();
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_C, "C"));
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_JAVA, "Java"));
        return listLanguages;
    }

    public void analyzeProjects() {
        calculatorPlagiat.calcForTwoProj(firstAnalyzer, secondAnalyzer);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/FXMLReportPlagiat.fxml"));
        try {
            AnchorPane pane = (AnchorPane) loader.load();
            FXMLReportPlagiatController fxmlReportPlagiatController = loader.getController();
            fxmlReportPlagiatController.setFrequences(calculatorPlagiat.getFreqFirst(), calculatorPlagiat.getFreqSecond(),
                    calculatorPlagiat.getResultFreq());
            fxmlReportPlagiatController.setResultSeqOperators(calculatorPlagiat.getResultSeqOperators());
            fxmlReportPlagiatController.setListsMetrics(firstAnalyzer.getListResultAnalyzeFiles(),
                    secondAnalyzer.getListResultAnalyzeFiles());
            Scene scene = new Scene(pane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Отчет о совпадениях");
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public int fullAnalyze() {
        calculatorPlagiat.calcForTwoProj(firstAnalyzer, secondAnalyzer);
        calculatorPlagiat.calcDynamic(firstAnalyzer, secondAnalyzer);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/FXMLReportPlagiat.fxml"));
        try {
            AnchorPane pane = (AnchorPane) loader.load();
            FXMLReportPlagiatController fxmlReportPlagiatController = loader.getController();
            fxmlReportPlagiatController.setFrequences(calculatorPlagiat.getFreqFirst(), calculatorPlagiat.getFreqSecond(),
                    calculatorPlagiat.getResultFreq());
            fxmlReportPlagiatController.setResultSeqOperators(calculatorPlagiat.getResultSeqOperators());
            fxmlReportPlagiatController.setResultDynamic(calculatorPlagiat.getResultDynamic());
            fxmlReportPlagiatController.setListsMetrics(firstAnalyzer.getListResultAnalyzeFiles(),
                    secondAnalyzer.getListResultAnalyzeFiles());
            Scene scene = new Scene(pane);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Отчет о совпадениях");
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }


    public void firstProjCompareDB() {
        calculatorPlagiat.compareProjectDB(firstAnalyzer, 1);
    }

    public void secondProjCompareDB() {
        calculatorPlagiat.compareProjectDB(secondAnalyzer, 2);
    }

    public void writeDBFirstProj() {
        try {
            PreparedStatement preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewProject);
            preparedStatement.setString(1, firstAnalyzer.getProjectProgramm().getAuthor());
            preparedStatement.setString(2, firstAnalyzer.getProjectProgramm().getDesc());
            preparedStatement.setString(3, firstAnalyzer.getProjectProgramm().getName());
            int idProj = ConnectorDB.executeUpdate();

            for (int i = 0; i < firstAnalyzer.getListResultAnalyzeFiles().size(); i++) {
                preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewSource);

                String[] fileNameExt = firstAnalyzer.getListResultAnalyzeFiles().get(i).getNameFile().split("\\.");
                preparedStatement.setString(1, fileNameExt[0]);
                preparedStatement.setString(2, fileNameExt[1]);


                preparedStatement.setString(3, readerFile(firstAnalyzer.getListResultAnalyzeFiles().get(i).getPath()));


                preparedStatement.setInt(5, idProj);
                int idSrc = ConnectorDB.executeUpdate();


                /*for (int j = 0; j < firstAnalyzer.getListResultAnalyzeFiles().get(i).getOperators().size(); j++) {
                    preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewOperator);
                    preparedStatement.setString(1, firstAnalyzer.getListResultAnalyzeFiles().get(i)
                            .getOperators().get(j).getValueOperator());
                    preparedStatement.setInt(2, firstAnalyzer.getListResultAnalyzeFiles().get(i)
                            .getOperators().get(j).getKeyOperator());
                    preparedStatement.setInt(3, j);
                    preparedStatement.setInt(4, idSrc);
                    int idOper = ConnectorDB.executeUpdate();
                }*/
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void writeDBSecondProj() {
        try {
            PreparedStatement preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewProject);
            preparedStatement.setString(1, firstAnalyzer.getProjectProgramm().getAuthor());
            preparedStatement.setString(2, firstAnalyzer.getProjectProgramm().getDesc());
            preparedStatement.setString(3, secondAnalyzer.getProjectProgramm().getName());
            int idProj = ConnectorDB.executeUpdate();

            for (int i = 0; i < secondAnalyzer.getListResultAnalyzeFiles().size(); i++) {
                preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewSource);
                String[] fileNameExt = secondAnalyzer.getListResultAnalyzeFiles().get(i).getNameFile().split(".");
                preparedStatement.setString(1, fileNameExt[0]);
                preparedStatement.setString(2, fileNameExt[1]);

                preparedStatement.setInt(4, idProj);
                int idSrc = ConnectorDB.executeUpdate();


               /* for (int j = 0; j < secondAnalyzer.getListResultAnalyzeFiles().get(i).getOperators().size(); j++) {
                    preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.insertNewOperator);
                    preparedStatement.setString(1, secondAnalyzer.getListResultAnalyzeFiles().get(i)
                            .getOperators().get(j).getValueOperator());
                    preparedStatement.setInt(2, secondAnalyzer.getListResultAnalyzeFiles().get(i)
                            .getOperators().get(j).getKeyOperator());
                    preparedStatement.setInt(3, j);
                    preparedStatement.setInt(4, idSrc);

                }*/


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static String readerFile(String path) {
        BufferedReader reader = null;
        String text = "";
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path), Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                text += line;
            }
        } catch (IOException e) {
            // log error
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // log warning
                }
            }
        }
        return text;
    }
}

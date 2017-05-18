/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzer.code;

import FXML.ReportPlagiat.FXMLReportPlagiatController;
import FXML.Setting.FXMLSettingController;
import analyzer.CalculatorPlagiat;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

/**
 * основной класс программы - фасад
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

    /**
     * выполняет статический анализ файла первым анализатором
     *
     * @param path - путь до анализируемого файла
     */
    public void parsingFirst(String path) {
        firstAnalyzer.parsing(path);
    }

    /**
     * выполняет статический анализ файла вторым анализатором
     * @param path - путь до анализируемого файла
     */
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
            case LanguagePrograming.LANG_CPP:
                analyzer = new AnalyzerCpp();
                break;
            case LanguagePrograming.LANG_CSHARP:
                analyzer = new AnalyzerCSharp();
                break;
            case LanguagePrograming.LANG_PYTHON3:
                analyzer = new AnalyzerPython3();
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
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_CPP, "C++"));
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_CSHARP, "C#"));
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_JAVA, "Java"));
        listLanguages.add(new LanguagePrograming(LanguagePrograming.LANG_PYTHON3, "Python3"));
        return listLanguages;
    }

    /**
     * вычисляет схожесть проектов и открывает окно с отчетом
     */
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


    /**
     * производит анализ схожести исходников, выполняет динамический анализ и открывает окно с отчетом
     */
    public void fullAnalyze() {
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
    }


    /**
     * записывает данные проекта и результаты анализа в БД
     * @param analyzer анализатор содержащий проект и результат анализа
     */
    public void writeDBProj(Analyzer analyzer) {
        try {
            PreparedStatement preparedStatement = ConnectorDB.prepeareStmtRetKey(ConnectorDB.insertNewProject);
            preparedStatement.setString(1, analyzer.getProjectProgramm().getAuthor());
            preparedStatement.setString(2, analyzer.getProjectProgramm().getDesc());
            preparedStatement.setString(3, analyzer.getProjectProgramm().getName());
            ConnectorDB.executeUpdate();
            int idProj = ConnectorDB.getinsertId();

            for (int i = 0; i < analyzer.getListResultAnalyzeFiles().size(); i++) {
                preparedStatement = ConnectorDB.prepeareStmtRetKey(ConnectorDB.insertNewSource);

                String[] fileNameExt = analyzer.getListResultAnalyzeFiles().get(i).getNameFile().split("\\.");
                preparedStatement.setString(1, fileNameExt[0]);
                preparedStatement.setString(2, fileNameExt[1]);
                preparedStatement.setString(3, readerFile(analyzer.getListResultAnalyzeFiles().get(i).getPath()));
                preparedStatement.setInt(4, idProj);
                ConnectorDB.executeUpdate();
                int idSrc = ConnectorDB.getinsertId();

                for (int j = 0; j < analyzer.getListResultAnalyzeFiles().get(i).getListsOperators().size(); j++) {
                    preparedStatement = ConnectorDB.prepeareStmtRetKey(ConnectorDB.insertNewBlock);
                    preparedStatement.setInt(1, idSrc);
                    ConnectorDB.executeUpdate();
                    int idBlock = ConnectorDB.getinsertId();


                    for (int k = 0; k < analyzer.getListResultAnalyzeFiles().get(i).getListsOperators().get(j).size(); k++) {
                        preparedStatement = ConnectorDB.prepeareStmtRetKey(ConnectorDB.insertNewOperator);
                        preparedStatement.setString(1, analyzer.getListResultAnalyzeFiles().get(i).
                                getListsOperators().get(j).get(k).getValueOperator());
                        preparedStatement.setInt(2, analyzer.getListResultAnalyzeFiles().get(i).
                                getListsOperators().get(j).get(k).getKeyOperator());
                        preparedStatement.setInt(3, k);
                        preparedStatement.setInt(4, idBlock);
                        ConnectorDB.executeUpdate();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * получает список с информацией о проекте и данных для анализа из БД
     * @return список с информацией о проекте и данных для анализа из БД
     */
    public ArrayList<ProjectDB> readResultAnalyzeDB() {
        try {
            PreparedStatement preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.selectProjects);
            ResultSet resultSet = ConnectorDB.executeQuery();
            ArrayList<ProjectDB> listProjectsDB = new ArrayList<>();
            while (resultSet.next()) {
                preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.selectSource);
                preparedStatement.setInt(1, resultSet.getInt(1));
                ResultSet resultSet1 = ConnectorDB.executeQuery();
                ArrayList<ResultAnalyzeFile> resultsAnalyzeFile = new ArrayList<>();
                while (resultSet1.next()) {
                    preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.selectBlock);
                    preparedStatement.setInt(1, resultSet1.getInt(1));
                    ResultSet resultSet2 = ConnectorDB.executeQuery();
                    ArrayList<ArrayList<Operator>> listsOperators = new ArrayList<>();
                    while (resultSet2.next()) {
                        preparedStatement = ConnectorDB.prepeareStmt(ConnectorDB.selectOperator);
                        preparedStatement.setInt(1, resultSet2.getInt(1));
                        ResultSet resultSet3 = ConnectorDB.executeQuery();
                        ArrayList<Operator> listOperator = new ArrayList<>();
                        while (resultSet3.next()) {
                            int keyOper = resultSet3.getInt(3);
                            String oper = resultSet3.getString(2);
                            Operator operator = new Operator(keyOper, oper, -1, null);
                            listOperator.add(operator);
                        }
                        listsOperators.add(listOperator);
                    }
                    String nameFile = resultSet1.getString(2);
                    resultsAnalyzeFile.add(new ResultAnalyzeFile(nameFile, null, listsOperators));
                }
                int idProj = resultSet.getInt(1);
                String author = resultSet.getString(2);
                String name = resultSet.getString(3);
                String desc = resultSet.getString(4);
                listProjectsDB.add(new ProjectDB(idProj, author, name, desc, resultsAnalyzeFile));
            }
            return listProjectsDB;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     * @param analyzer
     * @param numAn
     * @param projectsDB
     * @return
     */
    public ArrayList<ResultCompareWithDB> compareWithDB(Analyzer analyzer, int numAn, ArrayList<ProjectDB> projectsDB) {
        Properties props = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream(FXMLSettingController.PATH_CONFIG_FILE);
            try {
                props.load(is);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
        }

        int initialValue = 0;
        try {
            initialValue = Integer.parseInt(props.getProperty("SpinnerValDB"));
        } catch (Exception e) {
            initialValue = 80;
        }
        return calculatorPlagiat.compareProjectDB(analyzer, numAn, projectsDB, initialValue);
    }


    /**
     * статический метод чтения текста из файла
     *
     * @param path - путь до файла
     * @return текст файла в строковой переменной
     */
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat;

import FXML.ReportPlagiat.CoinGraf.FXMLCoinMetricsController;
import FXML.ReportPlagiat.CoinSeq.FXMLCoinSeqController;
import FXML.ReportPlagiat.Dynamic.FXMLDynamicResultController;
import FXML.ReportPlagiat.Frequences.FXMLFrequencesController;
import FXML.ReportPlagiat.Totals.FXMLTotalsController;
import analyzer.code.MyMap;
import analyzer.code.ResultAnalyzeFile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLReportPlagiatController implements Initializable {

    @FXML
    ListView listView;
    @FXML
    BorderPane borderPane;
    @FXML
    Button buttonExit;

    ArrayList<MyMap> freqFirst;
    ArrayList<MyMap> freqsecond;
    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesFirst;
    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesSecond;
    int resultFreq;
    int resultSeqOperators;
    int resultDynamic;
    int resultMacCabe;
    int resultComapreGrafs;
    ObservableList<String> items;

    /**
     * Initializes the controller class.
     */

    public void setFrequences(ArrayList<MyMap> freqFirst, ArrayList<MyMap> freqsecond, int resultFreq) {
        this.freqFirst = freqFirst;
        this.freqsecond = freqsecond;
        this.resultFreq = resultFreq;
    }

    public void setListsMetrics(ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesFirst,
                                ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesSecond) {
        this.resultsAnalyzeFilesFirst = resultsAnalyzeFilesFirst;
        this.resultsAnalyzeFilesSecond = resultsAnalyzeFilesSecond;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList(
                "Общий результат", "Последовательности операторов", "Частоты", "Метрики графа");
        listView.setItems(items);
        listView.getSelectionModel().select(0);

        buttonExit.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage stage = (Stage) buttonExit.getScene().getWindow();
                stage.close();
            }
        });
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                eventOnListView();
            }
        });
    }

    private void eventOnListView() {
        //System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
        FXMLLoader loader = null;
        AnchorPane adminTeamView = null;
        try {
            switch (listView.getSelectionModel().getSelectedIndex()) {
                        /*case 0:
                            loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinMetrics/FXMLCoinMetrics.fxml"));
                            adminTeamView = (AnchorPane) loader.load();
                            FXMLCoinMetricsController fxmlCoinMetricsController = loader.getController();
                            fxmlCoinMetricsController.setListsMetrics(resultsAnalyzeFilesFirst,
                                    resultsAnalyzeFilesSecond);
                            break;*/
                case 1:
                    loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinSeq/FXMLCoinSeq.fxml"));
                    adminTeamView = (AnchorPane) loader.load();
                    FXMLCoinSeqController fxmlCoinSeqController = loader.getController();
                    fxmlCoinSeqController.setResultSeqOperators(resultSeqOperators);
                    break;

                case 2:
                    loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/Frequences/FXMLFrequences.fxml"));
                    adminTeamView = (AnchorPane) loader.load();
                    FXMLFrequencesController fxmlFrequencesController = loader.getController();
                    fxmlFrequencesController.setFrequences(freqFirst, freqsecond, resultFreq);
                    break;
                case 3:
                    loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinGraf/FXMLCoinMetrics.fxml"));
                    adminTeamView = (AnchorPane) loader.load();
                    FXMLCoinMetricsController fxmlCoinMetricsController = loader.getController();
                    fxmlCoinMetricsController.setMetricsResult(resultMacCabe);
                    fxmlCoinMetricsController.setResultCompareGrafs(resultComapreGrafs);
                    break;
                case 4:
                    loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/Dynamic/FXMLDynamicResult.fxml"));
                    adminTeamView = (AnchorPane) loader.load();
                    FXMLDynamicResultController fxmlDynamicResultController = loader.getController();
                    fxmlDynamicResultController.setResult(resultDynamic);
                    break;
                case 0:
                    loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/Totals/FXMLTotals.fxml"));
                    adminTeamView = (AnchorPane) loader.load();
                    FXMLTotalsController fxmlTotalsController = loader.getController();
                    fxmlTotalsController.setResults(resultSeqOperators, resultFreq, resultMacCabe, resultComapreGrafs);
                    break;
                default:
                    break;
            }


            //FXMLReportPlagiatController fxmlReportPlagiatController = loader.getController();
            //fxmlReportPlagiatController.setFrequences(freqFirst, freqsecond);
            borderPane.setCenter(adminTeamView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setResultSeqOperators(int resultSeqOperators) {
        this.resultSeqOperators = resultSeqOperators;
        eventOnListView();
    }

    public void setResultDynamic(int resultDynamic) {
        this.resultDynamic = resultDynamic;
        items.add("Динамический анализ");
        eventOnListView();
    }

    public void setMacCabeMetric(int resultMacCabe) {
        this.resultMacCabe = resultMacCabe;
        eventOnListView();
    }

    public void setResultCompareGrafs(int resultComapreGrafs) {
        this.resultComapreGrafs = resultComapreGrafs;
        eventOnListView();
    }
}

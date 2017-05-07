/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat;

import FXML.ReportPlagiat.CoinMetrics.FXMLCoinMetricsController;
import FXML.ReportPlagiat.Frequences.FXMLFrequencesController;
import analyzer.code.MyMap;
import analyzer.code.ResultAnalyzeFile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

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

    ArrayList<MyMap> freqFirst;
    ArrayList<MyMap> freqsecond;
    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesFirst;
    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesSecond;
    int resultFreq;

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
        ObservableList<String> items = FXCollections.observableArrayList(
                "Совпадение по метрикам", "Совпадение по последовательностям", "Частоты");
        listView.setItems(items);
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
                FXMLLoader loader = null;
                AnchorPane adminTeamView = null;
                try {
                    switch (listView.getSelectionModel().getSelectedIndex()) {
                        case 0:
                            loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinMetrics/FXMLCoinMetrics.fxml"));
                            adminTeamView = (AnchorPane) loader.load();
                            FXMLCoinMetricsController fxmlCoinMetricsController = loader.getController();
                            fxmlCoinMetricsController.setListsMetrics(resultsAnalyzeFilesFirst,
                                    resultsAnalyzeFilesSecond);
                            break;
                        case 1:
                            loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinSeq/FXMLCoinSeq.fxml"));
                            adminTeamView = (AnchorPane) loader.load();
                            break;

                        case 2:
                            loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/Frequences/FXMLFrequences.fxml"));
                            adminTeamView = (AnchorPane) loader.load();
                            FXMLFrequencesController fxmlFrequencesController = loader.getController();
                            fxmlFrequencesController.setFrequences(freqFirst, freqsecond, resultFreq);
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
        });
    }

}

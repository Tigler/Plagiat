/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.CoinMetrics;

import analyzer.code.ResultAnalyzeFile;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLCoinMetricsController implements Initializable {

    @FXML
    TableView<ViewMetrics> tableViewMetricFirst;
    @FXML
    TableView tableViewMetricSecond;

    int countRow;

    private ObservableList<ViewMetrics> metricsData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */

    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesFirst;
    ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesSecond;

    public void setListsMetrics(ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesFirst,
                                ArrayList<ResultAnalyzeFile> resultsAnalyzeFilesSecond) {
        this.resultsAnalyzeFilesFirst = resultsAnalyzeFilesFirst;
        this.resultsAnalyzeFilesSecond = resultsAnalyzeFilesSecond;
        viewResult();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        countRow = 0;
    }

    private void viewResult() {
        initData();
        tableViewMetricFirst.refresh();
        tableViewMetricFirst.getItems().clear();
        tableViewMetricFirst.getColumns().clear();


    }

    private void initData() {

    }


}

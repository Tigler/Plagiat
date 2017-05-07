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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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

        TableColumn<ViewMetrics, String> idColumn = new TableColumn<>("Имя Файла");
        idColumn.setCellValueFactory(new PropertyValueFactory<ViewMetrics, String>("name"));
        tableViewMetricFirst.getColumns().add(idColumn);
        for (int i = 0; i < resultsAnalyzeFilesFirst.get(0).getListMetrics().size(); i++) {
            TableColumn<ViewMetrics, String> idColumn1 = new TableColumn<>(resultsAnalyzeFilesFirst.get(0).getListMetrics().get(i).getName());
            idColumn1.setCellValueFactory(new PropertyValueFactory<ViewMetrics, String>(resultsAnalyzeFilesFirst.get(0).getListMetrics().get(i).getName()));
            tableViewMetricFirst.getColumns().add(idColumn1);
        }

        tableViewMetricFirst.setItems(metricsData);

    }

    private void initData() {
        for (int j = 0; j < resultsAnalyzeFilesFirst.size(); j++) {
            //for (int i = 0; i < resultsAnalyzeFilesFirst.get(0).getListMetrics().size(); i++) {
            metricsData.add(new ViewMetrics(resultsAnalyzeFilesFirst.get(j).getNameFile(),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(0).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(1).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(2).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(3).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(4).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(5).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(6).getResult()),
                    String.valueOf(resultsAnalyzeFilesFirst.get(j).getListMetrics().get(6).getResult())
            ));
            //}
        }
    }

}

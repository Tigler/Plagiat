/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.ReportDB;

import analyzer.code.ResultCompareWithDB;
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
public class FXMLReportDBController implements Initializable {

    @FXML
    TableView<ResultCompareWithDB> tableViewResult;
    ArrayList<ResultCompareWithDB> resultsCompareWithDB;
    ObservableList<ResultCompareWithDB> resultData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

    private void initData() {
        for (ResultCompareWithDB res : resultsCompareWithDB) {
            resultData.add(res);
        }

    }

    public void setResult(ArrayList<ResultCompareWithDB> resultsCompareWithDB) {
        this.resultsCompareWithDB = resultsCompareWithDB;
        initData();
        // устанавливаем тип и значение которое должно хранится в колонке
        TableColumn author = new TableColumn("Автор");
        TableColumn name = new TableColumn("Навание проекта");
        TableColumn desc = new TableColumn("Описание");
        TableColumn seq = new TableColumn("Послед");
        TableColumn freq = new TableColumn("Частоты");
        TableColumn allRes = new TableColumn("Общий результат");
        tableViewResult.getColumns().addAll(author, name, desc, seq, freq, allRes);
        author.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("author"));
        name.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("name"));
        desc.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("desc"));
        seq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("seq"));
        freq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("freq"));
        allRes.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("allRes"));
        tableViewResult.setItems(resultData);
    }


}

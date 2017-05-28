/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.ReportDB;

import analyzer.code.ResultCompareWithDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;
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
    Button buttonExit;
    @FXML
    TableView<ResultCompareWithDB> tableViewResult;
    ArrayList<ResultCompareWithDB> resultsCompareWithDB;
    ObservableList<ResultCompareWithDB> resultData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) buttonExit.getScene().getWindow();
                stage.close();
            }
        });

    }

    private void initData() {
        for (ResultCompareWithDB res : resultsCompareWithDB) {
            resultData.add(res);
        }

    }

    int i;

    public void setResult(ArrayList<ResultCompareWithDB> resultsCompareWithDB) {
        this.resultsCompareWithDB = resultsCompareWithDB;
        initData();
        // устанавливаем тип и значение которое должно хранится в колонке
        TableColumn author = new TableColumn("Автор");
        TableColumn name = new TableColumn("Название проекта");
        TableColumn desc = new TableColumn("Описание");
        TableColumn seq = new TableColumn("Пос-ти");
        TableColumn freq = new TableColumn("Час-ты");
        TableColumn macCabe = new TableColumn("М-а МК");
        TableColumn compGrafs = new TableColumn("М-д Слайсов");
        TableColumn allRes = new TableColumn("Общее");
        tableViewResult.getColumns().addAll(author, name, desc, seq, freq, macCabe, compGrafs, allRes);
        desc.setCellFactory(col -> {
            Button editButton = new Button("Открыть");
            TableCell<ResultCompareWithDB, ResultCompareWithDB> cell = new TableCell<ResultCompareWithDB, ResultCompareWithDB>() {
                @Override
                public void updateItem(ResultCompareWithDB person, boolean empty) {
                    super.updateItem(person, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        setGraphic(editButton);
                    }
                }
            };

            editButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    JOptionPane.showMessageDialog(null, tableViewResult.getItems().get(cell.getTableRow().getIndex()).getDesc(),
                            "Описание " + tableViewResult.getItems().get(cell.getTableRow().getIndex()).getName()
                                    + "(" + tableViewResult.getItems().get(cell.getTableRow().getIndex()).getAuthor() + ")", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            return cell;
        });
        author.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("author"));
        name.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("name"));
        // desc.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("desc"));
        seq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("seq"));
        freq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("freq"));
        macCabe.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("macCabe"));
        compGrafs.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("compGrafs"));
        allRes.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("allRes"));
        tableViewResult.setItems(resultData);
    }

}

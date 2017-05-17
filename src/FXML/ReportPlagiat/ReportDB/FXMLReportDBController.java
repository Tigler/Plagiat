/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.ReportDB;

import analyzer.code.ResultCompareWithDB;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
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
import javafx.util.Callback;

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
        desc.setCellValueFactory(
                new Callback<TableColumn.CellDataFeatures<String, Boolean>,
                        ObservableValue<Boolean>>() {

                    @Override
                    public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<String, Boolean> p) {
                        return new SimpleBooleanProperty(p.getValue() != null);
                    }
                });

        desc.setCellFactory(
                new Callback<TableColumn<String, Boolean>, TableCell<String, Boolean>>() {

                    @Override
                    public TableCell<String, Boolean> call(TableColumn<String, Boolean> p) {
                        return new ButtonCell("df");
                    }

                });
        author.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("author"));
        name.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("name"));
        // desc.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("desc"));
        seq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("seq"));
        freq.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("freq"));
        allRes.setCellValueFactory(new PropertyValueFactory<ResultCompareWithDB, String>("allRes"));
        tableViewResult.setItems(resultData);
    }


    //Define the button cell
    private class ButtonCell extends TableCell<String, Boolean> {
        final Button cellButton = new Button("Action");

        ButtonCell() {

            cellButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {

                }
            });
        }

        ButtonCell(String str) {

            cellButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    JOptionPane.showMessageDialog(null, tableViewResult.getSelectionModel().getSelectedItem().getDesc());
                }
            });
        }

        //Display button if the row is not empty
        @Override
        protected void updateItem(Boolean t, boolean empty) {
            super.updateItem(t, empty);
            if (!empty) {
                setGraphic(cellButton);
            }
        }
    }
}

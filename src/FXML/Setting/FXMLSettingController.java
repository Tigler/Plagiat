/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.Setting;

import FXML.Setting.SettingAnother.FXMLSettingAnotherController;
import analyzer.code.AnalyzerCode;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLSettingController implements Initializable {

    @FXML
    ListView listView;
    @FXML
    BorderPane borderPane;
    @FXML
    Button buttonOk;
    @FXML
    Button buttonCancel;

    CheckBox checkBoxWriteDB;
    Spinner spinnerValDB;

    public static final String PATH_CONFIG_FILE = "configSystem.cfg";

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Общие");
        listView.setItems(items);
        listView.getSelectionModel().select(0);
        eventOnListView();
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                eventOnListView();
            }
        });

        buttonOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Properties pro = new Properties();

                OutputStream propOut = null;
                try {
                    propOut = new FileOutputStream(new File(PATH_CONFIG_FILE));
                } catch (FileNotFoundException ex) {   //если файл отсутствует
                    java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
                }

                pro.setProperty("WriteDBEnable", String.valueOf(checkBoxWriteDB.isSelected()));
                pro.setProperty("SpinnerValDB", String.valueOf(spinnerValDB.getValue()));
                try {
                    pro.store(propOut, "комментарий");
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
                }
                Stage stage = (Stage) buttonOk.getScene().getWindow();
                stage.close();
            }
        });
        buttonCancel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage stage = (Stage) buttonCancel.getScene().getWindow();
                stage.close();
            }
        });
    }

    private void eventOnListView() {
        if (listView.getSelectionModel().getSelectedIndex() == 0) {
            FXMLLoader loader = null;
            AnchorPane adminTeamView = null;
            try {
                switch (listView.getSelectionModel().getSelectedIndex()) {
                    case 0:
                        loader = new FXMLLoader(getClass().getResource("/FXML/Setting/SettingAnother/FXMLSettingAnother.fxml"));
                        adminTeamView = (AnchorPane) loader.load();
                        FXMLSettingAnotherController fxmlSettingAnotherController = loader.getController();
                        checkBoxWriteDB = fxmlSettingAnotherController.getCheckBoxWriteDB();
                        spinnerValDB = fxmlSettingAnotherController.getSpinnerValDB();
                        break;
                    default:
                        break;
                }

                borderPane.setCenter(adminTeamView);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


}

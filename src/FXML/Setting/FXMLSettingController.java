/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.Setting;

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
import java.util.ResourceBundle;

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

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Single", "Double", "Suite", "Family App");
        //listViewMethods.set
        listView.setItems(items);
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //System.out.println("clicked on " + listView.getSelectionModel().getSelectedItem());
                if (listView.getSelectionModel().getSelectedIndex() == 0) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Setting/SettingMethods/FXMLSettingMethods.fxml"));

                    try {
                        AnchorPane adminTeamView = (AnchorPane) loader.load();
                        borderPane.setCenter(adminTeamView);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }

}

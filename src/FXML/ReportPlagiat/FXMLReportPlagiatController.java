/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat;

import analyzer.code.MyPair;
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

    ArrayList<MyPair> freqFirst;
    ArrayList<MyPair> freqsecond;
    /**
     * Initializes the controller class.
     */

    public void setFrequences(ArrayList<MyPair> freqFirst, ArrayList<MyPair> freqsecond) {

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
                switch (listView.getSelectionModel().getSelectedIndex()) {
                    case 0:
                        loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinMetrics/FXMLCoinMetrics.fxml"));
                        break;
                    case 1:
                        loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/CoinSeq/FXMLCoinSeq.fxml"));
                    case 2:
                        loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/Frequences/FXMLFrequences.fxml"));
                        break;
                    default:
                        break;
                }

                try {
                    AnchorPane adminTeamView = (AnchorPane) loader.load();
                    FXMLReportPlagiatController fxmlReportPlagiatController = loader.getController();
                    fxmlReportPlagiatController.setFrequences(freqFirst, freqsecond);
                    borderPane.setCenter(adminTeamView);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }

}

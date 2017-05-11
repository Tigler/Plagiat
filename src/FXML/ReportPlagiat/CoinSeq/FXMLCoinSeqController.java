/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.CoinSeq;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLCoinSeqController implements Initializable {

    int resultSeqOperators;
    @FXML
    Label labelResult;
    @FXML
    Button buttonExit;

    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buttonExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }

    public void setResultSeqOperators(int resultSeqOperators) {
        this.resultSeqOperators = resultSeqOperators;
        labelResult.setText("Совпадение по последовательностям операторов: " + resultSeqOperators + "%");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.CoinSeq;

import enums.ResultTextReportEnum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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


    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setResultSeqOperators(int resultSeqOperators) {
        this.resultSeqOperators = resultSeqOperators;
        labelResult.setText(ResultTextReportEnum.seqOperators.toString() + resultSeqOperators + "%");
    }
}

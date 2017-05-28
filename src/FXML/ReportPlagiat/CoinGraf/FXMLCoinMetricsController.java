/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.CoinGraf;

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
public class FXMLCoinMetricsController implements Initializable {

    @FXML
    Label labelResultMacCabe;
    @FXML
    Label labelResultCompGrafs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    public void setMetricsResult(int resultMacCabe) {
        labelResultMacCabe.setText(ResultTextReportEnum.macCabe.toString() + resultMacCabe + "%");
    }


    public void setResultCompareGrafs(int resultComapreGrafs) {
        labelResultCompGrafs.setText(ResultTextReportEnum.compareGrafs.toString() + resultComapreGrafs + "%");
    }
}

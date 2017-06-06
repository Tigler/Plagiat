/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.Totals;

import enums.ResultTextReportEnum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLTotalsController implements Initializable {

    int resultSeqOperators;
    @FXML
    Label labelResult;
    @FXML
    BarChart barChartTotals;


    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setResults(int resultSeqOperators, int resultFreq, int macCabe, int slice) {
        int total = (resultSeqOperators + resultFreq + macCabe + slice) / 4;
        labelResult.setText(ResultTextReportEnum.total.toString() + total + "%");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Процент обнаружения совпадений");
        series1.getData().add(new XYChart.Data("НОП", resultSeqOperators));
        series1.getData().add(new XYChart.Data("Частоты", resultFreq));
        series1.getData().add(new XYChart.Data("М-ка МакКейба", macCabe));
        series1.getData().add(new XYChart.Data("Слайсы", slice));
        barChartTotals.getData().addAll(series1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.Frequences;

import analyzer.code.MyMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLFrequencesController implements Initializable {

    @FXML
    BarChart barChartFirst;

    @FXML
    BarChart barChartSecond;

    /**
     * Initializes the controller class.
     */

    @FXML
    Label labelResult;
    ArrayList<MyMap> freqFirst;
    ArrayList<MyMap> freqsecond;
    int resultFreq;


    public void setFrequences(ArrayList<MyMap> freqFirst, ArrayList<MyMap> freqsecond, int resultFreq) {
        this.freqFirst = freqFirst;
        this.freqsecond = freqsecond;
        this.resultFreq = resultFreq;
        viewResult();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }

    private void viewResult() {
        barChartFirst.setTitle("Частоты проекта");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        if (freqFirst != null) {
            for (MyMap map : freqFirst) {
                series1.getData().add(new XYChart.Data(map.getValue(), map.getKey()));
            }
            barChartFirst.getData().addAll(series1);
        }

        barChartSecond.setTitle("Частоты проекта");

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2004");
        if (freqsecond != null) {
            for (MyMap map : freqsecond) {
                series2.getData().add(new XYChart.Data(map.getValue(), map.getKey()));
            }
            barChartSecond.getData().addAll(series2);
        }

        labelResult.setText("Схожесть по частотам операторов: " + resultFreq + "%");
    }

}

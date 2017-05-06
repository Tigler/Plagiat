/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.Frequences;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        barChartFirst.setTitle("Частоты проекта");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data("austria", 25601.34));
        series1.getData().add(new XYChart.Data("brazil", 20148.82));
        series1.getData().add(new XYChart.Data("france", 10000));
        series1.getData().add(new XYChart.Data("italy", 35407.15));
        series1.getData().add(new XYChart.Data("usa", 12000));
        barChartFirst.getData().addAll(series1);

        barChartSecond.setTitle("Частоты проекта");

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2003");
        series2.getData().add(new XYChart.Data("austria", 25601.34));
        series2.getData().add(new XYChart.Data("brazil", 20148.82));
        series2.getData().add(new XYChart.Data("france", 10000));
        series2.getData().add(new XYChart.Data("italy", 35407.15));
        series2.getData().add(new XYChart.Data("usa", 12000));
        barChartSecond.getData().addAll(series2);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.ReportPlagiat.Dynamic;

import analyzer.code.AnalyzePlagiatSystem;
import dynamic.DynamicAnalyzer;
import enums.ResultTextReportEnum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLDynamicResultController implements Initializable {

    @FXML
    Label labelResult;
    @FXML
    Label labelFirstProj;
    @FXML
    Label labelSecondProj;
    @FXML
    TextArea textAreaFirst;
    @FXML
    TextArea textAreaSecond;


    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    public void setResult(int resultDynamic) {
        labelResult.setText(ResultTextReportEnum.dynamic.toString() + resultDynamic + "%");
        textAreaFirst.setText(AnalyzePlagiatSystem.readerFile(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C1));
        textAreaSecond.setText(AnalyzePlagiatSystem.readerFile(DynamicAnalyzer.DYNAMIC_RESULT_PATH_C2));
        labelFirstProj.setText("Результат анализа первого проекта");
        labelSecondProj.setText("Результат анализа второго проекта");
    }
}

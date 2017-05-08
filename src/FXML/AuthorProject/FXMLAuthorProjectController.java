/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.AuthorProject;

import analyzer.code.AnalyzePlagiatSystem;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLAuthorProjectController implements Initializable {

    @FXML
    Button buttonOk;
    @FXML
    TextField textFieldAuthor;
    @FXML
    TextArea textAreaDescProj;


    /**
     * Initializes the controller class.
     */

    AnalyzePlagiatSystem analyzePlagiatSystem;
    int numAnalyzer;

    public void setAnalyzePlagiatSystem(AnalyzePlagiatSystem analyzePlagiatSystem, int numAnalyzer) {
        this.analyzePlagiatSystem = analyzePlagiatSystem;
        this.numAnalyzer = numAnalyzer;
        if (numAnalyzer == 1) {
            analyzePlagiatSystem.writeDBFirstProj();
        } else {
            if (numAnalyzer == 2) {
                analyzePlagiatSystem.writeDBSecondProj();
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        buttonOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (numAnalyzer == 1) {
                    analyzePlagiatSystem.firstProjCompareDB();
                } else {
                    if (numAnalyzer == 2) {
                        analyzePlagiatSystem.secondProjCompareDB();
                    }
                }

                Stage stage = (Stage) buttonOk.getScene().getWindow();
                stage.close();
            }
        });
    }


}

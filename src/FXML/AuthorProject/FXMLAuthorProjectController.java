/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.AuthorProject;

import analyzer.code.AnalyzePlagiatSystem;
import analyzer.code.Analyzer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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

    Analyzer analyzer;
    AnalyzePlagiatSystem analyzePlagiatSystem;

    public void setProject(Analyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        buttonOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (textFieldAuthor.getText().equals("") || textAreaDescProj.getText().equals("")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setResizable(false);
                    alert.setTitle("Информация о проекте");
                    alert.setHeaderText("Заполните поля");
                    alert.showAndWait();
                } else {
                    analyzer.getProjectProgramm().setAuthor(textFieldAuthor.getText());
                    analyzer.getProjectProgramm().setDesc(textAreaDescProj.getText());
                    analyzePlagiatSystem.writeDBProj(analyzer);
                    Stage stage = (Stage) buttonOk.getScene().getWindow();
                    stage.close();
                }
            }
        });
    }


    public void setPlagiatSystem(AnalyzePlagiatSystem analyzePlagiatSystem) {
        this.analyzePlagiatSystem = analyzePlagiatSystem;
    }
}

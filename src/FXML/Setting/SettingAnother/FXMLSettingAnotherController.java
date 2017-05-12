/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.Setting.SettingAnother;

import FXML.Setting.FXMLSettingController;
import analyzer.code.AnalyzerCode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLSettingAnotherController implements Initializable {


    /**
     * Initializes the controller class.
     */

    @FXML
    CheckBox checkBoxWriteDB;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Properties props = new Properties();
        InputStream is = null;

        try {
            is = new FileInputStream(FXMLSettingController.PATH_CONFIG_FILE);
            try {
                props.load(is);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnalyzerCode.class.getName()).log(Level.SEVERE, null, ex);
        }
//а вот сама загрузка состояния флажка

        checkBoxWriteDB.setSelected("true".equals(props.getProperty("WriteDBEnable")));
    }

    public CheckBox getCheckBoxWriteDB() {
        return checkBoxWriteDB;
    }
}

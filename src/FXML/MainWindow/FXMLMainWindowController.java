/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.MainWindow;

import analyzer.code.AnalyzePlagiatSystem;
import analyzer.code.AnalyzerC;
import analyzer.code.LanguagePrograming;
import com.sun.javafx.collections.ElementObservableListDecorator;
import com.sun.javafx.collections.ObservableListWrapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ObservableListValue;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.DirectoryChooser;
import languageProg.LanguageProg;
import org.apache.commons.io.FilenameUtils;
import parsers.Java.JavaParser;

import javax.swing.DefaultComboBoxModel;

/**
 * FXML Controller class
 *
 * @author tigler
 */
public class FXMLMainWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Button buttonOpen1;
    @FXML
    Button buttonOpen2;
    @FXML
    Button buttonCalcDB1;
    @FXML
    Button buttonCalcDB2;
    @FXML
    Button buttonAnalyzeProjects;
    @FXML
    Button buttonFullAnalyze;
    @FXML
    TreeView treeView1;
    @FXML
    TreeView treeView2;
    @FXML
    TextField textFieldPath1;
    @FXML
    TextField textFieldPath2;
    @FXML
    Tab tabProjectBD;
    @FXML
    Tab tabProjectProject;
    @FXML
    ComboBox comboBoxLang1;
    @FXML
    ComboBox comboBoxLang2;

    private boolean selectFirstProject;
    private boolean selectSecondProject;

    private AnalyzePlagiatSystem analyzePlagiatSystem;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String os = System.getProperty("os.version").toLowerCase();
        System.out.print(os);
        selectFirstProject = false;
        selectSecondProject = false;
        buttonAnalyzeProjects.setDisable(true);
        analyzePlagiatSystem = new AnalyzePlagiatSystem();
        ArrayList<LanguagePrograming> listLanguages = analyzePlagiatSystem.initLanguages();
        List listLang = new ArrayList();
        for (LanguagePrograming lang : listLanguages) {
            listLang.add(lang.getName());
        }
        ObservableList ol = new ObservableListWrapper(listLang);
        comboBoxLang1.setItems(ol);
        comboBoxLang1.getSelectionModel().select(0);

        comboBoxLang2.setItems(ol);
        comboBoxLang2.getSelectionModel().select(0);


        /**
         * Событие при нажитии кнопки открытия проекта для первой панели
         */
        buttonOpen1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DirectoryChooser dc = new DirectoryChooser();
                dc.setInitialDirectory(new File(System.getProperty("user.home")));
                File choice = dc.showDialog(null);
                if (choice == null || !choice.isDirectory()) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setHeaderText("Could not open directory");
                    alert.setContentText("The file is invalid.");
                    alert.showAndWait();
                } else {
                    analyzePlagiatSystem.setFirstAnalyzer(listLanguages.get(comboBoxLang1.getSelectionModel()
                            .getSelectedIndex()).getCode());
                    File[] files = choice.listFiles();
                    ArrayList<String> pathFiles = new ArrayList<>();
                    for (File file : files) {
                        if (FilenameUtils.getExtension(file.getAbsolutePath()).equals(listLanguages.get(comboBoxLang1.getSelectionModel()
                                .getSelectedIndex()).getExtension())) {
                            pathFiles.add(file.getAbsolutePath());
                            selectFirstProject = true;
                            if (selectFirstProject && selectSecondProject) {
                                buttonAnalyzeProjects.setDisable(false);
                            }
                            try (Scanner scanner = new Scanner(file)) {
                                analyzePlagiatSystem.parsingFirst(file.getAbsolutePath());
                                //nameFile.add(FilenameUtils.getName(file.getAbsolutePath()));

                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }

                        }
                    }

                    analyzePlagiatSystem.setFirstFiles(pathFiles);
                    textFieldPath1.setText(choice.getPath());
                    treeView1.setRoot(getNodesForDirectory(choice));
                }
            }
        });

        /**
         * Событие при нажитии кнопки открытия проекта для второй панели
         */
        buttonOpen2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                DirectoryChooser dc = new DirectoryChooser();
                dc.setInitialDirectory(new File(System.getProperty("user.home")));
                File choice = dc.showDialog(null);
                if (choice == null || !choice.isDirectory()) {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setHeaderText("Could not open directory");
                    alert.setContentText("The file is invalid.");

                    alert.showAndWait();
                } else {
                    analyzePlagiatSystem.setSecondAnalyzer(listLanguages.get(comboBoxLang2.getSelectionModel()
                            .getSelectedIndex()).getCode());
                    File[] files = choice.listFiles();
                    for (File file : files) {
                        if (FilenameUtils.getExtension(file.getAbsolutePath()).equals(listLanguages.get(comboBoxLang2.getSelectionModel()
                                .getSelectedIndex()).getExtension())) {
                            selectSecondProject = true;
                            if (selectFirstProject && selectSecondProject) {
                                buttonAnalyzeProjects.setDisable(false);
                            }
                            try (Scanner scanner = new Scanner(file)) {
                                analyzePlagiatSystem.parsingSecond(file.getAbsolutePath());
                                //nameFile.add(FilenameUtils.getName(file.getAbsolutePath()));
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }

                        }
                    }
                    textFieldPath2.setText(choice.getPath());
                    treeView2.setRoot(getNodesForDirectory(choice));
                }
            }
        });

        /**
         * Событие при нажитии кнопки Анализ проектов
         */
        buttonAnalyzeProjects.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                analyzePlagiatSystem.analyzeProjects();

            }
        });

        /**
         * Событие при нажитии кнопки открытия проекта для первой панели
         */
        buttonCalcDB1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                analyzePlagiatSystem.analyzeProjects();

            }
        });

        /**
         * Событие при нажитии кнопки полной проверки
         */
        buttonFullAnalyze.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                analyzePlagiatSystem.fullAnalyze();

            }
        });
    }

    public TreeItem<String> getNodesForDirectory(File directory) { //Returns a TreeItem representation of the specified directory
        TreeItem<String> root = new TreeItem<String>(directory.getName());
        for (File f : directory.listFiles()) {
            //System.out.println("Loading " + f.getName());
            if (f.isDirectory()) { //Then we call the function recursively
                root.getChildren().add(getNodesForDirectory(f));
            } else {
                root.getChildren().add(new TreeItem<String>(f.getName()));
            }
        }
        return root;
    }

}

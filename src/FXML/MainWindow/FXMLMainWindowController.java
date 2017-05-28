/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXML.MainWindow;

import FXML.AuthorProject.FXMLAuthorProjectController;
import FXML.ReportPlagiat.ReportDB.FXMLReportDBController;
import FXML.Setting.FXMLSettingController;
import analyzer.ProjectProgramm;
import analyzer.code.*;
import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;

/**
 * FXML контроллер главного окна программы
 *
 * @author tigler
 */
public class FXMLMainWindowController implements Initializable {

    @FXML
    MenuItem openProjFirstMenu;
    @FXML
    MenuItem openProjSecondMenu;
    @FXML
    MenuItem menuExit;
    @FXML
    MenuItem settingMenu;
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
    ComboBox comboBoxLang1;
    @FXML
    ComboBox comboBoxLang2;


    private boolean selectFirstProject; //открыт ли первый проект
    private boolean selectSecondProject; //открыт ли второй проект


    private AnalyzePlagiatSystem analyzePlagiatSystem; // фасад - анализатор плагиата
    private ArrayList<LanguagePrograming> listLanguages; // список языков программирования для анализа

    public void onEventInWindowAuthor() {
        //analyzePlagiatSystem.firstProjCompareDB();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //проекты не открыты
        selectFirstProject = false;
        selectSecondProject = false;
        //кнопки анализа не активны пока не открыты проекты
        buttonAnalyzeProjects.setDisable(true);
        buttonFullAnalyze.setDisable(true);
        buttonCalcDB1.setDisable(true);
        buttonCalcDB2.setDisable(true);

        analyzePlagiatSystem = new AnalyzePlagiatSystem();

        listLanguages = analyzePlagiatSystem.initLanguages();//инициализация списка языков
        //заполнение комбобоксов списком языков
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
                boolean open = openProjectFirst();
                if (open) {
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

                    //записывать в БД проект, если в найстройках установлен флаг
                    if ("true".equals(props.getProperty("WriteDBEnable"))) {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/AuthorProject/FXMLAuthorProject.fxml"));
                        try {
                            AnchorPane pane = (AnchorPane) loader.load();
                            FXMLAuthorProjectController fxmlAuthorProjectController = loader.getController();
                            fxmlAuthorProjectController.setProject(analyzePlagiatSystem.getFirstAnalyzer());
                            fxmlAuthorProjectController.setPlagiatSystem(analyzePlagiatSystem);
                            if (analyzePlagiatSystem.getFirstAnalyzer().getProjectProgramm().getName() == null) {

                            }
                            Scene scene = new Scene(pane);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setTitle("Информация о проекте");
                            stage.show();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                    }
                }
            }
        });

        /**
         * Событие при нажитии кнопки открытия проекта для второй панели
         */
        buttonOpen2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                boolean open = openProjSecond();
                if (open) {
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

                    //записывать в БД проект, если в найстройках установлен флаг
                    if ("true".equals(props.getProperty("WriteDBEnable"))) {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/AuthorProject/FXMLAuthorProject.fxml"));
                        try {
                            AnchorPane pane = (AnchorPane) loader.load();
                            FXMLAuthorProjectController fxmlAuthorProjectController = loader.getController();
                            fxmlAuthorProjectController.setProject(analyzePlagiatSystem.getSecondAnalyzer());
                            fxmlAuthorProjectController.setPlagiatSystem(analyzePlagiatSystem);
                            Scene scene = new Scene(pane);
                            Stage stage = new Stage();
                            stage.setScene(scene);
                            stage.setTitle("Информация о проекте");
                            stage.show();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                    }
                }
            }
        });


        /**
         * Событие при нажитии кнопки сравнения первого проекта и БД
         */
        buttonCalcDB1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ConnectorDB.getConnection();
                ArrayList<ProjectDB> projectsDB = analyzePlagiatSystem.readResultAnalyzeDB();
                ArrayList<ResultCompareWithDB> resultsCompareWithDB = analyzePlagiatSystem.compareWithDB(analyzePlagiatSystem.getFirstAnalyzer(), 1, projectsDB);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/ReportDB/FXMLReportDB.fxml"));
                try {
                    AnchorPane pane = (AnchorPane) loader.load();
                    FXMLReportDBController fxmlReportDBController = loader.getController();
                    fxmlReportDBController.setResult(resultsCompareWithDB);
                    Scene scene = new Scene(pane);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Отчет анализа проекта и БД");
                    stage.show();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        /**
         *  Событие при нажитии кнопки сравнения второго проекта и БД
         */
        buttonCalcDB2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ConnectorDB.getConnection();
                ArrayList<ProjectDB> projectsDB = analyzePlagiatSystem.readResultAnalyzeDB();
                ArrayList<ResultCompareWithDB> resultsCompareWithDB = analyzePlagiatSystem.compareWithDB(analyzePlagiatSystem.getSecondAnalyzer(), 2, projectsDB);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ReportPlagiat/ReportDB/FXMLReportDB.fxml"));
                try {
                    AnchorPane pane = (AnchorPane) loader.load();
                    FXMLReportDBController fxmlReportDBController = loader.getController();
                    fxmlReportDBController.setResult(resultsCompareWithDB);
                    Scene scene = new Scene(pane);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Отчет анализа проекта и БД");
                    stage.show();
                } catch (Exception ex) {
                    ex.printStackTrace();
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
         * Событие при нажитии кнопки полной проверки
         */
        buttonFullAnalyze.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                switch (listLanguages.get(comboBoxLang1.getSelectionModel().getSelectedIndex()).getCode()) {
                    case LanguagePrograming.LANG_JAVA:
                    case LanguagePrograming.LANG_CPP:
                    case LanguagePrograming.LANG_CSHARP:
                    case LanguagePrograming.LANG_PYTHON3:
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setHeaderText("Динамический анализ не доступен в этой версии программы для языка " + listLanguages.get(comboBoxLang1.getSelectionModel()
                                .getSelectedIndex()).getName());
                        alert.showAndWait();
                        return;
                    default:
                        break;
                }
                analyzePlagiatSystem.fullAnalyze();
            }
        });


        /**
         * Событие при нажитии кнопки открытия первого проекта в меню
         */
        openProjFirstMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                openProjectFirst();
            }
        });

        /**
         * Событие при нажитии кнопки открытия второго проекта в меню
         */
        openProjSecondMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                openProjSecond();
            }
        });

        /**
         * Событие при нажитии пункта меню выход
         */
        menuExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.exit(0);
            }
        });

        /**
         * Событие при нажитии пункта меню настройки
         */
        settingMenu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Setting/FXMLSetting.fxml"));
                try {
                    AnchorPane pane = (AnchorPane) loader.load();
                    Scene scene = new Scene(pane);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("Настройки");
                    stage.show();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        /**
         * Событие при активации комбобокса первого проекта
         */
        comboBoxLang1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectFirstProject = false;
                textFieldPath1.setText("");
                treeView1.setRoot(null);
                buttonFullAnalyze.setDisable(true);
                buttonAnalyzeProjects.setDisable(true);
            }
        });

        /**
         * Событие при активации комбобокса второго проекта
         */
        comboBoxLang2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectSecondProject = false;
                textFieldPath2.setText("");
                treeView2.setRoot(null);
                buttonFullAnalyze.setDisable(true);
                buttonAnalyzeProjects.setDisable(true);
            }
        });
    }

    /**
     * создает дерево файлов для указанного каталога
     *
     * @param directory ссылка на объект типа File, которая является каталогом
     * @return дерево файлов для указанного в параметре каталога
     */
    public TreeItem<String> getNodesForDirectory(File directory) {
        TreeItem<String> root = new TreeItem<String>(directory.getName());
        for (File f : directory.listFiles()) {
            if (f.isDirectory()) {
                root.getChildren().add(getNodesForDirectory(f));
            } else {
                root.getChildren().add(new TreeItem<String>(f.getName()));
            }
        }
        return root;
    }

    private ArrayList<String> sortOutFilesRecFirst(File choice, ArrayList<String> pathFiles) {
        for (File file : choice.listFiles()) {
            if (file.isDirectory()) {
                pathFiles = sortOutFilesRecFirst(file, pathFiles);
            } else {
                if (FilenameUtils.getExtension(file.getAbsolutePath()).equals(listLanguages.get(comboBoxLang1.getSelectionModel()
                        .getSelectedIndex()).getExtension())) {
                    pathFiles.add(file.getAbsolutePath());
                    selectFirstProject = true;
                    if (selectFirstProject) {
                        buttonCalcDB1.setDisable(false);
                    }
                    if (selectFirstProject && selectSecondProject) {
                        buttonAnalyzeProjects.setDisable(false);
                        if (listLanguages.get(comboBoxLang1.getSelectionModel()
                                .getSelectedIndex()).getCode() == listLanguages.get(comboBoxLang2.getSelectionModel()
                                .getSelectedIndex()).getCode()) {
                            buttonFullAnalyze.setDisable(false);
                        }
                    }
                    try (Scanner scanner = new Scanner(file)) {
                        analyzePlagiatSystem.parsingFirst(file.getAbsolutePath());
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

                }
            }
        }
        return pathFiles;
    }

    /**
     * открывает первый проект для выбранного языка програмирования, осуществляет статический анализ,
     * выводит дерево проекта и путь к проекту
     *
     * @return был ли открыт проект
     */
    private boolean openProjectFirst() {
        ArrayList<String> pathFiles = null;
        DirectoryChooser dc = new DirectoryChooser();
        dc.setInitialDirectory(new File(System.getProperty("user.home")));
        File choice = dc.showDialog(null);
        if (choice == null || !choice.isDirectory()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Не удалось открыть каталог");
            alert.setTitle("Выбор проекта");
            alert.showAndWait();
            return false;
        } else {
            analyzePlagiatSystem.setFirstAnalyzer(listLanguages.get(comboBoxLang1.getSelectionModel()
                    .getSelectedIndex()).getCode());
            //File[] files = choice.listFiles();
            String[] pathSplit = choice.getAbsolutePath().split("/");
            pathFiles = new ArrayList<>();
            pathFiles = sortOutFilesRecFirst(choice, pathFiles);

            if (!selectFirstProject) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Выбор проекта");
                alert.setHeaderText("В указанном каталоге нет ни одного исходного кода языка " + listLanguages.get(comboBoxLang1.getSelectionModel()
                        .getSelectedIndex()).getName());
                alert.showAndWait();
                return false;
            }


            ProjectProgramm projectProgramm = new ProjectProgramm(pathSplit[pathSplit.length - 1]);
            projectProgramm.setPathsSrc(pathFiles);
            analyzePlagiatSystem.getFirstAnalyzer().setProjectProgramm(projectProgramm);
            textFieldPath1.setText(choice.getPath());
            treeView1.setRoot(getNodesForDirectory(choice));
        }
        return true;
    }


    /**
     * открывает второй проект для выбранного языка програмирования, осуществляет статический анализ,
     * выводит дерево проекта и путь к проекту
     *
     * @return был ли открыт проект
     */
    private boolean openProjSecond() {
        DirectoryChooser dc = new DirectoryChooser();
        dc.setInitialDirectory(new File(System.getProperty("user.home")));
        File choice = dc.showDialog(null);
        if (choice == null || !choice.isDirectory()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Не удалось открыть каталог");
            alert.setTitle("Выбор проекта");
            alert.showAndWait();
            return false;
        } else {
            analyzePlagiatSystem.setSecondAnalyzer(listLanguages.get(comboBoxLang2.getSelectionModel()
                    .getSelectedIndex()).getCode());
            File[] files = choice.listFiles();
            String[] pathSplit = choice.getAbsolutePath().split("/");
            ArrayList<String> pathFiles = new ArrayList<>();
            for (File file : files) {
                if (FilenameUtils.getExtension(file.getAbsolutePath()).equals(listLanguages.get(comboBoxLang2.getSelectionModel()
                        .getSelectedIndex()).getExtension())) {
                    pathFiles.add(file.getAbsolutePath());
                    selectSecondProject = true;
                    if (selectSecondProject) {
                        buttonCalcDB2.setDisable(false);
                    }
                    if (selectFirstProject && selectSecondProject) {
                        buttonAnalyzeProjects.setDisable(false);
                        if (listLanguages.get(comboBoxLang1.getSelectionModel()
                                .getSelectedIndex()).getCode() == listLanguages.get(comboBoxLang2.getSelectionModel()
                                .getSelectedIndex()).getCode()) {
                            buttonFullAnalyze.setDisable(false);
                        }
                    }
                    try (Scanner scanner = new Scanner(file)) {
                        analyzePlagiatSystem.parsingSecond(file.getAbsolutePath());
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

                }
            }
            if (!selectSecondProject) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setHeaderText("В указанном каталоге нет ни одного исходного кода языка " + listLanguages.get(comboBoxLang2.getSelectionModel()
                        .getSelectedIndex()).getName());
                alert.setTitle("Выбор проекта");
                alert.showAndWait();
                return false;
            }
            ProjectProgramm projectProgramm = new ProjectProgramm(pathSplit[pathSplit.length - 1]);
            projectProgramm.setPathsSrc(pathFiles);
            analyzePlagiatSystem.getSecondAnalyzer().setProjectProgramm(projectProgramm);
            textFieldPath2.setText(choice.getPath());
            treeView2.setRoot(getNodesForDirectory(choice));
        }
        return true;
    }


}

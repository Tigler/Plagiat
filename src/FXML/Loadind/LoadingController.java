package FXML.Loadind;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class LoadingController {


    @FXML
    private ProgressBar progressBar;

    @FXML
    public void initialize() {
    }

    /**
     * Закрытие окна
     */
    public void closeStage() {
        Stage stage = (Stage) progressBar.getScene().getWindow();
        stage.close();
    }
}

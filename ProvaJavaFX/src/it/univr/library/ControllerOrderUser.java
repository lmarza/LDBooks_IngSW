package it.univr.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerOrderUser {

    @FXML
    private VBox orderVBox;

    @FXML
    private Button catalogButton;

    @FXML
    private Button chartsButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private Button orderStatusForUnregisteredUserButton;

    @FXML
    private ImageView cartImageView;

    @FXML
    private void initialize()
    {
        catalogButton.setOnAction(this::handleCatalogButton); //setto il listener
        chartsButton.setOnAction(this::handleChartsButton);
        //logoutButton.setOnAction(this::handleLogOutButton);
        cartImageView.setOnMouseClicked(this::handleCartImageView);
    }

    private void handleLogOutButton(ActionEvent actionEvent)
    {

    }

    private void handleCartImageView(MouseEvent mouseEvent)
    {

    }

    private void handleNameSurnameHyperlink(ActionEvent actionEvent)
    {

    }


    private void handleCatalogButton(ActionEvent event)
    {
        StageManager catalogStage = new StageManager();
        catalogStage.setStageCatalog((Stage) catalogButton.getScene().getWindow());
    }

    private void handleChartsButton(ActionEvent event)
    {
        StageManager chartsStage = new StageManager();
        chartsStage.setStageCharts((Stage) chartsButton.getScene().getWindow(), "hello");
    }

}

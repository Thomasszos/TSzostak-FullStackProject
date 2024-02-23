package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class fullStackController {

    @FXML
    private AnchorPane anpBase;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private ImageView ivProfilePic;

    @FXML
    private Menu mbEdit;

    @FXML
    private Menu mbFile;

    @FXML
    private Menu mbHelp;

    @FXML
    private Menu mbTheme;

    @FXML
    private MenuItem miCreamCyan;

    @FXML
    private MenuItem miCreamMaroon;

    @FXML
    private MenuItem miNone;

    @FXML
    private MenuBar mnBar;

    @FXML
    private TextField tfDepartment;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfFirstName2;

    @FXML
    private TextField tfLastName;

    @FXML
    private TextField tfMajor;

    @FXML
    private TableView<?> tvPeople;

    @FXML
    private VBox vbBase;

    @FXML
    private VBox vbLeft;

    @FXML
    private VBox vbMid;

    @FXML
    private VBox vbRight;


    @FXML
    void miSetCreamCyan(ActionEvent event) {
        vbBase.getScene().getStylesheets().clear();
        vbBase.getScene().getStylesheets().add("/view/CreamCyan.css");
    }

    @FXML
    void miSetCreamMaroon(ActionEvent event) {
      //  String css = this.getClass().getResource("/view/CreamCyan.css").toExternalForm();
        vbBase.getScene().getStylesheets().clear();
        vbBase.getScene().getStylesheets().add("/view/CreamMaroon.css");
    }

    @FXML
    void miSetNone(ActionEvent event) {
        vbBase.getScene().getStylesheets().clear();
    }

}

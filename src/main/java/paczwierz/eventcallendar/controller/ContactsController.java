package paczwierz.eventcallendar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ContactsController {

    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private Button saveButton;
    @FXML
    private Button DeleteButton;
    @FXML
    private Button addButton; //może nie być potrzebny


    public void saveContact(ActionEvent event) {
        try {
            String nameText = name.getText();
            String surnameText = surname.getText();
            String emailText = email.getText();
            String phoneText = phone.getText();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private Parent root;

    public void goToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/paczwierz/eventcallendar/view/HomeView.fxml")));
        Stage stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

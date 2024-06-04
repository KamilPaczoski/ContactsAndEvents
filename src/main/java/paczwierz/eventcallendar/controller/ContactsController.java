package paczwierz.eventcallendar.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import paczwierz.eventcallendar.model.Contact;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;
import java.util.Objects;


/**
 This class is the controller for the Contacts view in ours application.
 */
public class ContactsController implements Initializable {
    @FXML
    public TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private TextField shoesize;
    @FXML
    private ChoiceBox<String> category;
    @FXML
    private Button saveButton;
    @FXML
    private Button DeleteButton;
    @FXML
    private Button addButton;


    public void saveContact(ActionEvent event) {
        try {
            String nameText = name.getText();
            String surnameText = surname.getText();
            String emailText = email.getText();
            String phoneText = phone.getText();
            String categoryText = category.getValue();

            Contact contact = new Contact(null, nameText, surnameText, emailText, phoneText, categoryText);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addContact(ActionEvent event) {
        try {
            name.clear();
            surname.clear();
            email.clear();
            phone.clear();
            shoesize.clear();
            category.setValue("Other");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteContact(ActionEvent event) {
        try {
            name.clear();
            surname.clear();
            email.clear();
            phone.clear();
            shoesize.clear();
            category.setValue("Other");
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceCategory();
    }

    private void choiceCategory() {
        try {
            category.getItems().addAll("Family", "Friends", "Work", "Other");
            category.setValue("Other");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
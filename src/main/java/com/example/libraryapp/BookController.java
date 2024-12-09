package com.example.libraryapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BookController {
    @FXML
    private Button groupbook;
    @FXML
    public void showAllBooks(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("booksView.fxml"));
        Parent root = loader.load();

        // Transition to the book list view
        Stage stage = (Stage) groupbook.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}

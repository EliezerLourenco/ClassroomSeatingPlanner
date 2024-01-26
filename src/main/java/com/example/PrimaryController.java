package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class PrimaryController {

    public Button AddButton;
    public Text Heading;
    @FXML private Rectangle Seat1, Seat2, Seat3, Seat4, Seat5, Seat6, Seat7, Seat8, Seat9;
    @FXML private TextField inputName;
    @FXML private ColorPicker ColorPicker;

    /**
     * This method is called by the FXMLLoader when initialization is complete.
     * Use this method to perform any required initialization after the FXML elements are loaded.
     */
    @FXML
    private void initialize() {
        // Initialization logic (if necessary)
    }

    /**
     * Event handler for the 'Add Student' button.
     * Assigns a color to the first available seat.
     */
    @FXML
    private void addStudent() {
        // Get the name and color from the input fields
        String name = inputName.getText();
        Color color = ColorPicker.getValue();

        // Logic to assign the color to the first available seat
        if (isSeatAvailable(Seat1)) {
            Seat1.setFill(color);
        } else if (isSeatAvailable(Seat2)) {
            Seat2.setFill(color);
        } else if (isSeatAvailable(Seat3)) {
            Seat3.setFill(color);
        } else if (isSeatAvailable(Seat4)) {
            Seat4.setFill(color);
        } else if (isSeatAvailable(Seat5)) {
            Seat5.setFill(color);
        } else if (isSeatAvailable(Seat6)) {
            Seat6.setFill(color);
        } else if (isSeatAvailable(Seat7)) {
            Seat7.setFill(color);
        } else if (isSeatAvailable(Seat8)) {
            Seat8.setFill(color);
        } else if (isSeatAvailable(Seat9)) {
            Seat9.setFill(color);
        } else {
       
        }

    }

    /**
     * Checks if a seat is available (i.e., not yet colored).
     *
     * @param seat The seat to check.
     * @return true if the seat is available, false otherwise.
     */
    private boolean isSeatAvailable(Rectangle seat) {
        return seat != null && seat.getFill().equals(Color.WHITE);
    }
    
}

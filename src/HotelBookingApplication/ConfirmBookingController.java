package HotelBookingApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConfirmBookingController {
    @FXML
    Button backBtn, confirmBookingBtn;

    @FXML
    Label showCheckIn, showCheckOut, showRoomType, showTotalPrice;

    @FXML
    TextField nameField, surnameField, emailField, phoneField;
}

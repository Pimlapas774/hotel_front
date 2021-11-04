package HotelBookingApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HomeController {
    @FXML
    ChoiceBox destination;

    @FXML
    DatePicker checkIn, checkOut;

    @FXML
    Spinner guest;

    @FXML
    Button searchBtn, checkBookingBtn;

    ObservableList<String> placesList = FXCollections.observableArrayList("Pattaya", "Hua Hin");

    @FXML
    public void initialize() throws Exception {
        destination.setItems(placesList);
        guest.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 0));
    }

}

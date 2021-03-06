package HotelBookingApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class checkBookingController {
    @FXML
    Button backBtn, checkBtn;

    @FXML
    TextField phoneField;

    @FXML
    ListView showBooking;



    public void ActionOnBackBtn(ActionEvent event) throws IOException {
        backBtn = (Button) event.getSource();
        Stage stage = (Stage) backBtn.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        stage.setScene(new Scene(loader.load()));
    }

    public void ActionOnCheckBtn(ActionEvent event) {
        showBooking.getItems().clear();
        if(phoneField.getText().isEmpty()){
            showBooking.getItems().add("!!! กรอกเบอร์โทรของผู้ที่ทำการจอง ก่อนนะ !!!");
        }else{
            showBooking.getItems().add("!!! โบ๋เบ๋ ไม่มีข้อมูล !!!");
        }
    }
}

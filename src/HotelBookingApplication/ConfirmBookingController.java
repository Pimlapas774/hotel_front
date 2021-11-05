package HotelBookingApplication;

import HotelBookingApplication.model.Hotel;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ConfirmBookingController {
    @FXML
    Button backBtn, confirmBookingBtn;

    @FXML
    Label showCheckIn, showCheckOut, showRoomType, showTotalPrice;

    @FXML
    TextField nameField, surnameField, emailField, phoneField;

    private Hotel hotel;
    private LocalDate checkin, checkout;
    private float total_price;
    private String roomtype;
    private String previous_page;
    private int guest;
    private ArrayList<Hotel> hotels;

    public void setter(Hotel hotel,LocalDate checkin,LocalDate checkout,String roomtype,float total_price){
        this.hotel = hotel;
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomtype = roomtype;
        this.total_price = total_price;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    public void setPrevious_page(String previous_page){
        this.previous_page = previous_page;
    }

    @FXML
    public void initialize(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                showCheckIn.setText(checkin.format(DateTimeFormatter.ofPattern("dd-MM-yy")));
                showCheckOut.setText(checkout.format(DateTimeFormatter.ofPattern("dd-MM-yy")));
                showRoomType.setText(roomtype);
                showTotalPrice.setText(total_price+" THB");
            }
        });
    }


    public void ActionOnBackBtn(ActionEvent event) throws IOException {
        backBtn = (Button) event.getSource();
        Stage stage = (Stage) backBtn.getScene().getWindow();
        if(previous_page.equals("RT01") || previous_page.equals("RT02")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelPattaya01.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelPattaya01Controller pattaya01Controller = loader.getController();
            pattaya01Controller.setHotel(hotel);
            pattaya01Controller.setDate(checkin,checkout);
            pattaya01Controller.setGuest(guest);
            pattaya01Controller.setHotels(hotels);

        }else if(previous_page.equals("RT03") || previous_page.equals("RT04")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelPattaya02.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelPattaya02Controller pattaya02Controller = loader.getController();
            pattaya02Controller.setHotel(hotel);
            pattaya02Controller.setDate(checkin,checkout);
            pattaya02Controller.setGuest(guest);
            pattaya02Controller.setHotels(hotels);

        }else if(previous_page.equals("RT05") || previous_page.equals("RT06")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelPattaya03.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelPattaya03Controller pattaya03Controller = loader.getController();
            pattaya03Controller.setHotel(hotel);
            pattaya03Controller.setDate(checkin,checkout);
            pattaya03Controller.setGuest(guest);
            pattaya03Controller.setHotels(hotels);

        }else if(previous_page.equals("RT07") || previous_page.equals("RT08")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelHuaHin01.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelHuaHin01Controller huaHin01Controller = loader.getController();
            huaHin01Controller.setHotel(hotel);
            huaHin01Controller.setDate(checkin,checkout);
            huaHin01Controller.setGuest(guest);
            huaHin01Controller.setHotels(hotels);

        }else if(previous_page.equals("RT09") || previous_page.equals("RT10")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelHuaHin02.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelHuaHin02Controller huaHin02Controller = loader.getController();
            huaHin02Controller.setHotel(hotel);
            huaHin02Controller.setDate(checkin,checkout);
            huaHin02Controller.setGuest(guest);
            huaHin02Controller.setHotels(hotels);

        }else if(previous_page.equals("RT11") || previous_page.equals("RT12")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HotelHuaHin03.fxml"));
            stage.setScene(new Scene(loader.load()));
            HotelHuaHin03Controller huaHin03Controller = loader.getController();
            huaHin03Controller.setHotel(hotel);
            huaHin03Controller.setDate(checkin,checkout);
            huaHin03Controller.setGuest(guest);
            huaHin03Controller.setHotels(hotels);
        }

    }

    public void ActionOnConfirmBookingBtn(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Booking");
        alert.setContentText("Complete!!!");
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }
}

module com.example.oetk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oetk to javafx.fxml;
    exports com.example.oetk;
}
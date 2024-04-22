module org.example.supplyanddemand {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.supplyanddemand to javafx.fxml;
    exports org.example.supplyanddemand;
}
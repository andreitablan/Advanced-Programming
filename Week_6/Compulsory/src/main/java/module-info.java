module com.example.compulsor {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.compulsor to javafx.fxml;
    exports com.example.compulsor;
}
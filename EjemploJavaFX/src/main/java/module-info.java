module com.decroly.ejemplojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.decroly.ejemplojavafx to javafx.fxml;
    exports com.decroly.ejemplojavafx;
}
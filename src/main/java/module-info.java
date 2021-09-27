module com.hibernate.cl200462_hibernate_lpm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hibernate.cl200462_hibernate_lpm to javafx.fxml;
    exports com.hibernate.cl200462_hibernate_lpm;
}
module paczwierz.eventcallendar {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.persistence;
    requires java.sql;
    opens paczwierz.eventcallendar.controller to javafx.fxml;
    opens paczwierz.eventcallendar to javafx.fxml;
    exports paczwierz.eventcallendar;
}
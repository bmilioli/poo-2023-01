module com.github.bmilioli.poo.t11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.bmilioli.poo.t11 to javafx.fxml;
    exports com.github.bmilioli.poo.t11;
}
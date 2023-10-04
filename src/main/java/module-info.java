module com.mycompany.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.hellofx to javafx.fxml;
    exports com.mycompany.hellofx;
}

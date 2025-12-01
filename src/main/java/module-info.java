module com.research {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.research to javafx.fxml;
    exports com.research;
}

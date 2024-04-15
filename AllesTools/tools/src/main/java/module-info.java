module allesekar {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens allesekar to javafx.fxml;
    exports allesekar;
}

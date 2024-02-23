module com.example.tszostakfullstackproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tszostakfullstackproject to javafx.fxml;
    exports com.example.tszostakfullstackproject;
}
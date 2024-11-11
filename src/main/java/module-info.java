module org.example.concurrencyandjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.concurrencyandjavafx to javafx.fxml;
    exports org.example.concurrencyandjavafx;
}
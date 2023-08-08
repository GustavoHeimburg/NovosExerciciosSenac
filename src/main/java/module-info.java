module com.example.javaexercicios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaexercicios to javafx.fxml;
    exports com.example.javaexercicios;
}
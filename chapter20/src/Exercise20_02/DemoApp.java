package Exercise20_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DemoApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("OK");

        Scene scene = new Scene(button, 200, 200);
        stage.setTitle("test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DemoApp extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("TEST");

        Scene scene = new Scene(button, 200, 200);
        stage.setTitle("TEEST");
        stage.setScene(scene);
        stage.show();
    }
}

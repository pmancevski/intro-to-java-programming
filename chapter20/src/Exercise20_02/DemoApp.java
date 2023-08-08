package Exercise20_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DemoApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StoreNumbersController storeNumbersController = new StoreNumbersController();

        Scene scene = new Scene(storeNumbersController.getPane());
        stage.setTitle("test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

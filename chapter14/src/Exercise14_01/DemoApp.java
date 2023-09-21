package Exercise14_01;

import Exercise14_01.model.DisplayImageController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        DisplayImageController imageController = new DisplayImageController();

        Scene scene = new Scene(imageController);
        stage.setTitle("Display flags");
        stage.setScene(scene);
        stage.show();
    }
}

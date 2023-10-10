package Exercise14_03;

import Exercise14_02.controllers.TicTacToeController;
import Exercise14_03.controllers.ThreeCardsController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(ThreeCardsController.getPane());
        stage.setTitle("Three cards Board");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

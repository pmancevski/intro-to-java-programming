package Exercise14_02;

import Exercise14_02.controllers.TicTacToeController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoApp extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(TicTacToeController.getPane());
        stage.setTitle("Tic Tac Toe Board");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

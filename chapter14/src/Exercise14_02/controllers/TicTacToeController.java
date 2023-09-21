package Exercise14_02.controllers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Cell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.util.Random;

public class TicTacToeController extends GridPane {
    private ImageView[][] imageViews;
    private Random random;

    public TicTacToeController(){
        random = new Random();
        imageViews = new ImageView[3][3];

        for (int row = 0; row < imageViews.length; row++){
            for (int column = 0; column < imageViews[row].length; column++){
                int ran = random.nextInt(3);
                if (ran == 1){
                    imageViews[row][column] = new ImageView(new Image("image/o.gif" ));
                }
                else if (ran == 2){
                    imageViews[row][column] = new ImageView(new Image("image/x.gif" ));
                }
                else {
                    imageViews[row][column] = new ImageView();
                }

                add(imageViews[row][column], row, column);
            }
        }

        int rowCount = 3;
        int columnCount = 3;

        RowConstraints rc = new RowConstraints();

        for (int i = 0; i < rowCount; i++) {
            getRowConstraints().add(rc);
        }

        ColumnConstraints cc = new ColumnConstraints();

        for (int i = 0; i < columnCount; i++) {
            getColumnConstraints().add(cc);
        }

        setAlignment(Pos.CENTER);
        setPadding(new Insets(7, 7, 7, 7));
        setGridLinesVisible(true);
    }

    public static TicTacToeController getPane(){
        return new TicTacToeController();
    }
}

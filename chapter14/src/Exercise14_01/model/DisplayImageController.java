package Exercise14_01.model;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Cell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class DisplayImageController extends GridPane {
    ImageView[][] imageView;

    public DisplayImageController(){
        imageView = new ImageView[2][2];
        int countPics = 0;

        for (int row = 0; row < imageView.length; row++){
            for (int column = 0; column < imageView[row].length; column++){
                imageView[row][column] = new ImageView(new Image("image/flag" + (countPics + 1) + ".gif"));
                countPics++;
                add(imageView[row][column], row, column);
            }
        }

        setAlignment(Pos.CENTER);
        setPadding(new Insets(7, 7, 7, 7));
    }

    public GridPane getPane(){

        return this;
    }
}

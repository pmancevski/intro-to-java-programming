package Exercise14_03.controllers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeCardsController extends FlowPane {
    private List<ImageView> imageViews;
    public ThreeCardsController(){
        imageViews = new ArrayList<>();

        for (int count = 1; count <= 52; count++){
           imageViews.add(new ImageView(new Image("image/card/" + count + ".png")));
        }

        Collections.shuffle(imageViews);

        getChildren().addAll(imageViews.get(0), imageViews.get(1), imageViews.get(2));
        setPadding(new Insets(7, 7, 7, 7));
        setAlignment(Pos.CENTER);
        setHgap(10);
    }

    public static ThreeCardsController getPane(){
        return new ThreeCardsController();
    }
}

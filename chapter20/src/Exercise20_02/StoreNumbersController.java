package Exercise20_02;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StoreNumbersController extends BorderPane {
    private List<Double> numberList;

    private TextField enterNumberTextField;
    private TextArea displayEnteredNumbers;

    private Button sortButton;
    private Button shuffleButton;
    private Button reverseButton;

    public StoreNumbersController(){
        setPadding(new Insets(7, 7, 7, 7));
        setPrefWidth(300);
        setPrefHeight(200);

        numberList = new LinkedList<>();

        enterNumberTextField = new TextField();
        displayEnteredNumbers = new TextArea();
        displayEnteredNumbers.setEditable(false);
        sortButton = new Button("Sort");
        shuffleButton = new Button("Shuffle");
        reverseButton = new Button("Reverse");

        HBox topHBox = new HBox();
        topHBox.setAlignment(Pos.CENTER);
        topHBox.setSpacing(10);
        topHBox.setPadding(new Insets(7, 7, 7, 7));
        topHBox.getChildren().addAll(new Label("Enter a number: "), enterNumberTextField);

        HBox bottomHBox =  new HBox();
        bottomHBox.setAlignment(Pos.CENTER);
        bottomHBox.setSpacing(10);
        bottomHBox.setPadding(new Insets(7, 7, 0, 7));
        bottomHBox.getChildren().addAll(sortButton, shuffleButton, reverseButton);

        setTop(topHBox);
        setCenter(displayEnteredNumbers);
        setBottom(bottomHBox);

        enterNumberTextField.setOnKeyPressed(keyEvent -> {
            if (String.valueOf(keyEvent.getCode()).toLowerCase().equals("enter")){
                if (isNumeric(enterNumberTextField.getText())){
                    double number = Double.parseDouble(enterNumberTextField.getText());

                    if (numberList.contains(number)){
                        enterNumberTextField.setText(number + " is already present");
                        enterNumberTextField.selectAll();
                    }
                    else {
                        numberList.add(number);
                        displayEnteredNumbers.setText(displayNumbers());
                        enterNumberTextField.clear();
                    }
                }
            }
        });

        sortButton.setOnAction(actionEvent -> {
            Collections.sort(numberList);
            displayEnteredNumbers.setText(displayNumbers());
        });

        shuffleButton.setOnAction(actionEvent -> {
            Collections.shuffle(numberList);
            displayEnteredNumbers.setText(displayNumbers());
        });

        reverseButton.setOnAction(actionEvent -> {
            Collections.reverse(numberList);
            displayEnteredNumbers.setText(displayNumbers());
        });
    }

    private boolean isNumeric(String number){
        try {
            double num = Double.parseDouble(number);
        }
        catch (NumberFormatException exc){
            return false;
        }

        return true;
    }

    private String displayNumbers(){
        String string = "";
        for (Number number : numberList){
            string += number + " ";
        }

        return string;
    }

    public BorderPane getPane(){
        return this;
    }
}

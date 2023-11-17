package eu.epfc.labo12.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXCalc extends Application {


    @Override
    public void start(Stage primaryStage) {

        // labels
        Label labelNb1 = new Label("Number 1:");
        TextField textFieldNb1 = new TextField();
        Label labelNb2 = new Label("Number 2:");
        TextField textFieldNb2 = new TextField();
        Label labelResult = new Label("Result :");
        TextField textFieldResult = new TextField();

        HBox boxNumbers = new HBox(labelNb1,textFieldNb1,labelNb2,textFieldNb2,labelResult,textFieldResult);

        //Buttons

        Button buttonAdd = new Button("Add");
        Button buttonSubstract = new Button("Substract");
        Button buttonMultiply = new Button("Multiply");
        Button buttonDivide = new Button("Divide");
        HBox boxButtons = new HBox(buttonAdd,buttonSubstract,buttonMultiply,buttonDivide);

        VBox root = new VBox(boxNumbers,boxButtons);

        Scene scene = new Scene(root);

        textFieldNb1.setPrefColumnCount(2);
        textFieldNb2.setPrefColumnCount(2);
        textFieldResult.setPrefColumnCount(2);

        boxNumbers.setSpacing(10);// entre chaque contenant interieur de la box
        boxNumbers.setSpacing(10);
        root.setPadding(new Insets(5,5,5,5));
        root.setSpacing(5);// entre les boxs
        boxButtons.setAlignment(Pos.CENTER);

        EventHandler<ActionEvent> handler = event -> {
            Double number1 = Double.valueOf(textFieldNb1.getText());
            Double number2 = Double.valueOf(textFieldNb2.getText());
            if (event.getSource() == buttonAdd) {
                textFieldResult.setText(number1 + number2 + "");
            } else if (event.getSource() == buttonSubstract){
                textFieldResult.setText(number1 - number2 + "");
            } else if (event.getSource() == buttonDivide) {
                textFieldResult.setText(number1 / number2 + "");
            } else if (event.getSource() == buttonMultiply){
                textFieldResult.setText(number1 * number2 + "");
            }
        };



        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}

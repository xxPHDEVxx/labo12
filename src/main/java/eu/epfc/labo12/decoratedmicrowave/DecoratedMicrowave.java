package eu.epfc.labo12.decoratedmicrowave;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DecoratedMicrowave extends Application {

    @Override
    public void start(Stage primaryStage) {


        Button bFood = new Button("Food to be placed here");
        TextField textField = new TextField("Time to be displayed here");

        VBox food = new VBox(bFood);
        food.setAlignment(Pos.CENTER);
        GridPane pane = new GridPane();

      /*  for (int i = 1; i<=12; i++){
            Button button = new Button(switch (i){
                case 10 -> "0";
                case 11 -> "Start";
                case 12 -> "Stop";
                default -> i + "";
            }
        } */

        pane.add(new Button("0"),0,3);
        pane.add(new Button("1"),0,0);
        pane.add(new Button("2"),1,0);
        pane.add(new Button("3"),2,0);
        pane.add(new Button("4"),0,1);
        pane.add(new Button("5"),1,1);
        pane.add(new Button("6"),2,1);
        pane.add(new Button("7"),0,2);
        pane.add(new Button("8"),1,2);
        pane.add(new Button("9"),2,2);
        pane.add(new Button("Start"),1,3);
        pane.add(new Button("Stop"),2,3);


        HBox root = new HBox(food, pane);

        bFood.setPrefHeight(200);



        Scene scene = new Scene(root,500,250'');
        primaryStage.setTitle("Microwave");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}


package org.example.supplyanddemand;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    TextField quantityField;
    TextField priceField;
    Label resultLabel;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage supplyDemandStage) {
        supplyDemandStage.setTitle("Supply and Demand Calculator");

        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(15, 15, 15, 15));

        quantityField = new TextField();
        quantityField.setPromptText("Enter quantity");
        GridPane.setConstraints(quantityField, 0, 0);

        priceField = new TextField();
        priceField.setPromptText("Enter price");
        GridPane.setConstraints(priceField, 0, 1);


        resultLabel = new Label("Result: ");
        GridPane.setConstraints(resultLabel, 0, 5);


        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> getResult("equationApplication"));
        GridPane.setConstraints(calculateButton, 1, 0);

        Button addButton = new Button("Add Another");
        GridPane.setConstraints(addButton, 1, 1);

        Button graphButton = new Button("Graph");
        GridPane.setConstraints(graphButton, 1, 2);

        void getResult(char buttonCLick){
            int quantity = Integer.parseInt(quantityField.getText());
            int price = Integer.parseInt(priceField.getText());
        }


        switch (buttonClick) {
            case

        }


        grid.getChildren().addAll(quantityField, priceField, resultLabel, calculateButton, addButton, graphButton);

        Scene scene = new Scene(grid, 300, 200);
        supplyDemandStage.setScene(scene);
        supplyDemandStage.show();
    }

    private void performOperation(char c) {

    }    }


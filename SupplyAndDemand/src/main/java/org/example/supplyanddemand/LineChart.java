package org.example.supplyanddemand;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class LineChart extends Application {

    @Override public void start(Stage graphStage) {
        graphStage.setTitle("Price, P");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Quantity, Q");
        //creating the chart
        final javafx.scene.chart.LineChart<Number,Number> lineChart =
                new javafx.scene.chart.LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("Supply and Demand");
        XYChart.Series supplySeries = new XYChart.Series();
        supplySeries.setName("Supply");
        supplySeries.getData().add(new XYChart.Data(0, 0));

        supplySeries.getData().add(new XYChart.Data(12, 25));

        lineChart.getData().add(supplySeries);

        lineChart.setTitle("Supply and Demand");
        XYChart.Series demandSeries = new XYChart.Series();
        demandSeries.setName("Demand");
        demandSeries.getData().add(new XYChart.Data(0, 25));

        demandSeries.getData().add(new XYChart.Data(25, 10));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(demandSeries);



        graphStage.setScene(scene);
        graphStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
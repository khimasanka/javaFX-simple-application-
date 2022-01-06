package controller;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.fxml.Initializable;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class AnnuallyIncomesFormController {
    public AreaChart areaChart;

    public void initialize(URL url, ResourceBundle rb){
        XYChart.Series series = new XYChart.Series();
        series.setName("Income");

        series.getData().add(new XYChart.Data("jan",80000));
        series.getData().add(new XYChart.Data("feb",90000));
        series.getData().add(new XYChart.Data("mar",100000));
        series.getData().add(new XYChart.Data("apr",95000));
        series.getData().add(new XYChart.Data("may",80000));
        series.getData().add(new XYChart.Data("june",950000));

        areaChart.getData().add(series);
    }
}

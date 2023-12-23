package com.example.cas12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aplikacija1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox koren = new VBox(10);
        koren.setAlignment(Pos.CENTER);
        Label lbPoruka = new Label();
        Button btIspisi = new Button("Ispisi");
        Button btOcisti = new Button("Ocisti");

        koren.getChildren().addAll(lbPoruka, btIspisi, btOcisti);

        // akcije
        btIspisi.setOnAction(e -> {
            lbPoruka.setText("Zdravo svete! :)");
            lbPoruka.setTextFill(Color.BLUE);
        });

        btOcisti.setOnAction(e -> lbPoruka.setText(""));

        Scene scena = new Scene(koren, 400, 400);
        stage.setScene(scena);
        stage.setTitle("Nasa prva aplikacija :)");
        stage.show();
    }
}

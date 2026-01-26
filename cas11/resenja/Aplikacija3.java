package com.example.cas11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aplikacija3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10, 10, 10, 10));

        HBox hBox = new HBox(10);
        Label lbRezultat = new Label("Rezultat:");
        TextField tfRezultat = new TextField();
        koren.getChildren().addAll(hBox, lbRezultat, tfRezultat);

        // hb
        // vb1
        VBox vBoxLevi = new VBox(10);
        Label lbPrvi = new Label("Prvi operand:");
        TextField tfPrvi = new TextField();
        Label lbDrugi = new Label("Drugi operand:");
        TextField tfDrugi = new TextField();
        vBoxLevi.getChildren().addAll(lbPrvi, tfPrvi, lbDrugi, tfDrugi);

        // vb2
        VBox vBoxDesni = new VBox(10);
        vBoxDesni.setPadding(new Insets(40, 10, 10, 30));
        HBox hBoxGornji = new HBox(10);
        HBox hBoxDonji = new HBox(10);
        vBoxDesni.getChildren().addAll(hBoxGornji, hBoxDonji);

        hBox.getChildren().addAll(vBoxLevi, vBoxDesni);

        // hb1
        Button btPlus = new Button("+");
        Button btMinus = new Button("-");
        Button btPuta = new Button("*");
        hBoxGornji.getChildren().addAll(btPlus, btMinus, btPuta);

        // hb2
        Button btPodeljeno = new Button("/");
        Button btStepen = new Button("^");
        Button btObrisi = new Button("C");
        hBoxDonji.getChildren().addAll(btPodeljeno, btStepen, btObrisi);

        // akcije
        btPlus.setOnAction(e -> izracunaj(tfPrvi, tfDrugi, tfRezultat, Operacija.PLUS));

        btMinus.setOnAction(e -> izracunaj(tfPrvi, tfDrugi, tfRezultat, Operacija.MINUS));

        btPuta.setOnAction(e -> izracunaj(tfPrvi, tfDrugi, tfRezultat, Operacija.PUTA));

        btPodeljeno.setOnAction(e -> izracunaj(tfPrvi, tfDrugi, tfRezultat, Operacija.PODELJENO));

        btStepen.setOnAction(e -> izracunaj(tfPrvi, tfDrugi, tfRezultat, Operacija.STEPENOVANJE));

        btObrisi.setOnAction(e -> {
            tfPrvi.clear();
            tfDrugi.clear();
            tfRezultat.clear();
        });

        // scena
        Scene scena = new Scene(koren, 300, 200);
        stage.setScene(scena);
        stage.setTitle("Kalkulator");
        stage.show();
    }

    private void izracunaj(TextField tfPrvi, TextField tfDrugi, TextField tfRezultat, Operacija operacija) {
        double op1 = Double.parseDouble(tfPrvi.getText());
        double op2 = Double.parseDouble(tfDrugi.getText());
        double rezultat = switch (operacija) {
            case PLUS -> op1 + op2;
            case MINUS -> op1 - op2;
            case PUTA -> op1 * op2;
            case PODELJENO -> op1 / op2;
            case STEPENOVANJE -> Math.pow(op1, op2);
        };

        tfRezultat.setText("" + rezultat);
    }
}

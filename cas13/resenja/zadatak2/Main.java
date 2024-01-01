package zadatak2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox koren = new VBox(10);
        koren.setAlignment(Pos.CENTER);
        koren.setPadding(new Insets(10, 10, 10, 10));

        Label lbPrikaz = new Label("Odaberite prikaz rezultata: ");
        Label lbGreska = new Label();
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        Button btPrikazi = new Button("Prikazi");
        Button btOcisti = new Button("Ocisti");
        TextArea ta = new TextArea();
        koren.getChildren().addAll(lbPrikaz, lbGreska, hBox, btPrikazi, btOcisti, ta);

        // hbox
        RadioButton rbRastuce = new RadioButton("Rastuce");
        RadioButton rbOpadajuce = new RadioButton("Opadajuce");

        ToggleGroup tg = new ToggleGroup();
        rbRastuce.setToggleGroup(tg);
        rbOpadajuce.setToggleGroup(tg);

        hBox.getChildren().addAll(rbRastuce, rbOpadajuce);

        // citamo iz fajla
        TreeMap<String, Integer> timovi = new TreeMap<>();

        Path putanja = Paths.get("Rezultati.txt");
        try (Scanner ulaz = new Scanner(putanja)) {
            while (ulaz.hasNext()) {
                String imeTima = ulaz.next();
                String brojPoena = ulaz.next();

                if (brojPoena.equals("d")) {
                    timovi.put(imeTima, Integer.MIN_VALUE);
                } else {
                    timovi.put(imeTima, Integer.parseInt(brojPoena));
                }
            }
        }

        List<Map.Entry<String, Integer>> listaTimova = new ArrayList<>(timovi.entrySet());
        listaTimova.sort((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()));

        // akcije
        btPrikazi.setOnAction(e -> {
            lbGreska.setText("");
            if (!rbRastuce.isSelected() && !rbOpadajuce.isSelected()) {
                lbGreska.setText("ODABERITE PRIKAZ REZULTATA!!!!");
                lbGreska.setTextFill(Color.RED);
            } else if (rbRastuce.isSelected()) {
                for (Map.Entry<String, Integer> tim : listaTimova) {
                    String imeTima = tim.getKey();
                    int brojPoena = tim.getValue();

                    if (brojPoena == Integer.MIN_VALUE) {
                        ta.appendText(imeTima + ": d\n");
                    } else {
                        ta.appendText(imeTima + ": " + brojPoena + "\n");
                    }
                }
            } else {
                for (int i = listaTimova.size() - 1; i >= 0; i--) {
                    Map.Entry<String, Integer> tim = listaTimova.get(i);
                    String imeTima = tim.getKey();
                    int brojPoena = tim.getValue();

                    if (brojPoena == Integer.MIN_VALUE) {
                        ta.appendText(imeTima + ": d\n");
                    } else {
                        ta.appendText(imeTima + ": " + brojPoena + "\n");
                    }
                }
            }
        });

        btOcisti.setOnAction(e -> {
            ta.clear();
            lbGreska.setText("");
            rbRastuce.setSelected(false);
            rbOpadajuce.setSelected(false);
        });

        // scena
        Scene scena = new Scene(koren, 400, 300);
        stage.setScene(scena);
        stage.setTitle("HACKATHON");
        stage.show();
    }
}

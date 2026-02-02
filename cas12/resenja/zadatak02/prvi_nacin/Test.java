package zadatak02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // izgled
        VBox koren = new VBox(10);
        koren.setPadding(new Insets(10));
        koren.setAlignment(Pos.CENTER);

        Label lbPrikaz = new Label("Odaberite prikaz rezultata: ");
        Label lbGreska = new Label();

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        RadioButton rbRastuce = new RadioButton("Rastuce:");
        RadioButton rbOpadajuce = new RadioButton("Opadajuce:");
        ToggleGroup tg = new ToggleGroup();
        rbRastuce.setToggleGroup(tg);
        rbOpadajuce.setToggleGroup(tg);
        hBox.getChildren()
                .addAll(rbRastuce, rbOpadajuce);

        Button btPrikazi = new Button("Prikazi");
        Button btOcisti = new Button("Ocisti");

        TextArea ta = new TextArea();

        koren.getChildren()
                .addAll(lbPrikaz, lbGreska, hBox,
                        btPrikazi, btOcisti, ta);

        // akcije
        List<Tim> podaci = ucitajIzDatoteke();

        btPrikazi.setOnAction(e -> {
            ta.clear();
            lbGreska.setText("");
            if (!rbRastuce.isSelected() && !rbOpadajuce.isSelected()) {
                lbGreska.setText("OZNACITE POREDAK!!!");
                lbGreska.setTextFill(Color.RED);
                return;
            }

            podaci.sort((e1, e2) -> {
                if (e1.getBrojPoena() == Integer.MIN_VALUE) {
                    return -1;
                } else if (e2.getBrojPoena() == Integer.MIN_VALUE) {
                    return 1;
                }
                return e1.getBrojPoena() - e2.getBrojPoena();
            });

            if (rbRastuce.isSelected()) {
                for (Tim tim : podaci) {
                    ta.appendText(tim + "\n");
                }
            } else {
                for (int i = podaci.size() - 1; i >= 0; i--) {
                    Tim tim = podaci.get(i);
                    ta.appendText(tim + "\n");
                }
            }
        });

        btOcisti.setOnAction(e -> {
            lbGreska.setText("");
            ta.clear();

            rbRastuce.setSelected(false);
            rbOpadajuce.setSelected(false);
        });

        // scena
        Scene scena = new Scene(koren, 400, 300);
        stage.setScene(scena);
        stage.setTitle("HACKATHON");
        stage.show();
    }

    private List<Tim> ucitajIzDatoteke() {
        List<Tim> podaci = new LinkedList<>();

        Path putanja = Paths.get("Rezultati.txt");
        try (Scanner ulaz = new Scanner(putanja)) {
            while (ulaz.hasNext()) {
                String ime = ulaz.next();
                String poeni = ulaz.next();

                if (poeni.equals("d")) {
                    podaci.add(new Tim(ime, Integer.MIN_VALUE));
                } else {
                    podaci.add(new Tim(ime, Integer.parseInt(poeni)));
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        return podaci;
    }
}

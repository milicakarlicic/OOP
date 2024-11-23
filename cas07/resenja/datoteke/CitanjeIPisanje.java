package datoteke;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CitanjeIPisanje {

    public static void main(String[] args) {
        Path putanja = Paths.get("1.txt");

        try {
            // citanje iz datoteke
            // var - proizvoljan tip u Javi
            var linije = Files.readAllLines(putanja);
            // ako hocemo da oznacimo kodiranje koje se koristi:
            // var linije = Files.readAllLines(putanja, StandardCharsets.UTF_8);

            for (var linija : linije) {
                System.out.println(linija);
            }

            // pisanje u datoteku
            Path izlaznaPutanja = Paths.get("rezultat.txt");
            Files.write(izlaznaPutanja, linije);
            // ako hocemo da oznacimo kodiranje koje se koristi:
            // Files.write(izlaznaPutanja, linije, StandardCharsets.UTF_8);
            // ako hocemo da oznacimo kodiranje i opcije (na koji nacin otvaramo datoteku):
            // Files.write(izlaznaPutanja, linije, StandardCharsets.UTF_8, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            // mozemo navesti samo opcije bez kodiranja
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

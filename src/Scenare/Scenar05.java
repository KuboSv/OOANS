package Scenare;

import Controller.SpravcaKontroly;
import Model.Vozidlo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Scenar05 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Proces kontroly noveho vozidla!\n----------------------");

        SpravcaKontroly spravcaK = new SpravcaKontroly();
        List<Vozidlo> vozidla = spravcaK.vyhladajVozidlaMechanika();
        if (vozidla == null) {
            System.out.println("Nemas priradene ziadne vozidla na kontrolu!");
            return;
        }
        System.out.println("Zoznam tebe pridenych vozidiel:");
        for (Vozidlo vozidlo : vozidla) {
            System.out.println("ID: " + vozidlo.getId() + " Znacka: " + vozidlo.getZnacka());
        }
        System.out.print("Zadaj id vybraneho vozidla: ");
        int idVozidla = Integer.parseInt(reader.readLine());

        System.out.print("Zadaj stav vozidla: ");
        String stavVozidla = reader.readLine();

        spravcaK.zaevidujStavKontroly(idVozidla, stavVozidla);
    }
}


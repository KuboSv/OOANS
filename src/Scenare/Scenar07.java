package Scenare;

import Controller.SpravcaFaktur;
import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenar07 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Predajca predajca = new Predajca("Tomas", "Hromada");

        System.out.println("Proces vystavenia faktury za autoservis!\n----------------------");
        System.out.print("Zadaj meno zakaznika:");
        String meno = reader.readLine();

        System.out.print("Zadaj priezvisko zakaznika:");
        String priezvisko = reader.readLine();

        Zakaznik zakaznik = new Zakaznik(meno, priezvisko);

        System.out.print("Zadaj druh vozidla:");
        String druh = reader.readLine();
        System.out.print("Zadaj znacku vozidla:");
        String znacka = reader.readLine();

        Vozidlo vozidlo = new Vozidlo(1, druh, znacka, "opravovane", 12040, false);

        System.out.print("Chces vystavit fakturu: A/N? ");
        String potvrdenieFaktury = reader.readLine();
        if (potvrdenieFaktury.equals("A")) {
            SpravcaFaktur spravcaF = new SpravcaFaktur(predajca, zakaznik, vozidlo);
            spravcaF.vystavFakturuZaDiely();
        } else {
            System.out.println("Proces pridania noveho vozdila bol zruseny!");
            return;
        }


    }
}

package Scenare;

import Controller.SpravcaFaktur;
import Controller.SpravcaVozidiel;
import Model.Predajca;
import Model.Zakaznik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenar04 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Predajca predajca = new Predajca("Tomas","Hromada");

        SpravcaVozidiel spravcaV = new SpravcaVozidiel();
        System.out.println("Proces pridania noveho vozidla!\n----------------------");
        System.out.print("Zadaj meno vlastnika:");
        String meno = reader.readLine();

        System.out.print("Zadaj priezvisko vlastnika:");
        String priezvisko = reader.readLine();

        Zakaznik zakaznik = new Zakaznik(meno, priezvisko);

        System.out.print("Zadaj druh vozidla:");
        String druh = reader.readLine();
        System.out.print("Zadaj znacku vozidla:");
        String znacka = reader.readLine();
        System.out.print("zadaj cenu vozidla:");
        int cena = Integer.parseInt(reader.readLine());

        System.out.print("Potvrd udaje: A/N? ");
        String potvrdenie = reader.readLine();
        if (potvrdenie.equals("N")) {
            return;
        }
        SpravcaFaktur faktura = spravcaV.zaevidujVozidlo(predajca, zakaznik, druh, znacka, cena);

        System.out.print("Chces vystavit fakturu: A/N? ");
        String potvrdenieFaktury = reader.readLine();
        System.out.println("----------------------");
        if (potvrdenieFaktury.equals("A")) {
            faktura.vystavFakturuZaVozidlo();
        }
        else{
            System.out.println("Proces pridania noveho vozdila bol zruseny!");
            return;
        }

        System.out.print("Chces vystavit splnomocnenie: A/N? ");
        String splnomocnenie = reader.readLine();
        System.out.println("----------------------");
        if (splnomocnenie.equals("A")) {
            //vystav splnomocnenie alt
        }
        System.out.print("Potvrd dokoncenie procesu: A/N? ");
        potvrdenie = reader.readLine();
        if (potvrdenie.equals("A")) {
            spravcaV.dokonciZaevidovanie();
        }

    }
}

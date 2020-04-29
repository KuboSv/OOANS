package Scenare;

import Controller.SpravcaAutodielov;
import Controller.SpravcaObjednavaniaAutodielov;
import Controller.SpravcaVozidiel;
import Model.Autodiel;
import Model.Mechanik;
import Model.Vozidlo;
import Model.Zakaznik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Scenar04 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        SpravcaVozidiel spravcaV = new SpravcaVozidiel();
        System.out.println("Proces pridania noveho vozidla!");
        System.out.print("Zadaj meno predajcu:");
        String meno = reader.readLine();

        System.out.print("Zadaj prizvisko predajcu:");
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
        if(potvrdenie.equals("N")){
            return;
        }
        spravcaV.zaevidujVozidlo(zakaznik,druh,znacka,cena);


        System.out.print("chces vystavit splnomocnenie: A/N? ");
        String splnomocnnie = reader.readLine();
        if(potvrdenie.equals("A")){
            //vystav splnomocnenie alt
        }
        System.out.print("Potvrd dokoncenie procesu: A/N? ");
        potvrdenie = reader.readLine();
        if(potvrdenie.equals("A")){
            spravcaV.dokonciZaevidovanie();
        }

    }
}

package Scenare;

import Controller.SpravcaAutodielov;
import Controller.SpravcaFaktur;
import Controller.SpravcaObjednavaniaAutodielov;
import Controller.SpravcaUctovnictva;
import Model.Autodiel;
import Model.Mechanik;
import Model.Vozidlo;
import Model.Zakaznik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Scenar07 {
    public static void main(String[] args) throws IOException {

        Zakaznik zakaznik = new Zakaznik("Jakub", "Jusko");
        Vozidlo vozidlo = new Vozidlo(1, "SEDAN", "BMW", "opravovane", 12040, false);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        SpravcaFaktur spravcaF = new SpravcaFaktur(zakaznik, vozidlo);
        spravcaF.vystavFakturuZaDiely();
    }
}

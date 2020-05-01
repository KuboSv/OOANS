package Scenare;

import Controller.SpravcaAutodielov;
import Controller.SpravcaObjednavaniaAutodielov;
import Model.Autodiel;
import Model.Mechanik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Scenar03 {
    public static void main(String[] args) throws IOException {

        Mechanik mechanik = new Mechanik("Jakub", "Jusko", true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        SpravcaAutodielov spravcaA = new SpravcaAutodielov();

        boolean koniec = false;
        while (!koniec) {

            System.out.print("Zadaj ean autodielu:");
            String eanDielu = reader.readLine();


            List<Autodiel> autodiely = spravcaA.vyhladajDiel(eanDielu);

            if (!autodiely.isEmpty()) {

                System.out.printf("Pre zadany EAN %s najdeny diel: \n", eanDielu);
                for (Autodiel autodiel : autodiely) {
                    System.out.printf("Nazov: %s, Mnozstvo: %d, Umiestnenie: %s\n", autodiel.getNazov(), autodiel.getMnozstvo(), autodiel.getUmiestnenie());
                }

                System.out.print("=================================================\nPotvrd vyzdvihnutie dielu jeho eanom: ");
                String vyzdvihnutyEan = reader.readLine();
                System.out.print("zadaj vyzdvihnute mnozstvo: ");
                int vyzdvihnutMnozstvo = Integer.parseInt(reader.readLine());
                spravcaA.znizStavZasob(vyzdvihnutyEan, vyzdvihnutMnozstvo);


            } else {
                SpravcaObjednavaniaAutodielov spravcaOA = new SpravcaObjednavaniaAutodielov();
                System.out.print("Spusteny proces objenavania!\n");
                System.out.print("Zadaj ean autodielu:");
                eanDielu = reader.readLine();

                List<String> vyhladane = spravcaOA.vyhladajProdukt(eanDielu);
                System.out.printf("Najdeny produkt u dodatavetela: %s za cenu %s Eur", vyhladane.get(0), vyhladane.get(1));

                System.out.print("\nChces objednat tovar? A/N:");
                String pokracovat = reader.readLine();

                if (pokracovat.equals("A")) {

                    System.out.print("zadaj mnozstvo na objednanie: ");
                    String mnozstvo = reader.readLine();

                    boolean objednane = spravcaOA.objednajDiel(eanDielu, mnozstvo, mechanik.getPriezvisko());
                    if (objednane) {
                        System.out.print("Diely boli objednane!");
                    } else {
                        System.out.print("Diely neboli objednane!");
                    }
                }
            }

            System.out.print("\nChces znovu vyhladat? A/N:");
            String znovu = reader.readLine();

            if (znovu.equals("N")) {
                koniec = true;
            }
        }
    }
}

package Scenare;

import Controller.SpravcaUctovnictva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scenar06 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Proces vyplatenia vyplat!");
        SpravcaUctovnictva spravcaU = new SpravcaUctovnictva();

        System.out.print("Naozaj chces odoslat vyplaty: A/N? ");
        String zaplat = reader.readLine();
        if (zaplat.equals("A")) {
            spravcaU.odosliVyplaty();
        } else {
            System.out.print("Mzdy neboli odoslalne!");
        }
    }
}

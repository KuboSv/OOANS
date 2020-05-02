package templateMethod;

import Model.Autodiel;
import Model.ServisnyZakrok;
import Model.Vozidlo;
import Model.Zakaznik;
import Visitor.Visitor;
import Visitor.PolozkyFakturyVisitor;

import java.util.List;

public class VystavFakturuZaDiely extends ProcesVytvoreniaFaktury {

    public VystavFakturuZaDiely(Zakaznik zakaznik, Vozidlo vozidlo) {
        this.vozidlo = vozidlo;
        this.zakaznik = zakaznik;
    }

    @Override
    void vytlac() {
        System.out.println("Faktura bola Vylacena!");
    }

    @Override
    void pridajZodpovednuOsobu() {
        System.out.println("Boli pridane udaje o zodpovednej osobe!");
    }

    @Override
    void pridajPolozkyFaktury() {
        ServisnyZakrok servisnyZ = new ServisnyZakrok("oprava", "Tichy", 1, "Vymeneny motorovy olej, brzdova kvapalina..");
        servisnyZ.pridajAutodiely(new Autodiel(1, "0123", "motorovyOlej", 7, true, "A1", 5.54));
        servisnyZ.pridajAutodiely(new Autodiel(2, "0124", "brzdovaKvapalina", 2, true, "A1", 4.01));
        servisnyZ.pridajAutodiely(new Autodiel(3, "0125", "Pelovyfilter", 1, false, "A2", 8));
        servisnyZ.pridajAutodiely(new Autodiel(4, "0126", "brzdoveDosticky", 4, false, "A3", 10.99));
        servisnyZ.pridajAutodiely(new Autodiel(5, "0127", "brzdovyKotuc", 4, false, "A3", 20));
        servisnyZ.pridajAutodiely(new Autodiel(5, "0127", "naraznik", 1, false, "A3", 100));


        List<Autodiel> vsetkyAutodiely = servisnyZ.getAutodiely();
        double cena = vypocitajCenu(vsetkyAutodiely);
        System.out.println("Celkova cena = " + cena);
        System.out.println("Boli pridane autodiely do Faktury!");
    }

    private static double vypocitajCenu(List<Autodiel> vsetkyAutodiely) {
        Visitor visitor = new PolozkyFakturyVisitor();
        double sum = 0;
        for (Autodiel autodiel : vsetkyAutodiely) {
            sum = sum + autodiel.accept(visitor);
        }
        return sum;
    }

    @Override
    void pridajOsobneUdaje() {
        System.out.println("Boli pridane udaje zakaznika!");
    }
}

package Visitor;

import Model.Autodiel;

public class PolozkyFakturyVisitor implements IPolozkyFaktury {

    @Override
    public double visit(Autodiel autodiel) {
        double cena;
        cena = autodiel.getMnozstvo() * autodiel.getCena();

        if (autodiel.isTyp()) {
            cena = autodiel.getMnozstvo() * autodiel.getCena() * 0.95;
        }

        if (cena > 50) {
            cena -= 5;
        }

        return cena;
    }
}

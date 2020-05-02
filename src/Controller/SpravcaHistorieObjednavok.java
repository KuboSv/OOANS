package Controller;

import java.util.*;

import Model.*;
import memento.*;

public class SpravcaHistorieObjednavok {

    private List<ObjednavkaMemento> h = new ArrayList<ObjednavkaMemento>();

    public void pridajMemento(ObjednavkaMemento m){
        this.h.add(m);
    }

    public ObjednavkaMemento vyhladajhistorickuObjednavku(int id) {
        for (ObjednavkaMemento o : h) {
              if (o.getId() == id) {
                  return o;
              }
          }
          return null;
    }

}
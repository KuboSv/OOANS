package Model;

import java.util.ArrayList;
import java.util.List;

public class APIDodavatela2 {
    public boolean Objednaj(String xml) {
        //some api logic
        return true;
    }

    public List<String> Vyhladaj(String xml) {

        String ean = xml.replace("/", "").split("<ean>")[1];

        //some api logic
        List<String> test = new ArrayList<>();
        if (ean.equals("0124")) {
            test.add("brzdovyOlej");
            test.add("2");
        } else {
            test.add("brzdoveDosticky");
            test.add("10");
        }

        return test;
    }
}

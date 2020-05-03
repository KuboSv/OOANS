package Model;

import java.util.ArrayList;
import java.util.List;

public class APIDodavatela1 {
    public boolean Objednaj(String json) {
        //some api logic
        return true;
    }

    public List<String> Vyhladaj(String json) {

        String ean = json.split("\"")[3];

        //some api logic
        List<String> test = new ArrayList<>();
        if (ean.equals("0124")) {
            test.add("brzdovaKvapalina");
            test.add("3");
        } else {
            test.add("brzdoveDosticky");
            test.add("8");
        }
        return test;
    }
}

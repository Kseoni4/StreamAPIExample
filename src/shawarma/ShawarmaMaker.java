package shawarma;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ShawarmaMaker {

    private String[] shawarmaTypes = {"С говядиной", "С курицей", "Со свининой",
                                      "С бараниной", "С рыбой", "С фалафелем",
                                      "С овощами", "С салатом Цезарь", "С ветчиной"};

    public List<Shawarma> generateShawarma(int count){

        LocalTime madeTime = LocalTime.now();

        ArrayList<Shawarma> shawarmas = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            int randomPrice = ThreadLocalRandom.current().nextInt(50, 300);

            String randomType = shawarmaTypes[ThreadLocalRandom.current().nextInt(shawarmaTypes.length)];

            shawarmas.add(new Shawarma(randomType, madeTime, randomPrice));
        }

        return shawarmas;
    }


}

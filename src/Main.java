import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CatListGenerator catListGenerator = new CatListGenerator();

        ArrayList<Cat> cats = (ArrayList<Cat>) catListGenerator.randomCats(100);

        Optional<Cat> shlepa = cats.stream().filter(cat -> cat.getName().equals("Шлёпа")).findFirst();

        shlepa.ifPresent(cat -> System.out.println(cat));

        System.out.println(cats.stream().filter(cat -> cat.getTall() >35).count());
        /*
            SELECT count(cats.name)
            FROM cats
            WHERE height > 3
         */
    }
}

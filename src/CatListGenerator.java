import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CatListGenerator {

    private String[] names = {"Боря", "Сэм", "Флекс",
                             "Гаррис", "Феликс", "Форекс",
                             "Эрик", "Джес", "Томас",
                             "Хисс", "Вася", "Тэля",
                             "Лара", "Фена", "Кнопа",
                            "Шлёпа", "Файна", "Мик",
                            "Клавир", "Дайс", "Фокс"};

    private String[] breeds = {"Метис", "Персидская", "Мейн-кун",
                                "Британская короткошёрстная", "Сиамская", "Бенгальская",
                                "Сфинкс", "Рэгдолл", "Манчкин"};

    private String[] colors = {"Рыжий", "Серый", "Чёрный",
                                "Белый", "Коричневый", "Пятнистый"};


    public List<Cat> randomCats(int count){

        final ArrayList<Cat> cats = new ArrayList<>(count);

        for(int i = 0; i < count; i++){

            String randomName = names[ThreadLocalRandom.current().nextInt(names.length)];

            String randomBreed = breeds[ThreadLocalRandom.current().nextInt(breeds.length)];

            String randomColor = colors[ThreadLocalRandom.current().nextInt(colors.length)];

            int randomAge = ThreadLocalRandom.current().nextInt(1, 20);

            int randomWeight  = ThreadLocalRandom.current().nextInt(1, 10);

            int randomTall  = ThreadLocalRandom.current().nextInt(10, 40);

            cats.add(new Cat(randomAge, randomName, randomBreed, randomColor, randomWeight, randomTall));

            int randomNumber = ThreadLocalRandom.current().nextInt(1, 11);

/*            if(randomNumber == 2 || randomNumber == 5 || randomNumber == 7){
                cats.get(i).setVetBook(new VetBook());
            }*/
            cats.get(i).setVetBook(new VetBook());
        }

        return cats;
    }



}

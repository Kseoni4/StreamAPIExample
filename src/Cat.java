import java.util.Objects;

public class Cat {

    //возраст
    private int age;

    //имя
    private String name;

    //порода
    private String breed;

    //окрас
    private String color;

    //вес
    private int weight;

    //длина
    private int tall;

    /*
    * Далее гетеры, сетеры и конструктор
    * */
//}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public Cat(int age, String name, String breed, String color, int weight, int tall) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.tall = tall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  age == cat.age
                && weight == cat.weight
                && tall == cat.tall
                && Objects.equals(name, cat.name)
                && Objects.equals(breed, cat.breed)
                && Objects.equals(color, cat.color)
                && this.getVetBook().getVID() == cat.getVetBook().getVID();
    }

    @Override
    public String toString() {
        return new String()
                .concat(getName())
                .concat("\n")
                .concat("Возраст: ").concat(""+getAge())
                .concat("\n")
                .concat("Порода: ").concat(getBreed())
                .concat("\n")
                .concat("Окрас: ").concat(getColor())
                .concat("\n")
                .concat("ID веткнижки: ").concat(""+vetBook.getVID())
                .concat("\n---------------------------\n");
    }

    public void setVetBook(VetBook vetBook){
        this.vetBook = vetBook;
    }

    //...
    private VetBook vetBook;

    public VetBook getVetBook() {
        return vetBook;
    }

    /*    private Optional<VetBook> vetBook = Optional.empty();
    public Optional<VetBook> getVetBook() {
        return vetBook;
    }*/
}

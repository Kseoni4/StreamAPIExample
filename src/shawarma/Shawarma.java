package shawarma;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class Shawarma {

    private String shawarmaType;

    private LocalTime madeTime;

    private LocalTime expiredTime;

    private int price;

    public String getShawarmaType() {
        return shawarmaType;
    }

    public LocalTime getMadeTime() {
        return madeTime;
    }

    public LocalTime getExpiredTime() {
        return expiredTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Shawarma(String shawarmaType, LocalTime madeTime, int price) {
        this.shawarmaType = shawarmaType;
        this.madeTime = madeTime;
        this.expiredTime = madeTime.plusHours(ThreadLocalRandom.current().nextInt(2,12));
        this.price = price;
    }

    @Override
    public String toString() {
        return "Шаурма ".concat(shawarmaType)
                .concat("\n")
                .concat("Время изготовления: ").concat(madeTime.toString())
                .concat("\n")
                .concat("Срок годности до: ").concat(expiredTime.toString())
                .concat("\n")
                .concat("Цена: ").concat(""+price)
                .concat("\n---------------------------\n");
    }
}

package cats;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;

public class VetBook {
    private long VID;

    private LocalDate lastVaccination;

    public LocalDate getLastVaccination() {
        return lastVaccination;
    }

    public long getVID() {
        return VID;
    }

    public VetBook(LocalDate birthDay){
        this.VID = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
        this.lastVaccination = LocalDate.now().minusDays(ThreadLocalRandom.current().nextInt(1, (int) ChronoUnit.DAYS.between(birthDay, LocalDate.now())));
    }

    public void setLastVaccination(LocalDate lastVaccination) {
        this.lastVaccination = lastVaccination;
    }

    @Override
    public String toString() {
        return "Вет-книжка:\n" +
                "\tID: "+getVID()+"\n"+
                "\tДата последней вакцнации: "+getLastVaccination();
    }
}
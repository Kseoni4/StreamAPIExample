import java.util.concurrent.ThreadLocalRandom;

public class VetBook {
    private long VID;
    public long getVID() {
        return VID;
    }

    public VetBook(){
        this.VID = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
    }
}
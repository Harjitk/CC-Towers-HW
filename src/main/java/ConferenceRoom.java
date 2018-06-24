import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;
    private int capacity;
    private int dailyRate;

    public ConferenceRoom(String name, int capacity, int dailyRate) {
        super(capacity);
        this.guests = new ArrayList<Guest>();
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }
}



//
//    ConferenceRoom, which will have a name and a daily rate.
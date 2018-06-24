import java.util.ArrayList;

public enum Bedroom extends Room {

    private int roomNumber;
    private int capacity;
    private String type;
    private int nightlyRate;
    private ArrayList<Guest> guests;


    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate) {
        this.guests = new ArrayList<Guest>();
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public String getRoomType() {
        return type;
    }

    public Integer getNightlyRate() {
        return nightlyRate;
    }
}



//Bedroom, which will have a room number, a type e.g. Single/Double, and nightly rate.
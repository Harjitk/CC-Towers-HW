import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
    }

    public int getRoomCount() {
        return rooms.size();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkInGuest(Room room, Guest guest){
        room.addGuest(guest);
    }

    public void checkOutGuest(Room room, Guest guest) {
        room.removeGuest(guest);
    }
}

//
//    Create a Hotel class, which has collections of rooms of different types.
//
//        The hotel will be able check guests in/out of rooms.
//
//        The hotel will be able to get a list of guest(s), if any, checked into a particular room.

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests){
      this.capacity = 2;
      this.guests = guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest>getGuests() {
        return guests;
    }

    public String addGuests() {
        return add(guest);
    }

    public void removeGuests() {
        guests.remove(guest);

    }

    public int countGuests(){
        return guests.size();

    }

}



//
//    Create an abstract Room superclass which will contain the properties/methods common to all Rooms.
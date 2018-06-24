import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
        conferenceRoom1 = new ConferenceRoom("The Arygle Suite", 10, 1500);
        conferenceRoom2 = new ConferenceRoom("The Buchanan Suite", 10, 1000);
        bedroom1 = new Bedroom(4, RoomType.SINGLE, 1, 80);
        bedroom2 = new Bedroom(5, RoomType.DOUBLE, 2, 160);
        guest1 = new Guest("Harjit");
        guest2 = new Guest("Kay");

    }

    @Test
    public void getRoomCount() {
        assertEquals(0, hotel.getRoomCount());
    }

    @Test
    public void addRoomToHotel() {
        hotel.addRoom(conferenceRoom1);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void checkGuestIn(){
        hotel.checkInGuest(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.countGuest());
    }

    @Test
    public void checkOutGuest(){
        hotel.checkInGuest(conferenceRoom1, guest1);
        hotel.checkOutGuest(conferenceRoom1, guest2);
        assertEquals(0, conferenceRoom1.countGuest());
    }

}
//
//    Create a Hotel class, which has collections of rooms of different types.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public enum BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;

    Guest guest1;
    Guest guest2;


    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(4, RoomType.SINGLE, 1, 80);
        bedroom2 = new Bedroom(5, RoomType.DOUBLE, 2, 160);
        guest1 = new Guest ("Harjit");
        guest2 = new Guest ("Kay");

    }

    @Test
    public void getRoomNumber() {
        assertEquals((Integer)4, bedroom1.getRoomNumber());
    }

    @Test
    public void checkRoomIsEmpty() {
        assertEquals(0, bedroom1.getCapacity());
    }

    @Test
    public void checkAddGuestToRoom() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuest());
    }

    @Test
    public void removeGuest(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.countGuest());
    }

    @Test
    public void RoomHasNightlyRate(){
        assertEquals((80, bedroom1.getNightlyRate());
    }

    @Test
    public void RoomHasARoomType(){
        assertEquals("Single", bedroom1.getRoomType());
    }

    }





}


//
//Bedroom, which will have a room number, a type e.g. Single/Double, and nightly rate.
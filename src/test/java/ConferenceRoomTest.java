import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        conferenceRoom1 = new ConferenceRoom("The Arygle Suite", 10, 1500);
        conferenceRoom2 = new ConferenceRoom("The Buchanan Suite", 10, 1000);
        guest1 = new Guest ("Harjit");
        guest2 = new Guest ("Kay");

    }

    @Test
    public void getRoomName() {
        assertEquals("The Arygle Suite", conferenceRoom1.getName());
    }

    @Test
    public void getDailyRate() {
        assertEquals(1500, conferenceRoom1.getDailyRate());
    }
}



//
//ConferenceRoom, which will have a name and a daily rate.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest ("Harjit");
        guest2 = new Guest ("Kay");
    }

    @Test
    public void guestName() {
        assertEquals("Harjit", guest1.getName());
    }
}
//
//    Create a Guest class so that guests can be checked in/out of rooms.
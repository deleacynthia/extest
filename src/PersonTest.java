import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    Person fred;
    Person bill;
    Person jane;

    @BeforeEach
    void setUp(){
        fred = new Person("Fred", "Foggs", 29);
        bill = new Person("Bill", "Boggs", 31);
        jane = new Person("Jane", "Joggs", 29);
    }

    @Test
    public void testCompareTo(){
        assertTrue("Fred is younger than Bill", fred.compareTo(bill) < 0);
        assertTrue("Bill is older than Jane", bill.compareTo(jane) > 0);
        assertEquals(0, fred.compareTo(jane), "Fred and Jane aare equal age");
    }
}

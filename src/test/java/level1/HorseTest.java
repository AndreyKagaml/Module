package level1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Test
    public void runHorse() {
        Horse object = new Horse();
        boolean actual = object.RunHorse(4,-1);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
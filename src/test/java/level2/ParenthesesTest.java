package level2;

import level1.Horse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesesTest {

    @Test
    public void parenthesesInString() {
        Parentheses text = new Parentheses();
        boolean actual = text.ParenthesesInString("Hello(Hi) world!");
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
package level1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void square() {
        Triangle triangle = new Triangle();
        double actual = triangle.Square();
        double expected = 0.5;
        assertEquals(expected, actual);
    }
}
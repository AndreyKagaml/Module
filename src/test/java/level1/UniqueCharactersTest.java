package level1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharactersTest {

    @Test
    public void amountOfUniqueCharacters() {
        UniqueCharacters array = new UniqueCharacters();
        int actual = array.AmountOfUniqueCharacters(UniqueCharacters.ArrayOfCharacters);
        int expected = 4;
        assertEquals(expected, actual);
    }
}
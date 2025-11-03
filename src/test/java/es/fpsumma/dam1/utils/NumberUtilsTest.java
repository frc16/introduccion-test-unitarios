package es.fpsumma.dam1.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    public void reverseOk() {
        int[] result = NumberUtils.reverse(new int[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, result);

    }
}
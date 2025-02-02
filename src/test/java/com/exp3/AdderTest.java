package com.exp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdderTest {

    @Test
    public void testAddition() {
        assertEquals(5, add(2, 3));
    }  // Closing brace for the method

    private int add(int a, int b) {
        return a + b;
    }

    private void assertEquals(int i, int add) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
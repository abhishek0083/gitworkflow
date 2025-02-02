package com.exp3;

import static org.junit.jupiter.api.Assertions.assertEquals; // Make sure this import is present
import org.junit.jupiter.api.Test;

public class AdderTest {

    @Test
    public void testAddition() {
        assertEquals(5, add(2, 3)); // Use the JUnit assertEquals
    }

    private int add(int a, int b) {
        return a + b;
    }

    // REMOVE THIS ENTIRE METHOD:
    // private void assertEquals(int i, int add) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
package com.exp3;

import static org.junit.Assert.assertEquals; // JUnit 4 import
import org.junit.Test; // JUnit 4 import

public class AdderTest {

    @Test
    public void Adder() {
        assertEquals(5, add(2, 3));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
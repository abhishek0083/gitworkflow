package com.exp3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdderTest {

    @Test
    public void testAddition() {
        assertEquals(5, add(2, 3));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
java -jar mav-project-1.0-SNAPSHOT.jar 20 60
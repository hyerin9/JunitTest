package main.resources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusTest {

    @Test
    void testPlus() {
        Plus plus = new Plus();
        assertEquals(plus.plus(3,4), 7);
    }

}
package sidderick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class primeFactorsTest {

    @Test
    void shouldReturnNone() {
        assertEquals(Collections.emptyList(), new primeFactors().generate(1));
    }

    @Test
    void shouldReturnTwo() {
        assertIterableEquals(Collections.singleton(2), new primeFactors().generate(2));
    }

    @Test
    void shouldReturnTwoTwo() {
        assertIterableEquals(Arrays.asList(2,2), new primeFactors().generate(4));
    }
}
package sidderick.fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class fizzBuzzTest {


    @Test
    void threeShouldFizz() {
        assertEquals("fizz", new fizzBuzz().input(3));
    }
    @Test
    void fiveShouldBuzz() {
        assertEquals("buzz", new fizzBuzz().input(5));
    }
    @Test
    void sevenShouldFoo() {
        assertEquals("foo", new fizzBuzz().input(7));
    }
    @Test
    void elevenShouldBoo() {
        assertEquals("boo", new fizzBuzz().input(11));
    }
    @Test
    void sevenElevenShouldFooboo() {
        assertEquals("fooboo", new fizzBuzz().input(77));
    }
    @Test
    void lowerSixteenShouldSmall() {
        assertEquals("small", new fizzBuzz().input(14));
    }
    @Test
    void greaterNinetyFiveShouldBig() {
        assertEquals("big", new fizzBuzz().input(98));
    }
    @Test
    void range1to100() {
        assertEquals("fizzBuzz", new fizzBuzz().inputRange(1,100));
    }
}
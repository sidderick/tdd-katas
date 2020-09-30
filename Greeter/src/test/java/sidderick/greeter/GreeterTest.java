package sidderick.greeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {


    @Test
    void shouldGreetMe() {
        assertEquals("Hello Bob", new Greeter().greet("Bob"));
    }

    @Test
    void shouldTrim() {
        assertEquals("Hello Bob", new Greeter().greet(" Bob "));
    }

    @Test
    void shouldCapitaliseFirst() {
        assertEquals("Hello Bob", new Greeter().greet("bob"));
    }



}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void shouldGreetMe() {
        assertEquals("Hello Bob", new Greeter().greet("Bob"));
    }

}
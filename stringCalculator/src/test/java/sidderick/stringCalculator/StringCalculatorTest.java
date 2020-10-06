package sidderick.stringCalculator;

import org.junit.jupiter.api.Test;

import javax.print.attribute.HashPrintServiceAttributeSet;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void shouldReturnZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnSingleNumber() {
        assertEquals(1,StringCalculator.add("1"));
    }

    @Test
    public void shouldAddThroughComma() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void shouldAddThroughNewLine() {
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void shouldAddThroughAnyDelimiter() {
        assertEquals(10,StringCalculator.add("1\n2,3\n4"));
    }

}
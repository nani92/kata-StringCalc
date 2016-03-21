package com.nani.stringcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void testAddition() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(""), 0);
        assertEquals(calculator.add("1"), 1);
        assertEquals(calculator.add("1,2"), 3);

        assertEquals(calculator.add("2,3"), 5);
        assertEquals(calculator.add("1,2,3"), 6);
        assertEquals(calculator.add("1,2,3,4"), 10);

        assertEquals(calculator.add("1\n2,3"), 6);
        assertEquals(calculator.add("1\n1,1"), 3);

        assertEquals(calculator.add("//;\n1;2"), 3);

        assertEquals(calculator.add("2,1001"), 2);

        assertEquals(calculator.add("//[xxx]\n1xxx2xxx3"), 6);

    }
}
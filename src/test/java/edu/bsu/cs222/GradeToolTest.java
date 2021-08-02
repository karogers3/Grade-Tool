package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is an integration test because it requires the triage policy to work as well as the CHUI tool.
 */
public class GradeToolTest {

    @Test
    public void testMain1() {
        final PrintStream originalOut = System.out;
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        GradeTool.main(new String[] { });

        Assertions.assertEquals("", outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    public void testMain2() {
        final PrintStream originalOut = System.out;
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        System.setIn(Thread.currentThread().getContextClassLoader().getResourceAsStream("one.txt"));

        GradeTool.main(new String[] { });

        Assertions.assertEquals("A", outContent.toString().trim());

        System.setOut(originalOut);
    }
}

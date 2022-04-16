package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is an integration test because it requires the triage policy to work as well as the CHUI tool.
 */
public class GradeToolTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setSystem() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMain_noInput_noGrade() {
        GradeTool.main(new String[]{});

        Assertions.assertEquals("", outContent.toString());
    }

    @Test
    public void testMain_givenOne_gradeIsA() {
        System.setIn(Thread.currentThread().getContextClassLoader().getResourceAsStream("one.txt"));

        GradeTool.main(new String[]{});

        Assertions.assertEquals("A", outContent.toString().trim());
    }
}

package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class FloatParserTest {

    @Test
    public void testParse_emptyFile_emptyList() throws IOException {
        FloatParser parser = new FloatParser();
        List<Float> values = parser.parseForFloats(Thread.currentThread().getContextClassLoader().getResourceAsStream("empty.txt"));
        Assertions.assertEquals(0, values.size());
    }

    @Test
    public void testParse_threeItems_sizeIsThree() throws IOException {
        FloatParser parser = new FloatParser();
        List<Float> values = parser.parseForFloats(Thread.currentThread().getContextClassLoader().getResourceAsStream("three.txt"));
        Assertions.assertEquals(3, values.size());
    }

    @Test
    public void testParse_invalidFile_throwsCheckedException() {
        FloatParser parser = new FloatParser();
        Assertions.assertThrows(FloatParser.ParseException.class, ()-> parser.parseForFloats(Thread.currentThread().getContextClassLoader().getResourceAsStream("invalid.txt")));
    }
}

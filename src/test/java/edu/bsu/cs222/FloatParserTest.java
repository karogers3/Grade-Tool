package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FloatParserTest {
    private final FloatParser parser = new FloatParser();

    private InputStream convertResourceToInputStream(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
    }

    @Test
    public void testParseForFloats_emptyFile_emptyList() throws IOException {
        List<Float> values = parser.parseForFloats(convertResourceToInputStream("empty.txt"));
        Assertions.assertEquals(0, values.size());
    }

    @Test
    public void testParseForFloats_threeItems_sizeIsThree() throws IOException {
        List<Float> values = parser.parseForFloats(convertResourceToInputStream("three.txt"));
        Assertions.assertEquals(3, values.size());
    }

    @Test
    public void testParseForFloats_invalidFile_throwsCheckedException() {
        Assertions.assertThrows(FloatParser.ParseException.class, () ->
                parser.parseForFloats(convertResourceToInputStream("invalid.txt")));
    }
}

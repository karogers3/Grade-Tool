package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses a stream of floats.
 *
 * Each line of the stream is expected to be a single numeric value
 * in the range [0,1].
 */
public class FloatParser {
    static final class ParseException extends RuntimeException {}

    /**
     * Parse the input stream into a list of floats.
     * @param input the input stream
     * @return the list of floats resulting from parsing the input stream
     * @throws IOException if there is a problem reading from the stream
     * @throws ParseException if the stream does not contain a format recognized by this parser
     */
    public List<Float> parseForFloats(InputStream input) throws IOException {
        if (input == null) {
            throw new IllegalArgumentException("Input stream must not be null.");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        List<Float> floats = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            try {
                float aFloat = Float.parseFloat(line);
                floats.add(aFloat);
            } catch (NumberFormatException numberFormatException) {
                throw new ParseException();
            }
        }
        return floats;
    }
}

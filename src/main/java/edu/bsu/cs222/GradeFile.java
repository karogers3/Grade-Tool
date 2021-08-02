package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses a stream of grades.
 *
 * Each line of the stream is expected to be a single numeric value
 * in the range [0,1].
 */
public class GradeFile {
    static final class ParseException extends RuntimeException {}

    /**
     * Parse the input stream into a list of floats.
     * @param input the input stream
     * @return the list of floats resulting from parsing the input stream
     * @throws IOException if there is a problem reading from the stream
     * @throws ParseException if the stream does not contain a format recognized by this parser
     */
    public List<Float> parse(InputStream input) throws IOException {
        if (input == null) {
            throw new IllegalArgumentException("Input stream must not be null.");
        }
        List<Float> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            try {
                float f = Float.parseFloat(line);
                result.add(f);
            } catch (NumberFormatException numberFormatException) {
                throw new ParseException();
            }
        }
        return result;
    }
}

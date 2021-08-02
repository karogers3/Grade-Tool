package edu.bsu.cs222;

import java.io.IOException;
import java.util.List;

/**
 * Converts all the values given as input into letter grades
 * following <a href="https://www.cs.bsu.edu/~pvgestwicki/misc/grading.shtml">triage grading</a>.
 *
 * Plus and minus grades are omitted for simplicity.
 */
public class GradeTool {
    public static void main(String[] args) {
        edu.bsu.cs222.GradeFile parser = new edu.bsu.cs222.GradeFile();
        List<Float> list = null;
        try {
            list = parser.parse(System.in);
        } catch (IOException ioException) {
            System.out.println("There was a problem reading from the input stream.");
        } catch (edu.bsu.cs222.GradeFile.ParseException parseException) {
            System.out.println("Invalid input format.");
        }

        assert list != null;

        Convert policy = new Convert();
        for (float number : list) {
            System.out.println(policy.toGrade(number));
        }
    }
}

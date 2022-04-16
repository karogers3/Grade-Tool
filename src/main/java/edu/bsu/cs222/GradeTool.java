package edu.bsu.cs222;

import java.io.IOException;
import java.util.List;

/**
 * Converts all the values given as input into letter grades
 * following <a href="https://www.cs.bsu.edu/~pvgestwicki/misc/grading.shtml">triage grading</a>.
 * <p>
 * Plus and minus grades are omitted for simplicity.
 */
public class GradeTool {
    public static void main(String[] args) {
        GradeFile percentageParser = new GradeFile();
        List<Float> percentages = null;
        try {
            percentages = percentageParser.parse(System.in);
        } catch (IOException ioException) {
            System.out.println("There was a problem reading from the input stream.");
        } catch (GradeFile.ParseException parseException) {
            System.out.println("Invalid input format.");
        }

        assert percentages != null;

        GradePolicy triage = new GradePolicy();
        for (float percent : percentages) {
            System.out.println(triage.toGrade(percent));
        }
    }
}

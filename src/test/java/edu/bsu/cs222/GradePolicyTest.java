package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GradePolicyTest {
    @ParameterizedTest
    @MethodSource("percentageToGrade")
    public void testToGrade_givenTopAndBottomPercentages(float percentage, Grade grade) {
        GradePolicy triage = new GradePolicy();
        Assertions.assertEquals(triage.toGrade(percentage), grade);
    }

    private static Stream<Arguments> percentageToGrade() {
        return Stream.of(
                arguments(1.0f, Grade.A),
                arguments(8f / 9f + 0.1f, Grade.A),
                arguments(8f / 9f, Grade.B),
                arguments(13f / 18f + 0.1f, Grade.B),
                arguments(13f / 18f, Grade.C),
                arguments(8f / 15f + 0.1f, Grade.C),
                arguments(8f / 15f, Grade.D),
                arguments(1f / 3f + 0.1f, Grade.D),
                arguments(1f / 3f, Grade.F)
        );
    }
}

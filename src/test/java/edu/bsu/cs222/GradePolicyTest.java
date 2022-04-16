package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradePolicyTest {

    @Test
    public void testGrade_topA() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(1.0f), Grade.A);
    }

    @Test
    public void testGrade_bottomA() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(8f/9f+0.1f), Grade.A);
    }

    @Test
    public void testGrade_topB() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(8f/9f), Grade.B);
    }

    @Test
    public void testGrade_bottomB() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(13f/18f+0.1f), Grade.B);
    }

    @Test
    public void testGrade_topC() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(13f/18f), Grade.C);
    }

    @Test
    public void testGrade_bottomC() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(8f/15f+0.1f), Grade.C);
    }

    @Test
    public void testGrade_topD() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(8f/15f), Grade.D);
    }

    @Test
    public void testGrade_bottomD() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(1f/3f + 0.1f), Grade.D);
    }

    @Test
    public void testGrade_topF() {
        GradePolicy gradePolicy = new GradePolicy();
        Assertions.assertEquals(gradePolicy.toGrade(1f/3f), Grade.F);
    }
}

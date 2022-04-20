package edu.bsu.cs222;

public class GradePolicy {
    public Grade toGrade(float percent) {
        Grade currentGrade = Grade.F;
        for (Grade grade : Grade.values()) {
            if (percent > grade.getMinimumValue()) {
                currentGrade = grade;
                break;
            }
        }
        return currentGrade;
    }
}

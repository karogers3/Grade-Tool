package edu.bsu.cs222;

public class GradePolicy {
    public Grade toGrade(float percent) {
        if (percent > 8f/9f) {
            return Grade.A;
        }
        else if (percent > 13f/18f) {
            return Grade.B;
        }
        else if (percent > 8f/15f) {
            return Grade.C;
        }
        else if (percent > 1f/3f) {
            return Grade.D;
        }
        else {
            return Grade.F;
        }
    }
}

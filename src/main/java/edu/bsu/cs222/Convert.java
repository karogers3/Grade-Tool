package edu.bsu.cs222;

public class Convert {
    public edu.bsu.cs222.Grade toGrade(float percent) {
        if (percent > 8f/9f) {
            return edu.bsu.cs222.Grade.A;
        }
        else if (percent > 13f/18f) {
            return edu.bsu.cs222.Grade.B;
        }
        else if (percent > 8f/15f) {
            return edu.bsu.cs222.Grade.C;
        }
        else if (percent > 1f/3f) {
            return edu.bsu.cs222.Grade.D;
        }
        else {
            return edu.bsu.cs222.Grade.F;
        }
    }
}

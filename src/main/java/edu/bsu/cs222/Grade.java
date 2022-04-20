package edu.bsu.cs222;

public enum Grade {
    A (8f/9f),
    B (13f / 18f),
    C (8f / 15f),
    D (1f / 3f),
    F (0f);

    private final float minimumValue;

    Grade(float minimumValue) {
        this.minimumValue = minimumValue;
    }

    public float getMinimumValue() {
        return minimumValue;
    }
}

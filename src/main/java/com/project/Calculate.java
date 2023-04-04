package com.project;

public class Calculate {
    public static double calculate(double principle, double interest, int years, int compoundingPeriod) {
        return principle * Math.pow((1 + (interest / compoundingPeriod)), (compoundingPeriod * years));
    }
}

package com.gpacalculator.utils;

public class InputValidator {
    public static boolean isValidCourseScore(int courseScore) {
        return courseScore >= 0 && courseScore <= 100;
    }
    
    public static boolean isValidCourseUnit(int courseUnit) {
        return courseUnit >= 0 && courseUnit <= 20;
    }


    public static boolean isValidCourseCode(String courseCode) {
        return courseCode != null && !courseCode.trim().isEmpty();
    }

    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

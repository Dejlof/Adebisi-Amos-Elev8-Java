package com.gpacalculator.services;

import com.gpacalculator.models.Course;

public class GpaCalculatorService {
    public static String convertToLetterGrade(double courseScore) {
        if (courseScore >= 70 && courseScore<= 100) {
            return "A";
        } else if (courseScore>= 60 && courseScore < 70) {
            return "B";
        } else if (courseScore>= 50 && courseScore < 60) {
            return "C";
        } else if (courseScore >= 45 && courseScore < 50) {
            return "D";
        } else if (courseScore >= 40 && courseScore< 45) {
            return "E";
        } else if (courseScore >= 0 && courseScore< 40) {
            return "F";
        } else {
            return "Invalid Score";
        }
    }

    public static int convertToNumericGrade(double courseScore) {
        String letterGrade = convertToLetterGrade(courseScore);

        return switch (letterGrade.toUpperCase()) {
            case "A" -> 5;
            case "B" -> 4;
            case "C" -> 3;
            case "D" -> 2;
            case "E" -> 1;
            default -> 0;
        };
    }

    public static double calculateGPA(Course[] courses) {
        double totalGradePoints = 0;
        double totalUnits = 0;

        for (Course course : courses) {
            double gradePoint = convertToNumericGrade(course.getCourseScore());
            int units = course.getCourseUnits();

            totalGradePoints += gradePoint * units;
            totalUnits += units;
        }

        if (totalUnits == 0) {
            return 0.0;
        }

        return totalGradePoints / totalUnits;
    }
}

package com.gpacalculator.utils;

import java.util.Scanner;

public class Check {
    private static final Scanner scanner = new Scanner(System.in);

    public static int validPositiveNumber(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            value = Integer.parseInt(inputValue);
            if (value > 0) break;
        }
        return value;
    }

    public static String validCourseCode(String prompt) {
        String courseCode;

        while (true) {
            System.out.print(prompt);
            courseCode = scanner.nextLine();

            if (InputValidator.isValidCourseCode(courseCode)) {
                break;
            }

            System.out.println("Invalid course code. Please enter a valid one.");
        }
        return courseCode;
    }

    public static int validCourseScore(String prompt) {
        int courseScore;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Incorrect data. Enter a valid course score.");
                continue;
            }

            courseScore = Integer.parseInt(inputValue);
            
            if (!InputValidator.isValidCourseScore(courseScore)) {
                System.out.printf("Course Score should be between %d and %d\n", 0, 100);
                continue;
            }
            
            break;
        }
        
        return courseScore;
    }

    public static int validCourseUnit(String prompt) {
        int courseUnit;

        while (true) {
            System.out.print(prompt);
            String inputValue = scanner.nextLine();

            if (!InputValidator.isValidInteger(inputValue)) {
                System.out.println("Incorrect data. Enter a valid course unit.");
                continue;
            }

            courseUnit = Integer.parseInt(inputValue);

             if (!InputValidator.isValidCourseUnit(courseUnit)) {
                System.out.printf("Course Unit Should be between %d and %d\n", 0, 20);
                continue;
            }

            break;
        }

        return courseUnit;
    }
}

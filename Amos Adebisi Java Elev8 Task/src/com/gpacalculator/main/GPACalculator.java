package com.gpacalculator.main;

import com.gpacalculator.models.Course;
import com.gpacalculator.services.GpaCalculatorService;
import com.gpacalculator.utils.Check;

public class GPACalculator {

    public static void main(String[] args) {
        System.out.println("Your GPA Calculator");

        int noOfCourses = Check.validPositiveNumber("Please input number of courses taken: ");
        Course[] courses = new Course[noOfCourses];


        for (int i = 0; i < noOfCourses; i++) {
            Course course = captureCourseInput(i);
            // Add the course to the array
            courses[i] = course;
        }

        printCourseInfo(courses);

        double gpa = GpaCalculatorService.calculateGPA(courses);
        System.out.printf("\nYour GPA is: %.2f\n", gpa);
    }

    private static void printCourseInfo(Course[] courses) {
        System.out.println("\nSTATEMENTS OF RESULT:\n");

        System.out.println("|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (Course course : courses) {
            String grade = GpaCalculatorService.convertToLetterGrade(course.getCourseScore());
            int gradePoint = GpaCalculatorService.convertToNumericGrade(course.getCourseScore());

            System.out.format("| %-27s| %-21s | %-10s | %-19s |\n",
                    course.getCourseCode(), course.getCourseUnits(), grade, gradePoint);
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

    private static Course captureCourseInput(int index) {
        int count = index + 1;
        System.out.println("\nInput your course details #" + count);

        String courseCode = Check.validCourseCode("Course Code: ");
        int courseUnits = Check.validCourseUnit("Course Unit: ");
        double courseScore = Check.validCourseScore("Course Score: ");

        return new Course(courseCode, courseUnits, courseScore);
    }
}
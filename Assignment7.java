package javaanudip;

import java.util.Scanner;

public class StudentGrade {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks of 5 subjects (out of 100):");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5.0; // percentage bhi yahi hoga kyuki 500 me se hai

        String grade;
        if (average > 90) {
            grade = "Ex";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Average: " + average + "%");
        System.out.println("Grade: " + grade);
        
    }
}
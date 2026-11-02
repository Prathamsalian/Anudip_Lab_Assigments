package javaanudip;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        double rate;

        if (principal > 10000) {
            rate = 10.0; 
        } else if (principal >= 5000) {
            rate = 8.0;  
        } else {
            rate = 5.0;  
        }

     
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("\n--- Loan Details ---");
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Applied Interest Rate: " + rate + "%");
        System.out.println("Calculated Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + (principal + simpleInterest));

        scanner.close();
    }
}
package com.calculator;

import java.util.Scanner;

public class Calculator {
    
    public static double sqrt(double num){
        if(num < 0){
            throw new IllegalArgumentException("Square root is not defined for negative numbers");
        }
        return Math.sqrt(num);
    }

    public static long fact(int num){
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if(num > 20){
            throw new IllegalArgumentException("Factorial supported only up to 20 due to overflow.");
        }

        long ans = 1;
        for(int i = 1; i <= num; i++)
            ans *= i;
        
        return ans;
    }

    public static double naturalLog(double num){
        if(num <= 0){
            throw new IllegalArgumentException("Log is not defined for non-positive numbers");
        }

        return Math.log(num);
    }

    public static double pow(double base, double exp){
        return Math.pow(base, exp);
    }
    
    /* ========== Input Validation Methods ========== */
    
    public static int getIntInput(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Invalid input! Please Enter a valid integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double getDoubleInput(Scanner sc){
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please Enter a numeric value");
            sc.next();
        }
        return sc.nextDouble();
    }

    /* ============ Main Program =============== */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n===== Scientific Calculator =======");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power");
            System.out.println("5. Exit");


            System.out.print("Please choose one option (1-5): ");
            int ch = getIntInput(sc);

            try{

                switch (ch) {
                    case 1:
                        System.out.print("Enter a Value: ");
                        double num = getDoubleInput(sc);
                        System.out.println("Square root of " + num + " is: " + sqrt(num));
                        break;
    
                    case 2:
                        System.out.print("Enter an Integer Value: ");
                        int n = getIntInput(sc);
                        System.out.println("Factorial of " + n +" is: " + fact(n));
                        break;
    
                    case 3:
                        System.out.print("Enter a Value: ");
                        double x = getDoubleInput(sc);
                        System.out.println("Natural log of "+ x + " is: "+ naturalLog(x));
                        break;
                    
                    case 4:
                        System.out.print("Enter Base: ");
                        double base = getDoubleInput(sc);
                        System.out.print("Enter Exponent: ");
                        double exp = getDoubleInput(sc);
                        System.out.println("Answer: " + pow(base, exp));
                        break;
                    
                    case 5:
                        System.out.println("Thanks for using Calculator...");
                        sc.close();
                        return;
    
                    default:
                        System.out.println("Opss!!!... Invalid input");
                        break;
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
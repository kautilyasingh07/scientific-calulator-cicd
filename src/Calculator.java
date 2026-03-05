import java.util.Scanner;

public class Calculator {
    
    public static double sqrt(double num){
        return Math.sqrt(num);
    }

    public static long fact(int num){
        if(num < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        
        long ans = 1;
        for(int i = 1; i <= num; i++)
            ans *= i;
        
        return ans;
    }

    public static double naturalLog(double num){
        if(num <= 0)
            throw new IllegalArgumentException("Log is not defined for non-positve numbers");

        return Math.log(num);
    }

    public static double pow(double base, double exp){
        return Math.pow(base, exp);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            System.out.println("\n___Scientific Calculator___");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power");
            System.out.println("5. Exit");


            System.out.println("Please, Choose one option: ");
            int ch = -1;
            if(sc.hasNextInt()){
                ch = sc.nextInt();
            }
            else{
                System.out.println("Invalid input! Please enter the valid integer");
                sc.next();
                // return;
            }
            
            switch (ch) {
                case 1:
                    System.out.println("Enter a Value: ");
                    double num = sc.nextDouble();
                    System.out.println("Square root of " + num + " is: " + sqrt(num));
                    break;

                case 2:
                    System.out.println("Enter an Integer Value: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial of " + n +" is: " + fact(n));
                    break;

                case 3:
                    System.out.println("Enter a Value: ");
                    double x = sc.nextDouble();
                    System.out.println("Natural log of "+ x + " is: "+ naturalLog(x));
                    break;
                
                case 4:
                    System.out.println("Enter Base: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter Exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Answer: " + pow(base, exp));
                    break;
                
                case 5:
                    System.out.println("Thanks for using Calculator...");
                    sc.close();
                    break;

                default:
                    System.out.println("Opss!!!... Invalid input");
                    break;
            }
        }
    }
}
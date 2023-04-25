import java.util.Scanner;
public class MyCalculator {
    // main method starts
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter two numbers
        System.out.println("==Welcome to Calculator Program==");
        System.out.println("Enter the first number : ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = reader.nextInt();

        // method calling
        System.out.println("Addition : " + num1 + " add " + num2 + " equals " + add(num1, num2));
        System.out.println("Subtraction : " + num1 + " minus " + num2 + " equals " + minus(num1, num2));
        System.out.println("Multiplication : " + num1 + " multiply " + num2 + " equals " + multiply(num1, num2));
        System.out.println("Division : " + num1 + " add " + num2 + " equals " + division(num1, num2));
    } // end of main method

    // create method to add two numbers
    // method 1, addition
    public static int add(int a, int b) {
        // return a+b
        return a + b;
    }

    // method 2, substraction
    public static int minus(int a, int b) {
        //return a - b
        return a - b;
    }

    // method 3, multiplication
    public static int multiply(int a, int b) {
        //return a * b
        return a * b;
    }

    // method 4, division
    public static int division(int a, int b) {
        //return a / b
        return a / b;

    }
}

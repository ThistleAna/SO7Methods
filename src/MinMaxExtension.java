//QS 11, PART2
//WB5 Questions11
import java.util.Scanner;
public class MinMaxExtension {
    // main methods
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input num1, num2, num3
        System.out.println("This program will read three numbers from you.");
        System.out.println("Enter 3 numbers= "); // instruction for the user
        // read user input as double numbers
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double num3 = reader.nextDouble();

        if (num1%1==0 && num2%1==0 && num3%1==0 ){ // whole numbers, int method call
            //call maxNumber
            System.out.println("The the biggest number is " + maxNumber((int)num1, (int)num2,(int) num3));
            //call minNumber
            System.out.println("The the smallest number is " + minNumber((int)num1,(int) num2,(int) num3));
        } else { // decimal numbers, double method call
            //call maxNumber
            System.out.println("The the biggest number is " + maxNumber(num1, num2, num3));
            //call minNumber
            System.out.println("The the smallest number is " + minNumber(num1, num2, num3));
        }



    }// main method ends

    // method 1 to find the biggest number
    static int maxNumber(int a, int b, int c){
        // do if else statement
        if (a > b && a > c) {
            return a; // a is the biggest
        } else if ( b > a && b > c) {
            return b; // b is the biggest
        } else {
            return c; // c is the biggest
        }
    } // end of maxNumber method

    // create method 2 to return the minimum number
    static int minNumber(int a, int b, int c){
        // do if else statement
        if (a < b && a < c) {
            return a; // a is the biggest
        } else if ( b < a && b < c) {
            return b; // b is the biggest
        } else {
            return c; // c is the biggest
        }
    } // end of minNumber method
    // create method 3 to return the max number (double) use method overloading
    static double maxNumber(double a, double b, double c){
        // do if else statement
        if (a > b && a > c) {
            return a; // a is the biggest
        } else if ( b > a && b > c) {
            return b; // b is the biggest
        } else {
            return c; // c is the biggest
        }
    } // end of maxNumber method
    // create method 4 to return the min number (double) use method overloading
    static double minNumber(double a, double b, double c){
        // do if else statement
        if (a < b && a < c) {
            return a; // a is the biggest
        } else if ( b < a && b < c) {
            return b; // b is the biggest
        } else {
            return c; // c is the biggest
        }
    } // end of minNumber method
}

//WB5 Questions11
import java.util.Scanner;
public class MinMaxMethods {
    // main methods
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input num1, num2, num3
        System.out.println("This program will read three numbers from you.");
        System.out.println("Enter 3 numbers= "); // instruction for the user
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();

        //call maxNumber
        System.out.println("The the biggest number is " + maxNumber(num1, num2, num3));

    }// main method ends

    // methods to find the biggest number
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

}

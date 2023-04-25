import java.math.BigInteger;
public class FibonacciSequence {
    // main method, pass on the how many sequence do we need to compute
    public static void main (String[] args){
        fibonacci(100); // produce the 10 numbers in the sequence
    }

    // this is  my method
    public static void fibonacci (int counter){
        BigInteger num1 = BigInteger.ZERO; // assign this variable to 0
        BigInteger num2 = BigInteger.ONE;
        BigInteger nextNum = BigInteger.ZERO;
        System.out.println(num1);
        System.out.println(num2);
        // for loop
        for (int i=1; i < counter; i++) {
            nextNum = num1.add(num2);
            System.out.println(nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}

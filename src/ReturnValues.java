public class ReturnValues {
    // use return keyword inside our own method
    static int add(int x, int y){
        return x+y;
    }

    // main method
    public static void main(String[] args) {
       // method call MUST inside println
        System.out.println( add(10, 23)); // output 33
    }
}

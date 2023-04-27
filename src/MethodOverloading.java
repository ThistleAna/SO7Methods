// method overloading = we have same name method, but different parameter data type
public class MethodOverloading {
    // use return keyword inside our own method
    static int add(int x, int y){
        return x+y;
    }
    // this method will take double parameters
    static double add(double x, double y){
        return x+y;
    }
    // main method
    public static void main(String[] args) {
        // method call MUST inside println
        System.out.println( add(10, 23)); // output 33
        System.out.println( add(10.9, 23.2)); // output 34.1
    }
}

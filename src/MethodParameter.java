public class MethodParameter {
    // own method starts
    static void welcome(String fName, int age){ // parameter passing fName and age
        System.out.println("Hello, welcome back " + fName + " Potter, age " + age);
    }// end

    //main method
    public static void main(String[] args) {
        welcome("James", 45); // passing arguments
        welcome("Lilly", 40);
        welcome("Harry", 12);
    }
}

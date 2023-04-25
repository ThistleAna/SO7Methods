public class NameOverloading {
    // my method
    static void myMethod (String firstName){
        System.out.println(firstName + " Potter");
    }

    // overload the method, accepts 2 parameters
    static void myMethod (String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    // overload the method, accepts 3 parameters
    static void myMethod (String firstName, String middleName, String lastName){
        System.out.println(firstName + " " + middleName + " "+ lastName);
    }
    // main method
    public static void main(String[] args) {
        myMethod("Harry");
        myMethod("James");
        myMethod("Lilly");

        myMethod ("Ron", "Weasley");
        myMethod("Hermione", "Granger");
        myMethod("Lucius", "Malfoy");
        myMethod("Draco", "Lucius", "Malfoy");

    }
}

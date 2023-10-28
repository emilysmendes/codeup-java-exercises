import java.util.Scanner;

public class MethodPractice {


    /**
     * METHOD MINI-EXERCISES
     */

    // TODO: Write a method, returnName, that returns the string of your name.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(returnName());
        System.out.println(returnLongerString("this is a long string.", "this is an even longer string!"));
        System.out.println(canBeHalved(16));
        System.out.println(addition(4, 5));
        System.out.println(subtraction(17, 4));
        System.out.println(multiplication(33, 2));
        System.out.println(division(333, 3));
        System.out.println(modulus(8, 6));
        System.out.println(sayName("Codeup Staff"));
        System.out.println(getInteger(1, 10));
//        System.out.println(diceRoll());
    }

    public static String returnName() {
        String inputName = "Emily Mendes";
        return inputName;
    }

    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.

    public static String returnLongerString(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }

    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
    public static boolean canBeHalved(int int1) {
        if (int1 % 2 == 0) {
            return true;
        }
        return false;
    }

    // TODO: !! Complete math exercises from the curriculum !!
    public static int addition(int int1, int int2) {
        return int1 + int2;
    }

    public static int subtraction(int int1, int int2) {
        return int1 - int2;
    }

    public static int multiplication(int int1, int int2) {
        return int1 * int2;
    }

    public static int division(int int1, int int2) {
        return int1 / int2;
    }

    public static int modulus(int int1, int int2) {
        return int1 % int2;
    }

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"

    public static String sayName(String str1) {
        return "Good Morning, " + str1;
    }

    public static String sayName(String str1, String str2) {
        return String.format("Good Morning, %s %s", str1, str2);
    }


    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static double addition(double int1, double int2) {
        return int1 + int2;
    }

    public static double subtraction(double int1, double int2) {
        return int1 - int2;
    }

    public static double multiplication(double int1, double int2) {
        return int1 * int2;
    }

    public static double division(double int1, double int2) {
        return int1 / int2;
    }

    public static double modulus(double int1, double int2) {
        return int1 % int2;
    }


    // TODO: Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Enter a number between 1 and 10");
            userNumber = scanner.nextInt();
        } while (userNumber < 1 || userNumber > 10);
        return userNumber;


    }}



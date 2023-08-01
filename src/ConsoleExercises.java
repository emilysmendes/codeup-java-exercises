import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.println("The value of pi is approximately: " + pi);
        System.out.printf("The value of pi is approximately: %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int userInput = scanner.nextInt();
        System.out.printf("The number you entered is: %s%n", userInput);

        System.out.println("Enter 3 words");
        String answer1= scanner.next();
        String answer2= scanner.next();
        String answer3= scanner.next();
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

        System.out.println("Enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

        System.out.println("Enter the length value");
        int userLength = scanner.nextInt();
        System.out.println("The length is: " + userLength);
        System.out.println("Enter the width value");
        int userWidth = scanner.nextInt();
        System.out.println("The width is: " + userWidth);
        int userArea = userLength * userWidth;
        System.out.printf("The area of the your room is %sft squared", userArea);
        int userPerimeter = (userLength * 2) + (userWidth * 2);
        System.out.println("The perimeter of your room is %s, ");


    }
}

import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {
        System.out.println("***** Start Question 1 *****");
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        System.out.println("***** Start Question 2 ******");
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        }
        while (a <= 100);


        System.out.println("****** Start Question 3 *****");
        int b = 100;
        do {
            System.out.println(b);
            b -= 5;
        }
        while (b >= -10);


        System.out.println("***** Start Question 4 *****");
        long c = 2;
        do {
            System.out.println(c);
            c *= c;
        } while (c <= 1000000);
        /* With a long, the number after 65,536 would be 4,294,967,296 (which does not fit in an int, but does fit in a long), so it stops. */


        System.out.println("***** Start Question 5 *****");

        for (int e = 5; e <= 15; e++) {
            System.out.println(e);
        }


        System.out.println("***** Start Question 6 *****");
        for (int f = 2; f <= 100; f += 2) {
            System.out.println(f);
        }


        System.out.println("***** Start Question 7 *****");
        for (int g = 100; g >= -10; g -= 5) {
            System.out.println(g);
        }


        System.out.println("***** Start Question 8 *****");
        for (long h = 2; h <= 1000000; h *= h) {
            System.out.println(h);
        }


        System.out.println("***** Start Question 9 *****");
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0) {
                System.out.println("Fizz");
            }
            if (k % 5 == 0) {
                System.out.println("Buzz");
            }
            if (k % 3 == 0 && k % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println(k);
        }


        System.out.println("***** Start Question 10 *****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userNumber = scanner.nextInt();
        System.out.printf("The number you entered is: %s%n", userNumber);
        System.out.println("Here is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | ------");
        int m = 1;
        while (m <= userNumber) {
            System.out.printf("%d      |%d        |%d     \n", m, m * m, m * m * m);
            m++;
            System.out.println("Would you like to continue? Y/N");
            String userResponse = scanner.next();
            if (userResponse == "Y") {
                continue;
            }
            if (userResponse == "N") {
                break;
            }
        }
    }

}

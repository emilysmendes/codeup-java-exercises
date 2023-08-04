package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;



    public Input () {
        scanner = new Scanner(System.in);
        ;
    }

//    public String getString () {
//        return .toString();
//    }

    public boolean yesNo() {
        System.out.println("Do you like cheese?");
        String answer = scanner.nextLine();
        if (answer.startsWith("y")) {
            System.out.println("true");
        }
        return false;
    }
}

package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    private Input input = new Input();

    public static HashMap<String, Student> hashMaps() {
        HashMap<String, Student> students = new HashMap<>();

        Student studentOne = new Student("Harry Potter");
        studentOne.addGrade(78);
        studentOne.addGrade(73);
        studentOne.addGrade(82);

        Student studentTwo = new Student("Ronald Weasley");
        studentTwo.addGrade(70);
        studentTwo.addGrade(65);
        studentTwo.addGrade(78);

        Student studentThree = new Student("Hermione Granger");
        studentThree.addGrade(100);
        studentThree.addGrade(100);
        studentThree.addGrade(100);

        Student studentFour = new Student("Draco Malfoy");
        studentFour.addGrade(85);
        studentFour.addGrade(82);
        studentFour.addGrade(90);

        students.put("TheChosenOne", studentOne);
        students.put("FlameHead", studentTwo);
        students.put("BookwormCutie", studentThree);
        students.put("MyFatherWillHearAboutThis", studentFour);

//        System.out.println(students);
        return students;
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = hashMaps();
        System.out.println(students);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println("What student would you like to see more information about?");
//        String userResponse = scanner.nextLine();
//        System.out.printf("Sorry, no student found with the GitHub username of %s. Would you like to see another student? Y/N", userResponse);
//        String userResponse2 = scanner.nextLine();
        System.out.println("What student would you like more information on?");
//        String userResponse3 = scanner.nextLine();
//        System.out.println(userResponse3);
        System.out.println("Would you like another student?");
//        String userResponse4 = scanner.nextLine();
        System.out.println("Goodbye, and have a magical day!");


        do {
            printMenu(students);
            getInput
        } while (wantsToContinue);

        private static void printMenu(HashMap<String, Student> hashMaps) {
            System.out.println("Students usernames:\n");
            hashMaps().keySet();

        }

        private static Boolean wantsToContinue () {
            return input.yesNo("Would you like another student?");
        }

    }
}

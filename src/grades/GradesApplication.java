package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    final private static Input input = new Input();


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

    }

    private static void printMenu(HashMap<String, Student> hashMaps) {
        System.out.println("Students usernames:\n");
        hashMaps().keySet();
        System.out.println();

    }

    private static boolean userWantsToContinue() {
        return input.yesNo("Do you want to see another Student?");
    }

    private static void getInputFromUserAndDisplayResponse(HashMap<String, Student> students) {
        String userInput;
        do{
            userInput = input.getString("Enter the username you want more info on:");
        } while(!students.containsKey(userInput));
        displayStudentInfo(students.get(userInput), userInput);
    }

    private static void displayStudentInfo(Student student, String username) {
        System.out.printf("Name - %s%n", student.getName());
        System.out.printf("Username - %s%n", username);
        System.out.printf("Grade Average - %.2f%n%n", student.getGradeAverage());
    }



}

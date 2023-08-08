import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        Arrays.toString(name of array) is necessary because if we were to just print out the array it would print out only the address of the array and not the actual information residing inside the array.

        Person emily = new Person ("Emily");
        Person audrey = new Person ("Audrey");
        Person rick = new Person ("Rick");

        /* OR */
//        Person[] people = {
//                new Person("Emily"),
//                new Person("Audrey"),
//                new Person("Rick"),
//        }

        Person[] people = {emily, audrey, rick};

        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());


        Person newGuy = new Person("Ava");
        people = addPerson(people,newGuy);
        // OR
        // people = addPerson(people, new Person ("Ava");
//        System.out.println(people.length);
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson (Person[] people, Person newPerson) {

        Person [] newArray = Arrays.copyOf(people, people.length+1);
        newArray [newArray.length-1] = newPerson;
        return newArray;
    }
}

package grades;

import java.util.ArrayList;

public class Student {

    private int grade;
    private String Name;

    // returns the student's name
    public String getName() {
        return this.Name;
    }

    // adds the given grade to the grades property
    public int addGrade(int grade) {
        return this.grade;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        return (double) this.grade / grades.size();
    }

    ArrayList<Integer> grades = new ArrayList<>();



}

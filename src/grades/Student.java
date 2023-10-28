package grades;

import java.util.ArrayList;

public class Student {


    protected String name;
    ArrayList<Integer> grades;


    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
            int total = 0;
        for(int grade: grades) {
            total += grade;
        }
        return (double) total/grades.size();
    }

    public String toString() {
        return getName();
    }

}

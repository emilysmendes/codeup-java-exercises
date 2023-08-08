package Shapes;

import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter a decimal number for the radius of a circle");
        Circle myCircle = new Circle(radius);

        System.out.printf("The area of your circle is %2%f and the circumference is %2%f%n", myCircle.getArea(), myCircle.getCircumference());
    }
}

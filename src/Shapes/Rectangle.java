package Shapes;

// TODO: create a class named Rectangle.
public class Rectangle {

    protected double length;
    protected double width;


// TODO: Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties. //
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

// TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. //
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }




};

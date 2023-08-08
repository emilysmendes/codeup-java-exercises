package Shapes;

// TODO: Create a class named Square, also inside of shapes, that extends Rectangle //
//public class Square extends Rectangle{
//    double side;
//
//    // TODO: Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side. //
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        return (int) (Math.pow(this.side, 2));
//    }
//
//    public double getPerimeter(){
//        return (4 * this.side);
//    }

//}

public class Square extends Quadrilateral {

    double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
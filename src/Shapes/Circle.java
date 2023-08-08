package Shapes;

public class Circle {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
//        area = pi x (radius ^ 2)
            return Math.PI * Math.pow(this.radius, 2);
        }

        public double getCircumference() {
//        circumference = 2 x pi x radius
            return 2 * Math.PI * this.radius;
        }
    }


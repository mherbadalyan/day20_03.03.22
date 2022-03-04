package task1;

public class Circle extends Shape{
        private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
//        System.out.println("Area of circle = " +);
        return  Math.PI * Math.pow(radius,2);
    }

    @Override
    protected double getPerimeter() {
        return 4 * Math.PI * radius;
    }
}

package task1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(10);
        System.out.println("Area of square = " + square.getArea() + " and perimeter = "+ square.getPerimeter());
        System.out.println("Area of circle = " + circle.getArea() + " and perimeter = "+ circle.getPerimeter());
    }
}

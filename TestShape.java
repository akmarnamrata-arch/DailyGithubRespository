
import java.util.Scanner;

// Abstract Class
abstract class Shape {
    abstract void area();
}

// Circle Class
class Circle extends Shape {
    double radius;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Rectangle Class
class Rectangle extends Shape {
    double length;
    double width;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Main Class
class TestShape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Enter Circle Details");
        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        System.out.println("\nEnter Rectangle Details");
        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Width: ");
        r.width = sc.nextDouble();

        System.out.println("\n----- Result -----");

        c.area();
        r.area();

        sc.close();
    }
}
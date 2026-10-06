// Abstract class cannot be instantiated directly
abstract class Shape {

    String name;

    // Abstract classes can have constructors
    Shape(String name) {
        this.name = name;
    }

    // Concrete method shared by subclasses
    void displayName() {
        System.out.println("Shape: " + name);
    }

    // Abstract method has no implementation here
    abstract double area();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        // Initialize parent part of object
        super("Circle");

        this.radius = radius;
    }

    // Subclass must implement abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        // Parent reference, child object
        Shape shape = new Circle(5);

        shape.displayName();
        System.out.println(shape.area());

        // ERROR:
        // Shape shape2 = new Shape("Shape");
    }
}
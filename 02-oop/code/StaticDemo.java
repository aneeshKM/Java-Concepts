class Counter {

    // Shared across every Counter object
    static int totalObjects = 0;

    // Separate value for every object
    int objectNumber;

    // Runs once when the class is loaded
    static {
        System.out.println("Static block executed");
    }

    // Runs before constructor for every new object
    {
        System.out.println("Instance initialization block executed");
    }

    Counter() {

        totalObjects++;

        objectNumber = totalObjects;
    }

    // Static method belongs to class
    static void showTotal() {
        System.out.println("Total objects: " + totalObjects);
    }

    // Instance method belongs to object
    void showObjectNumber() {
        System.out.println("Object number: " + objectNumber);
    }
}

class Parent {

    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {

    // Static methods are hidden, not overridden
    static void display() {
        System.out.println("Child static method");
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.showObjectNumber(); // 1
        c2.showObjectNumber(); // 2

        // Preferred way to access static method
        Counter.showTotal(); // 2

        Parent reference = new Child();

        // Determined by reference type because method is static
        reference.display(); // Parent static method
    }
}
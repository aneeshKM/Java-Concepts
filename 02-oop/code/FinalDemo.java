class Parent {

    // Final method cannot be overridden
    final void display() {
        System.out.println("Final method");
    }
}

class Child extends Parent {

    // ERROR:
    // void display() {}
}

// Final class cannot be extended
final class Utility {

    void work() {
        System.out.println("Working");
    }
}

// ERROR:
// class AdvancedUtility extends Utility {}

public class FinalDemo {

    public static void main(String[] args) {

        // Final primitive cannot be reassigned
        final int number = 10;

        // ERROR:
        // number = 20;

        // Final reference cannot point to another object
        final StringBuilder text = new StringBuilder("Java");

        // But the object itself can still be modified
        text.append(" Programming");

        System.out.println(text);

        // ERROR:
        // text = new StringBuilder("Python");
    }
}
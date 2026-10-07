class Outer {

    private int value = 100;

    // Static nested class
    // Does not need an Outer object
    static class StaticNested {

        void display() {
            System.out.println("Static nested class");
        }
    }

    // Member inner class
    // Belongs to an Outer object
    class Inner {

        void display() {

            // Inner class can access Outer instance members
            System.out.println("Outer value: " + value);
        }
    }

    void demonstrateLocalClass() {

        // Local class exists only inside this method
        class Local {

            void display() {
                System.out.println("Local class");
            }
        }

        Local local = new Local();
        local.display();
    }
}

interface Greeting {

    void sayHello();
}

public class NestedClassDemo {

    public static void main(String[] args) {

        // Static nested class does not require Outer instance
        Outer.StaticNested nested =
                new Outer.StaticNested();

        nested.display();

        // Create Outer object first
        Outer outer = new Outer();

        // Inner class requires an Outer object
        Outer.Inner inner =
                outer.new Inner();

        inner.display();

        // Demonstrate local class
        outer.demonstrateLocalClass();

        // Anonymous class - class without a name
        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };

        greeting.sayHello();
    }
}
class Person {

    String name;

    // No-argument constructor
    Person() {

        // Calls another constructor in the same class
        this("Unknown");

        System.out.println("Person() constructor");
    }

    // Overloaded constructor
    Person(String name) {
        this.name = name;

        System.out.println("Person(String) constructor");
    }
}

class Employee extends Person {

    int id;

    // No-argument constructor
    Employee() {

        // Calls another Employee constructor
        this(0, "Unknown");

        System.out.println("Employee() constructor");
    }

    Employee(int id, String name) {

        // Calls parent class constructor
        super(name);

        this.id = id;

        System.out.println("Employee(int, String) constructor");
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // Constructor chain:
        // Person(String)
        // Employee(int, String)
        // Employee()
        Employee employee = new Employee();

        System.out.println(employee.id);
        System.out.println(employee.name);
    }
}
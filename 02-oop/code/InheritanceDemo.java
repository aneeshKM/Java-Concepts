class Animal {

    // Method inherited by child classes
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog IS-A Animal
class Dog extends Animal {

    // Method specific to Dog
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Inherited from Animal
        dog.eat();

        // Defined inside Dog
        dog.bark();
    }
}
class Animal {

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    // Replace parent implementation
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Parent reference pointing to child object
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Runtime polymorphism:
        // Actual object determines which overridden method runs
        animal1.makeSound(); // Dog barks
        animal2.makeSound(); // Cat meows
    }
}
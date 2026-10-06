class Animal {

    Animal reproduce() {
        System.out.println("Animal reproduction");

        return new Animal();
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    // Covariant return type:
    // Dog is a subtype of Animal
    @Override
    Dog reproduce() {
        System.out.println("Dog reproduction");

        return new Dog();
    }

    @Override
    void sound() {

        // Call parent's version first
        super.sound();

        // Then add child-specific behavior
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();

        Dog puppy = dog.reproduce();
    }
}
class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    // Car HAS-A Engine
    private Engine engine;

    Car() {

        // Car creates and owns an Engine object
        engine = new Engine();
    }

    void startCar() {

        // Delegate work to collaborating object
        engine.start();

        System.out.println("Car started");
    }
}

public class CompositionDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}
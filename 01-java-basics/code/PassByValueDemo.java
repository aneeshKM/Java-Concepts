public class PassByValueDemo {

    static class Person {

        String name;

        Person(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {

        // 1. Primitive
        int number = 10;

        changePrimitive(number);

        System.out.println("Primitive after method: " + number);


        // 2. Object mutation
        Person person = new Person("Aneesh");

        changeName(person);

        System.out.println("After object mutation: " + person.name);


        // 3. Reference reassignment
        reassignObject(person);

        System.out.println("After reference reassignment: " + person.name);
    }


    static void changePrimitive(int value) {

        value = 100;

        System.out.println("Inside changePrimitive: " + value);
    }


    static void changeName(Person person) {

        person.name = "John";
    }


    static void reassignObject(Person person) {

        person = new Person("Mike");

        System.out.println("Inside reassignObject: " + person.name);
    }
}
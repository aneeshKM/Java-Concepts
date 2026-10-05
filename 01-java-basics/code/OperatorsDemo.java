public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. Arithmetic operators
        System.out.println("Arithmetic Operators:");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        // 2. Relational operators
        System.out.println("\nRelational Operators:");

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));


        // 3. Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        // 4. Bitwise operators
        int p = 5;   // 0101
        int q = 3;   // 0011

        System.out.println("\nBitwise Operators:");

        System.out.println("p & q: " + (p & q));
        System.out.println("p | q: " + (p | q));
        System.out.println("p ^ q: " + (p ^ q));
        System.out.println("p << 1: " + (p << 1));
        System.out.println("p >> 1: " + (p >> 1));


        // 5. Short-circuit operators
        int number = 10;

        System.out.println("\nShort Circuit:");

        if (number > 0 && number++ > 5) {
            System.out.println("Condition true");
        }

        System.out.println("number after &&: " + number);

        int value = 10;

        if (value > 0 || value++ > 5) {
            System.out.println("OR condition true");
        }

        // value++ is not executed because first condition is true
        System.out.println("value after ||: " + value);
    }
}
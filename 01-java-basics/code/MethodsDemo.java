public class MethodsDemo {

    public static void main(String[] args) {

        // Method with parameters and return value
        int result = add(10, 20);

        System.out.println("Addition: " + result);


        // Method with no return value
        printMessage("Hello Java");


        // Varargs
        int total = sum(10, 20, 30, 40);

        System.out.println("Varargs sum: " + total);


        // Scope
        int mainValue = 100;

        System.out.println("mainValue: " + mainValue);


        // Recursion
        int factorialResult = factorial(5);

        System.out.println("Factorial: " + factorialResult);
    }


    // Parameters + return value
    static int add(int a, int b) {
        return a + b;
    }


    // Parameter + void
    static void printMessage(String message) {
        System.out.println("Message: " + message);
    }


    // Varargs
    static int sum(int... numbers) {

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }


    // Recursive method
    static int factorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
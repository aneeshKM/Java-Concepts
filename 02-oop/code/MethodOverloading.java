public class MethodOverloading {

    // Same method name, different parameter types/counts

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        // Compiler selects add(int, int)
        System.out.println(add(10, 20));

        // Compiler selects add(double, double)
        System.out.println(add(10.5, 20.5));

        // Compiler selects add(int, int, int)
        System.out.println(add(10, 20, 30));
    }
}
public class TypeCastingDemo {

    public static void main(String[] args) {

        // 1. Widening casting - automatic
        int intValue = 100;
        double doubleValue = intValue;
        // double anotherDoubleValue = intValue + 0.5; // int is promoted to double during addition
        System.out.println("Widening:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);


        // 2. Narrowing casting - explicit
        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println("\nNarrowing:");
        System.out.println("double: " + price);
        System.out.println("int: " + wholePrice);


        // 3. Numeric promotion
        byte a = 10;
        byte b = 20;

        // byte + byte becomes int
        int sum = a + b;

        System.out.println("\nNumeric Promotion:");
        System.out.println("byte + byte = int: " + sum);


        // 4. Overflow
        int max = Integer.MAX_VALUE;

        System.out.println("\nOverflow:");
        System.out.println("Max int: " + max);
        System.out.println("Max int + 1: " + (max + 1));


        // 5. Precision loss
        double preciseValue = 123.987654;
        float lessPreciseValue = (float) preciseValue;

        System.out.println("\nPrecision Loss:");
        System.out.println("double: " + preciseValue);
        System.out.println("float: " + lessPreciseValue);


        // 6. Large number narrowed to byte
        int number = 130;
        byte smallNumber = (byte) number;

        System.out.println("\nNarrowing with overflow:");
        System.out.println("int: " + number);
        System.out.println("byte: " + smallNumber);
    }
}
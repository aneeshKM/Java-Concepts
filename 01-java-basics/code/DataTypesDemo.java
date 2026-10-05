public class DataTypesDemo {
    
    public static void main(String args[]){

        // 1. Primitive data types

        byte byteVal = 100;
        short shortVal = 1000;
        int intVal = 10000;
        long longVal = 100000;
        float floatVal = 3.14f;
        double doubleVal = 3.1459;

        char charVal = 'A';
        boolean booleanVal = true;
       

        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(charVal);
        System.out.println(booleanVal);

        // 2. Reference Data Types
        String stringVal = "Abc";
        System.out.println(stringVal);

        int[] nums = {1,2,3,4};
        System.out.println("nums: " + nums);

        DataTypesDemo dataTypesDemo = new DataTypesDemo();
        System.out.println("Object: " + dataTypesDemo);

        // 3. Wrapper classes
        Integer integerWrapper = Integer.valueOf(50);
        Double doubleWrapper = Double.valueOf(20.5);
        Boolean booleanWrapper = Boolean.valueOf(true);
        Character characterWrapper = Character.valueOf('Z');

        System.out.println("\nInteger wrapper: " + integerWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Boolean wrapper: " + booleanWrapper);
        System.out.println("Character wrapper: " + characterWrapper);

        // 4. Autoboxing
        int primitiveInt = 100;
        Integer boxedInt = primitiveInt;

        System.out.println("\nPrimitive int: " + primitiveInt);
        System.out.println("Autoboxed Integer: " + boxedInt);


        // 5. Unboxing
        Integer wrappedNumber = 200;

        int unboxedNumber = wrappedNumber;

        System.out.println("Wrapped Integer: " + wrappedNumber);
        System.out.println("Unboxed int: " + unboxedNumber);


        // 6. Useful wrapper operations
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);

        System.out.println("\nParsed String to int: " + parsedNumber);

        String convertedBack = Integer.toString(parsedNumber);

        System.out.println("int converted to String: " + convertedBack);

    }
}

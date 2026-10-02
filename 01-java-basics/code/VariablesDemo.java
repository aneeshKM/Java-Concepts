public class VariablesDemo {

    //instance variable
    int x;

    static String name = "Aneesh";

    public static void main(String[] args) {
        //local variable
        int y = 10;

        VariablesDemo obj = new VariablesDemo();
        obj.x = 5;

        System.out.println("Instance variable x: " + obj.x);
        System.out.println("Local variable y: " + y);
        System.out.println("Static variable name: " + name);
    }
    
}

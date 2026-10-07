package package1;

public class Parent {

    // Accessible everywhere
    public int publicValue = 10;

    // Accessible in same package
    // and subclasses in other packages
    protected int protectedValue = 20;

    // No modifier = package-private
    // Accessible only inside package1
    int packageValue = 30;

    // Accessible only inside Parent
    private int privateValue = 40;

    public void showPrivateValue() {

        // Private member is accessible inside its own class
        System.out.println(privateValue);
    }
}

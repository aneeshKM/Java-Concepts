package package2;

import package1.Parent;

// Child is in a different package
class Child extends Parent {

    void test() {

        // public inherited member
        System.out.println(publicValue);

        // protected accessible through inheritance
        System.out.println(protectedValue);

        // package-private is not inherited across packages
        // System.out.println(packageValue);

        // private is accessible only inside Parent
        // System.out.println(privateValue);
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        Parent parent = new Parent();

        // public is accessible everywhere
        System.out.println(parent.publicValue);

        // protected is not accessible through a normal
        // Parent object from another package
        // System.out.println(parent.protectedValue);

        // package-private is unavailable outside package1
        // System.out.println(parent.packageValue);

        // private is unavailable outside Parent
        // System.out.println(parent.privateValue);

        // Public method can internally access private field
        parent.showPrivateValue();

        Child child = new Child();

        // Child can access inherited protected member
        child.test();
    }
}

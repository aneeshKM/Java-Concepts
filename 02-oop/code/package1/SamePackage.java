package package1;

public class SamePackage {

    public void test() {

        Parent parent = new Parent();

        // public - accessible
        System.out.println(parent.publicValue);

        // protected - accessible because same package
        System.out.println(parent.protectedValue);

        // package-private - accessible because same package
        System.out.println(parent.packageValue);

        // private - not accessible outside Parent
        // System.out.println(parent.privateValue);
    }
}

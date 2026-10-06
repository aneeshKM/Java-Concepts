class Student {

    // Instance variables - every object gets its own copy
    String name;
    int age;

    // Instance method - works with the state of the current object
    void introduce() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        // Create first Student object
        Student student1 = new Student();
        student1.name = "Aneesh";
        student1.age = 25;

        // Create second Student object
        Student student2 = new Student();
        student2.name = "Rahul";
        student2.age = 23;

        student1.introduce();
        student2.introduce();

        // Changing student1 does not affect student2
        student1.age = 26;

        System.out.println(student1.age); // 26
        System.out.println(student2.age); // 23
    }
}
import java.util.Objects;

class Employee {

    private final int id;
    private final String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        // Same reference means definitely equal
        if (this == obj) {
            return true;
        }

        // Check object type
        if (!(obj instanceof Employee)) {
            return false;
        }

        // Safe cast after type check
        Employee other = (Employee) obj;

        // Compare object values
        return id == other.id
                && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {

        // Equal objects must produce equal hash codes
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {

        // Human-readable object representation
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Aneesh");
        Employee e2 = new Employee(1, "Aneesh");

        // == compares references
        System.out.println(e1 == e2); // false

        // equals() compares logical values
        System.out.println(e1.equals(e2)); // true

        // Same because e1 and e2 are equal
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        // Automatically calls toString()
        System.out.println(e1);
    }
}
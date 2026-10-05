public class ConditionalDemo {

    public static void main(String[] args) {

        int age = 20;

        // 1. if / else
        System.out.println("If / Else:");

        if (age < 18) {
            System.out.println("Minor");
        } else if (age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }


        // 2. Traditional switch statement
        int day = 2;

        System.out.println("\nTraditional Switch:");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Unknown day");
        }


        // 3. Switch expression
        System.out.println("\nSwitch Expression:");

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println(dayName);


        // 4. Ternary operator
        int number = 10;

        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println("\nTernary:");
        System.out.println(result);
    }
}
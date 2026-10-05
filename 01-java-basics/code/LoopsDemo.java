public class LoopsDemo {

    public static void main(String[] args) {

        // 1. for loop
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. while loop
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // 3. do-while loop
        System.out.println("\nDo-While Loop:");

        int j = 10;

        do {
            System.out.println(j);    // This will execute once
            j++;
        } while (j <= 5);


        // 4. Enhanced for loop
        System.out.println("\nEnhanced For Loop:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            System.out.println(number);
        }


        // 5. break
        System.out.println("\nBreak:");

        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                break;
            }

            System.out.println(k);
        }


        // 6. continue
        System.out.println("\nContinue:");

        for (int k = 1; k <= 5; k++) {

            if (k == 3) {
                continue;
            }

            System.out.println(k);
        }
    }
}
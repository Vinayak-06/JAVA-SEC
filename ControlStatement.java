import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. IF-ELSE
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }


        // 2. FOR LOOP
        System.out.println("\nFor Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }


        // 3. WHILE LOOP
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }


        // 4. DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");

        int j = 1;

        do {
            System.out.println("Number: " + j);
            j++;
        } while (j <= 5);


        // 5. SWITCH CASE
        System.out.print("\nEnter a number between 1 and 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected One.");
                break;

            case 2:
                System.out.println("You selected Two.");
                break;

            case 3:
                System.out.println("You selected Three.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

package se.lexicon;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        System.out.println("Basic Iteration");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Even numbers");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Using Continue to skip an iteration");
        for (int i = 1; i <= 10; i++) {
            if (i == 6)
                continue;
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("Using Break to stop the loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 8)
                break;
            System.out.println(i);
        }

        System.out.println("For each loop");
        int[] arr = {1,2,3,4,5};
        for (int item : arr)
        {
            System.out.println(item);
        }


        System.out.println("While Loop:");

        // Scanner
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        while (!loggedIn){
            System.out.println("Enter Username:");
            String username = scanner.nextLine();
            System.out.println("Enter password");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("123456")){
                loggedIn = true;
                System.out.println("Login successful! Welcome to My App");
            } else {
                System.out.println("Incorrect credentials, try again.");
            }
        }

        System.out.println("Do While:");

        boolean isContinue = false;
        do{
            System.out.println("1. Order Burger");
            System.out.println("2. Order Pizza");
            System.out.println("3. Logout");
        } while (isContinue);
    }
}

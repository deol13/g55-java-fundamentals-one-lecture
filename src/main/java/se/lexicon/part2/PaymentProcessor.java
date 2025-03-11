package se.lexicon.part2;

public class PaymentProcessor {

    public static void processPayment(String cardNumber, String cvv, double amount){
        System.out.println("Processing credit card payment...");
    }

    public static void processPayment(String backAccount, String swiftCode, double amount, String currency){
        System.out.println("Processing bank transfer payment...");
    }
}

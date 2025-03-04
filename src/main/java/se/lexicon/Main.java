package se.lexicon;

public class Main {
    public static void main(String[] args) {
        HelloWorld.printMenu();
        double result = HelloWorld.fahrenhietToCelsius(100);
        System.out.println(result);

        System.out.println(Calculator.addition(10, 5));
    }
}

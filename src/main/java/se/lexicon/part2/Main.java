package se.lexicon.part2;

public class Main {
    public static void main(String[] args) {
        //System.out.println(MathOperator.add(25.0, 20));

        System.out.println(NumberGenerator.generateRandomNumber());
        System.out.println(NumberGenerator.generateRandomNumber(10, 100));
        System.out.println(NumberGenerator.generateRandomUUID());
    }
}

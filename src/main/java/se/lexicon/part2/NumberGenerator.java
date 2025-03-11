package se.lexicon.part2;

import java.util.Random;
import java.util.UUID;

public class NumberGenerator {

    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt();
    }

    public static int generateRandomNumber(int min, int max){ //min: 10 - max: 80
        Random random = new Random();
        // It generats a number between 0 and max, so we need to reduce max by min before so we can later add it back to make it between min and max.
        // nextInt(0-79) so we need to reduce it to nextInt(0-69) then add 1 and min(10) to make it 10-80
        return random.nextInt(max - min + 1) + min;
    }

    public static String generateRandomUUID(){
        return UUID.randomUUID().toString();
    }
}

package se.lexicon.part2;

import java.util.UUID;

public class StringDemo {
    public static void main(String[] args) {
        //String greetings = new String("Hello");
        String greetings = "Hello";
        greetings = greetings.concat(" World!"); //Hello World!

        String str = "Hello, World!";
        System.out.println("Length: " + str.length()); //Output: 13

        System.out.println("Character at index 2: " + str.charAt(2)); //l

        System.out.println("-----------------------");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // To call a static method ClassName.methodName();
        System.out.println("Exercise one: ");
        exOne();
        System.out.println("Exercise two: ");
        exTwo();
        System.out.println("Exercise three: ");
        exThree();

    }

    public static void exOne() {
        String string = "Hello Strings";
        int index1 = string.indexOf("lo"); //Output: 3
        int index2 = string.indexOf('s'); //Output 12 case sensitive
        System.out.println("Index1: " + index1);
        System.out.println("Index2: " + index2);
    }

    public static void exTwo(){
        String welcome = "Welcome";
        System.out.println(welcome.substring(3)); // come
        System.out.println(welcome.substring(1,5)); // elco
        // index number 5 is exclusive
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid.substring(3,8).toUpperCase());
    }

    public static void exThree(){
        String text1 = "java";
        String text2 = "Java";
        System.out.println(text1.equalsIgnoreCase(text2)); // true
        System.out.println(text1.equals(text2)); // false

    }
}

package se.lexicon;


public class HelloWorld {
    //This is a single line comment

    /*
    This is a regular multi-line comment
    */

    /**
     * This is a Java Doc (Documentation comment)
     * ##Used to create documentation for **Java Code**
     * @param args
     */
    // psvm + Tab
    public static void main(String[] args) {

        // sout + tab
        System.out.println("Hello World!");

        // Variables
        // [data type] [variableName]
        int speed;
        speed = 100;

        double salary = 50000.55;
        char grade = 'A';
        char specialChar = '\u2764'; // A heart character.
        boolean isActive = true;
        boolean isReserved = false;

        long balance = 500000000000L; // You need to end it with l or L to show its a long, otherwise it will be taken as an int.
        double area = 20.55;
        int setNumber = 100;
        int studentId = 5000;

        System.out.println("Speed: " + speed);
        System.out.println("------------------");

        int number1 = 10;
        int number2 = 5;

        int additionResult = number1 + number2;
        System.out.println("Addition: " + additionResult);
        int subtractionResult = number1 - number2;
        System.out.println("Subtraction: " + subtractionResult);
        // * / %
        int division = number1 / number2; // returns the quotient
        System.out.println("Division: " + division);
        int modules = number1 % number2; // returns the remainder of the division
        System.out.println("Modules: " + modules);

        // Increment (++) and Decrement (--) operators
        int counter = 0;
        System.out.println(counter++); // Output: 0
        System.out.println(++counter); // Output: 2

        int num1 = 500, num2 = 200, num3 = 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // (==, !=, <, >, <=, >=)
        boolean isEqual = num1 == num2; // false
        System.out.println("Is Equal: " + isEqual);
        boolean isGreaterThan = num1 > num2; // true
        System.out.println("Is Greater Than: " + isGreaterThan);

        int age = 16;
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        } else{
            System.out.println("You are not eligible to vote.");
        }

        // Use if you have multiple conditions
        int marks = 85;
        if (marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 55 && marks <= 60) {
            System.out.println("Grade FX");
        } else {
            System.out.println("Grade F");
        }

        // Use if you have single and simple condition
        int dayOfWeek = 3;
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        String firstName = "Dennis";
        String lastName = "Olsen";
        String name = firstName.concat(" ").concat(lastName);
        System.out.println(name);

        System.out.println("------------------");
        Person object1 = new Person();
        object1.firstName = "Dennis";
        object1.lastName = "Olsen";

        Person object2 = new Person();
        object2.firstName = "Elnaz";
        object2.lastName = "Azizi";

        System.out.println(object1.fullName()); // Dennis Olsen
        System.out.println(object2.fullName()); // Elnaz Azizi

    }

    // Reformat the code: Ctrl + Alt + L
}

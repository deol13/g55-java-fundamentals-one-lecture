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
    }

    // Reformat the code: Ctrl + Alt + L
}

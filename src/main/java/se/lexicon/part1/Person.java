package se.lexicon.part1;

public class Person { // Blueprint - Template

    // Fields
    String firstName;
    String lastName;
    int age;
    String hobby;

    // Methods
    public String fullName(){
        return firstName + " " + lastName;
    }
}

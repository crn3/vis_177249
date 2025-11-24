package main;

import java.util.Scanner;

/**
 * Creates a person object using user input.
 */

public final class CreatePerson {

    // Private constructor for utility class
    private CreatePerson() { }

    /**
     * Main method to create a Person object
     * using user input and print Person details.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        while (!name.matches("[a-zA-Z ]+")) {
            System.out.print("Enter a valid name: ");
            name = scanner.nextLine();
        }
        System.out.print("Enter age: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter an int: ");
            scanner.next();
        }
        age = scanner.nextInt();

        scanner.close();

        final Person person = new Person(name, age);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

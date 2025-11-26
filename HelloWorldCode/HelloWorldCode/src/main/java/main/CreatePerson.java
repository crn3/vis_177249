package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 * Creates a person object using user input.
 */

public final class CreatePerson {

    // Creating a logger
    private static final Logger LOGGER =
    Logger.getLogger(CreatePerson.class.getName());
    
    // Private constructor for utility class
    private CreatePerson() { }

    /**
     * Main method to create a new Person object
     * using user input and print Person details.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args) {

        LOGGER.info("Begin application.");

        final Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        while (!name.matches("[a-zA-Z ]+")) {
            LOGGER.log(Level.WARNING, "Invalid name input: {0}", name);
            System.out.print("Enter a valid name: ");
            name = scanner.nextLine();
        }
        LOGGER.info("Valid name entered.");
        System.out.print("Enter age: ");
        while (!scanner.hasNextInt()) {
            LOGGER.log(Level.WARNING, "Invalid age input: {0}", scanner.next());
            System.out.print("Enter an int: ");
            scanner.next();
        }
        age = scanner.nextInt();
        LOGGER.info("Valid age entered.");

        scanner.close();

        final Person person = new Person(name, age);
        LOGGER.info("Person created.");

        System.out.println(person.getName());
        System.out.println(person.getAge());

        LOGGER.info("End applicaiton.");


    }
}

package main;


import java.util.Scanner;

/**
 * Creates a person object using user input
 */

public class CreatePerson {
	
	/**
	 * Main method to create a Person object using user input and printing Person details
	 * @param args user inputed name and age
	 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter name: ");
        name = scanner.nextLine();
        while(!name.matches("[a-zA-Z ]+")){
            System.out.print("Enter a valid name: ");
            name = scanner.nextLine();
        }
        System.out.print("Enter age: ");
        while(!scanner.hasNextInt()){
            System.out.print("Enter an int: ");
            scanner.next();
        }
        age = scanner.nextInt();

        scanner.close();

        Person person = new Person(name, age);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

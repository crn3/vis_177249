package main;

/**
 * Creates a person with a name and age.
 *
 * @author Rachael Kenny
 * @version 1.0
 */
public class Person {

    /** The person's name. */
    private String name;
    /** The person's age. */
    private int age;

    /**
     * Constructs a new Person with a name and age.
     *
     * @param personName the person's name
     *
     * @param personAge the person's age
     */
    public Person(final String personName, final int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    /**
     * Sets the person's name.
     *
     * @param personName the person's name
     */
    public void setName(final String personName) {
        this.name = personName;
    }

    /**
     * Returns the person's name.
     *
     * @return the person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the person's age.
     *
     * @param personAge the person's age
     */
    public void setAge(final int personAge) {
        this.age = personAge;
    }

    /**
     * Returns the person's age.
     *
     * @return the person's age
     */
    public int getAge() {
        return this.age;
    }
}

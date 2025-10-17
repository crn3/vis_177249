/**
     * Creates a person with a name and age
     * @author Rachael Kenny
     * @version 1.0
     */
public class Person {
    

    private String name;
    private int age;

    /**
     * Constructs a new Person with a name and age 
     * @param name the person's name
     * @param age the person's age
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** 
     * Sets the person's name 
     * @param name the person's name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Returns the person's name
     * @return the person's name 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the person's age
     * @param age the person's age 
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the person's age
     * @return the person's age 
     */
    public int getAge() {
        return this.age;
    }
}
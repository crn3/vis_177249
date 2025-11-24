package tests;

import static org.junit.Assert.assertEquals;

import main.Person;
import org.junit.Test;

/**
 * Unit tests for Person age methods.
 */
public class PersonAgeTest {

    /**
     * New Person's age.
     */
    private static final int AGE_NEW = 101;
    /**
     * New Person's initial age.
     */
    private static final int AGE_INITIAL = 55;
    /**
     * New Person's changed age.
     */
    private static final int AGE_CHANGED = 56;

    /**
     * Test that getAge returns the correct age.
     */
    @Test
    public void testGetAge() {
        final Person person = new Person("Joe Bloggs", AGE_NEW);
        assertEquals(AGE_NEW, person.getAge());

    }

    /**
     * Test that setAge updates the person's age correctly.
     */
    @Test
    public void testSetAge() {
        Person person = new Person("John Doe", AGE_INITIAL);
        person.setAge(AGE_CHANGED);
        assertEquals(AGE_CHANGED, person.getAge());
    }
}

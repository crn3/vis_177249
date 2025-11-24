package tests;

import static org.junit.Assert.assertEquals;

import main.Person;
import org.junit.Test;

/**
 * Unit tests for Person name methods.
 */
public class PersonNameTest {

    /**
     * New Person's age.
     */
    private static final int AGE = 33;

    /**
     * Test that getName returns the correct name.
     */
    @Test
    public void testGetName() {
        final Person person = new Person("Joe Bloggs", AGE);
        assertEquals("Joe Bloggs", person.getName());
    }

    /**
     * Test that setName updates the person's name correctly.
     */
    @Test
    public void testSetName() {
        final Person person = new Person("Joe Bloggs", AGE);
        person.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", person.getName());
    }
}

package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Person;

/**
 * Unit tests for Person name methods.
 */
public class PersonNameTest {

    private static final int AGE = 33;

    @Test
    public void testGetName() {
        final Person person = new Person("Joe Bloggs", AGE);
        assertEquals("Joe Bloggs", person.getName());
    }

    @Test
    public void testSetName() {
        final Person person = new Person("Joe Bloggs", AGE);
        person.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", person.getName());
    }
}
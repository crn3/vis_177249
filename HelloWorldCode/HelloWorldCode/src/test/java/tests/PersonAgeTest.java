package tests;

import static org.junit.Assert.assertEquals;

import main.Person;
import org.junit.Test;

/**
 * Unit tests for Person age methods.
 */
public class PersonAgeTest {

    private static final int AGE_NEW = 101;
    private static final int AGE_INITIAL = 55;
    private static final int AGE_CHANGED = 56;

    @Test
    public void testGetAge() {
        final Person person = new Person("Joe Bloggs", AGE_NEW);
        assertEquals(AGE_NEW, person.getAge());

    }

    @Test
    public void testSetAge() {
        Person person = new Person("John Doe", AGE_INITIAL);
        person.setAge(AGE_CHANGED);
        assertEquals(AGE_CHANGED, person.getAge());
    }
}

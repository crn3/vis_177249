package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Person;

public class PersonNameTest {

    @Test
    public void testGetName() {
        Person person = new Person("Joe Bloggs", 33);
        assertEquals("Joe Bloggs", person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person("Joe Bloggs", 33);
        person.setName("Jane Bloggs");
        assertEquals("Jane Bloggs", person.getName());
    }
}

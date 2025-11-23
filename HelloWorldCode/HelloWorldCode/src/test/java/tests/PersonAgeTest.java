package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Person;

public class PersonAgeTest {

    @Test
    public void testGetAge() {
        Person person = new Person("Joe Bloggs", 101);
        assertEquals(101, person.getAge());

    }
    @Test
    public void testSetAge() {
        Person person = new Person("John Doe", 55);
        person.setAge(56);
        assertEquals(56, person.getAge());

    }
}

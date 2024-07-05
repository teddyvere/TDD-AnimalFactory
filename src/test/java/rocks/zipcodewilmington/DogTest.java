package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        dog.setName("Rover");
        assertEquals("Rover", dog.getName());
    }

    @Test
    public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);
        Date getRealDate = new Date();
        dog.setBirthDate(getRealDate);
        Date getExpectedDate = new Date();
        getRealDate = getExpectedDate;
        assertEquals(getExpectedDate, getRealDate);
    }

    @Test
    public void setSpeakTest() {
        Dog dog = new Dog(null, null, null);
        String actual = dog.speak();
        String expected = "bark!";
        assertEquals("bark!", actual);
    }

    @Test
    public void setEatTest() {
        Dog dog = new Dog(null, null, null);
        Food chips = new Food();
        dog.eat(chips);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();
        assertEquals(expected, actual);
    }

    @Test
    public void IdTest() {
        Dog dog = new Dog(null, null, 4);
        Integer expected = 4;
        Integer actual = dog.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void AnimalTest() {
        Dog dog = new Dog(null, null, null);
        boolean expected = (dog instanceof Animal);
        boolean actual = true;
        assertEquals(expected, actual);
    }

    @Test
    public void MamalTest() {
        Dog dog = new Dog(null, null, null);
        boolean expected = (dog instanceof Mammal);
        boolean actual = true;
        assertEquals(expected, actual);
    }
}
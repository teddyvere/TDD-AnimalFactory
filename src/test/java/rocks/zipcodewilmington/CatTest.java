package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }
   @Test
   public void testCatName(){
       Cat cat = new Cat();
       cat.setName("Mittens");
       assertEquals("Mittens", cat.getName());
   }

   @Test
    public void testCatBirthDate(){
        Cat cat = new Cat();
        Date getRealDate = new Date();
        cat.setBirthDate(getRealDate);
        Date getExpectedDate = new Date();
        getRealDate = getExpectedDate;
        assertEquals(getExpectedDate, getRealDate);
   }

   @Test
    public void testSpeak(){
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "meow!";
        assertEquals("meow!",actual);
   }

   @Test
    public void testEat(){
        Cat cat = new Cat();
        Food chips = new Food();
        cat.eat(chips);
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        assertEquals(expected,actual);
   }
   @Test
   public void testGetID(){
        Cat cat = new Cat(null, null , 4);
        Integer expected = 4;
        Integer actual = cat.getId();
        assertEquals(expected,actual);
   }
    @Test
   public void aminalInheritanceTest(){
        Cat cat = new Cat();
        boolean expected = (cat instanceof Animal);
        boolean actual = true;
        assertEquals(expected,actual);
   }
    @Test
    public void mamalInheritanceTest(){
        Cat cat = new Cat();
        boolean expected = (cat instanceof Mammal);
        boolean actual = true;
        assertEquals(expected,actual);
    }
}





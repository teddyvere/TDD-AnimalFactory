package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import static org.junit.Assert.assertEquals;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        AnimalFactory dogfactory = new AnimalFactory();
        Dog dog = new Dog();
        Date dogbirthday = new Date();

        String name = "Rover";

        Dog rover = dogfactory.createDog(name, dogbirthday);
        assertEquals(name, rover.getName());
    }
    @Test
    public void createCatTest() {
        AnimalFactory catfactory = new AnimalFactory();
        Cat cat = new Cat();
        Date catbirthday = new Date();

        String name = "Mittens";

        Dog rover = catfactory.createDog(name, catbirthday);
        assertEquals(name, rover.getName());

    }
}

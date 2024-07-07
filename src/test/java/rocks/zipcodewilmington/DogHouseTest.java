package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest (){
        DogHouse.clear();
        Date date = new Date(2003,05,02);
        Dog moka = AnimalFactory.createDog("moka", date);
        DogHouse.add(moka);
        Assert.assertEquals(1, DogHouse.getNumberOfDogs(), 0.002);
    }

    @Test
    public void removeIdTest(){
        DogHouse.clear();
        Date date = new Date(2007, 3,9);
        Dog moka = AnimalFactory.createDog("moka", date);
        DogHouse.add(moka);
        DogHouse.remove(1);
        Assert.assertEquals(0,moka.getId(),0.04);
    }

    @Test
    public void removeDogTest(){
        DogHouse.clear();
        Date date = new Date(2021, 5,1);
        Dog moka = AnimalFactory.createDog("moka", date);
        DogHouse.add(moka);
        DogHouse.remove(moka);
        Assert.assertEquals(0,moka.getId(),0.03);
    }

    @Test
    public void getDogByIDTest(){
        DogHouse.clear();
        Date date = new Date(2011,4,1);
        Dog moka = AnimalFactory.createDog("moka", date);
        DogHouse.add(moka);
        Assert.assertEquals(moka, DogHouse.getDogById(0));
    }

    @Test
    public void getNumberOfDogs(){
        DogHouse.clear();
        Date date = new Date(2014, 5,6);
        Dog moka = AnimalFactory.createDog("moka", date);
        Dog kuma = AnimalFactory.createDog("kuma", date);
        Dog sora = AnimalFactory.createDog("sora", date);
        DogHouse.add(sora);
        DogHouse.add(moka);
        DogHouse.add(kuma);
        Integer dogs = 3;
        Assert.assertEquals(dogs, DogHouse.getNumberOfDogs());
    }
}
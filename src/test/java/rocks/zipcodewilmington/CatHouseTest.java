package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    //please run each test separately for best results
    @Test
    public void getAddedCatTest(){
        CatHouse.clear();
        Date date = new Date(2004,3,2);
        Cat stinky = AnimalFactory.createCat("stinky", date);
        CatHouse.add(stinky);
        Cat smelly = AnimalFactory.createCat("smelly", date);
        CatHouse.add(smelly);
        Assert.assertEquals(smelly, CatHouse.getCatById(1));
    }

    @Test
    public void removeCatIdTest(){
        CatHouse.clear();
        Cat kitty = AnimalFactory.createCat("stinky", null);
        CatHouse.remove(1);
        Integer expected = 0;
        Assert.assertEquals(expected,kitty.getId());
    }

    @Test
    public void removeCatTest(){
        CatHouse.clear();
        Date date = new Date(2011, Calendar.APRIL,4);
        Cat kitty = AnimalFactory.createCat("stinky", date);
        CatHouse.add(kitty);
        CatHouse.remove(kitty);
        Assert.assertEquals(0, kitty.getId(),0.05);
    }

    @Test
    public void getCatByIDTest(){
        CatHouse.clear();
        Date date = new Date(2002, 3,9);
        Cat stinky = AnimalFactory.createCat("stinky", date);
        Cat smelly = AnimalFactory.createCat("smelly", date);
        CatHouse.add(stinky);
        CatHouse.add(smelly);
        CatHouse.getCatById(1);
        Assert.assertEquals("stinky", stinky.getName());
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        Date date = new Date(2020, 6,2);
        Cat smelly = AnimalFactory.createCat("smelly", date);
        Cat stinky = AnimalFactory.createCat("stinky", date);
        CatHouse.add(smelly);
        CatHouse.add(stinky);
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(2,actual, 0.2);
    }
}
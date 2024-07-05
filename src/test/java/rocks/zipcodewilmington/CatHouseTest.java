package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import static org.junit.Assert.assertEquals;




/**
 * @author leon on 4/19/18.
 */
@Test
public class CatHouseTest {  CatHouse catHouse = new CatHouse();
    Cat cat = new Cat();
    Integer expected = 1
    catHouse.add(cat);
    assertEquals(expected, catHouse.getNumberOfcats);

 @Test
 public class removeID {

 }




    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}

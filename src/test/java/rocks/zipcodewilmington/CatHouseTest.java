package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    CatHouse catHouse = new CatHouse();
    String givenName = "Jimmy";
    Date givenBirthDate = new Date();
    Integer givenId = 3435;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int ID = givenId;
        CatHouse.add(cat);
        Cat expected = cat;
        Cat actual = CatHouse.getCatById(givenId);
        Assert.assertEquals((expected), actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIntTest(){
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Cat kitty = new Cat("Jolly",new Date(),8930);
        CatHouse.add(cat);
        CatHouse.add(kitty);

        CatHouse.remove(8930);
        Object expected = null;
        Cat actual = CatHouse.getCatById(8930);
        Assert.assertEquals((expected), actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest(){
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Cat kitty = new Cat("Jolly",new Date(),8930);
        CatHouse.add(cat);
        CatHouse.add(kitty);

        CatHouse.remove(kitty);
        Object expected = null;
        Cat actual = CatHouse.getCatById(8930);
        Assert.assertEquals((expected), actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void gteCatByIdTest(){
        Cat bob = new Cat(givenName, givenBirthDate, 6969);
        int ID = givenId;
        CatHouse.add(bob);
        Cat expected = bob;
        Cat actual = CatHouse.getCatById(6969);
        Assert.assertEquals((expected), actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        Cat jack = new Cat(givenName, givenBirthDate, givenId);
        Cat bob = new Cat(givenName, givenBirthDate, 6565);
        Cat sal = new Cat(givenName, givenBirthDate, 7575);
        CatHouse.add(jack);
        CatHouse.add(bob);
        CatHouse.add(sal);

        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}

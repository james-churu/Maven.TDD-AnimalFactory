package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.*;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    DogHouse dogHouse = new DogHouse();
    String givenName = "Jimmy";
    Date givenBirthDate = new Date();
    Integer givenId = 3435;
    Dog dog = new Dog(givenName, givenBirthDate, givenId);
    
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        Dog Dog = new Dog(givenName, givenBirthDate, givenId);
        int ID = givenId;
        DogHouse.add(Dog);
        Dog expected = Dog;
        Dog actual = DogHouse.getDogById(givenId);
        Assert.assertEquals((expected), actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIntTest(){
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Dog doggy = new Dog("Jolly",new Date(),8930);
        DogHouse.add(dog);
        DogHouse.add(doggy);

        DogHouse.remove(8930);
        Object expected = null;
        Dog actual = DogHouse.getDogById(8930);
        Assert.assertEquals((expected), actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeBydogTest(){
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Dog doggy = new Dog("Jolly",new Date(),8930);
        DogHouse.add(dog);
        DogHouse.add(doggy);

        DogHouse.remove(doggy);
        Object expected = null;
        Dog actual = dogHouse.getDogById(8930);
        Assert.assertEquals((expected), actual);
    }
    
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void gteDogByIdTest(){
        Dog dog = new Dog(givenName, givenBirthDate, 8989);
        int ID = 8989;
        DogHouse.add(dog);
        Dog expected = dog;
        Dog actual = DogHouse.getDogById(8989);
        Assert.assertEquals((expected), actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        DogHouse.clear();
        Dog jack = new Dog(givenName, givenBirthDate, givenId);
        Dog bob = new Dog(givenName, givenBirthDate, 6565);
        Dog sal = new Dog(givenName, givenBirthDate, 7575);
        DogHouse.add(jack);
        DogHouse.add(bob);
        DogHouse.add(sal);

        Integer expected = 3;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
}

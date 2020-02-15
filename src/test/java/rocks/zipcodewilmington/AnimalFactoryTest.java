package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String givenName = "Jimmy";
        Date givenBirthDate = new Date();
        Integer givenId = 3435;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Integer actual = dog.getId();

        Assert.assertEquals(givenId,actual);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        String givenName = "Jimmy";
        Date givenBirthDate = new Date();
        Integer givenId = 3435;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer actual = cat.getId();

        Assert.assertEquals(givenId,actual);
    }
}

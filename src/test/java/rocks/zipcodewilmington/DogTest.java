package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    String givenName = "Jimmy";
    Date givenBirthDate = new Date();
    Integer givenId = 3435;

    Dog dog = new Dog(givenName, givenBirthDate, givenId);
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Date expected = new Date();
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Food onion = new Food();
        Food banana = new Food();
        dog.eat(onion);
        dog.eat(banana);


        Food expected = banana;
        Food actual = dog.getFood();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Integer expected = 3435;
        Integer actual = dog.getId();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfAnimalTest(){

        boolean expected = true;
        boolean actual = dog instanceof Animal;

        Assert.assertEquals((expected),actual);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfMamalTest(){
        boolean expected = true;
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals((expected),actual);
    }



    @Test
    public void setNameTest() {
        String expected = "Dimmy";
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals((expected),actual);
    }
}

package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    String givenName = "Jimmy";
    Date givenBirthDate = new Date();
    Integer givenId = 3435;
    Cat cat = new Cat(givenName, givenBirthDate, givenId);


    // When (a cat is constructed)

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        String expected = "Dimmy";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals((expected),actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals((expected),actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Date expected = new Date();
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals((expected),actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Food onion = new Food();
        Food banana = new Food();
        cat.eat(onion);
        cat.eat(banana);


        Food expected = banana;
        Food actual = cat.getFood();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Integer expected = 3435;
        Integer actual = cat.getId();
        Assert.assertEquals((expected),actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfAnimalTest(){

        boolean expected = true;
        boolean actual = cat instanceof Animal;

        Assert.assertEquals((expected),actual);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfMamalTest(){
        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals((expected),actual);
    }

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
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}

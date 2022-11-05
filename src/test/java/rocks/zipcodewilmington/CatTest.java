package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

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
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (name is set to a new name)
        String expected = "Bell";
        cat.setName(expected);

        String actual = cat.getName();

        //Then (Assert new name is set properly)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (a new birthdate is set)
        Date expected = new Date(2010, 2, 12);
        cat.setBirthDate(expected);

        //Then (assert new birthday is set)
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (the speak method is called)
        String expected = "meow!";
        String actual = cat.speak();

        //Then (assert the cat says 'meow!' as expected)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (the eat method is called)
        Food food = new Food();
        int expected = 1;
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //Then (assert the number of meals eaten has increased to 1)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetID(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 12345;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //When (the getID method is called on the cat)
        int expected = 12345;
        int actual = cat.getId();

        //Then (assert the id is assigned to the cat as expected)
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testAnimalInheritance(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then (assert cat is an instance of Animal)
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        //Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then (assert cat is an instance of Mammal)
        Assert.assertTrue(cat instanceof Mammal);
    }

}

package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest(){
        // Given (some dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // When (a new birthdate is set)
        Date expected = new Date(2015, 8,1);
        dog.setBirthDate(expected);

        // Then (assert new birthday is set)
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // When (the speak method is called)
        String expected = "bark!";
        String actual = dog.speak();

        // Then (assert the dog says 'bark!' as expected)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // When (the eat method is called)
        Food food = new Food();
        int expected = 1;
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // Then (assert the number of meals eaten has increased by 1)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetID(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, 12345);

        // When (the getID method is called on the dog)
        int expected = 12345;
        int actual = dog.getId();

        // Then (assert the id is assigned to the dog as expected)
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnimalInheritance(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // Then (assert dog is an instance of Animal)
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance(){
        // Given (a dog is constructed)
        Dog dog = new Dog(null, null, null);

        // Then (assert dog is an instance of Mammal)
        Assert.assertTrue(dog instanceof Mammal);
    }
}

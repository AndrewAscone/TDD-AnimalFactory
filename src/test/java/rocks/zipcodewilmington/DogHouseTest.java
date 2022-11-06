package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        //Given (a dog and doghouse are created)
        DogHouse testHouse = new DogHouse();
        Dog dog1 = new Dog("Harpua", new Date(), 1);

        int expected = testHouse.getNumberOfDogs() + 1;

        //When (a dog is added to the house)
        testHouse.add(dog1);
        int actual = testHouse.getNumberOfDogs();

        // Then (assert the dog has been added to the dog house)
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        // Given (two dogs and a dog house are constructed)
        DogHouse testHouse = new DogHouse();
        Dog dog1 = new Dog("Reba", new Date(), 199);
        Dog dog2 = new Dog("Jim", new Date(), 202);

        // When (dogs are added to the dog house and one is removed by ID number)
        testHouse.add(dog1);
        testHouse.add(dog2);

        testHouse.remove(202);

        // Then (assert the dog still in the dog house has the ID number that wasn't removed)
        Dog expected = dog1;
        Dog actual = testHouse.getDogById(199);

        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        //Given (a dog and dog house are constructed)
        DogHouse testHouse = new DogHouse();
        Dog dog1 = new Dog("Marley", new Date(), 187);

        int expected = testHouse.getNumberOfDogs();

        // When (a dog is added to, and then removed from, the dog house)
        testHouse.add(dog1);
        testHouse.remove(dog1);

        int actual = testHouse.getNumberOfDogs();

        // Then (assert the dog object has been removed from the dog house)
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogByID(){
        // Given (a dog and dog house are created)
        DogHouse testHouse = new DogHouse();
        Dog dog1 = new Dog("Radar", new Date(), 27);

        // When (a dog is added to the dog house)
        testHouse.add(dog1);

        // Then (assert the dog is in the dog house by calling its ID number)
        Dog expected = dog1;
        Dog actual = testHouse.getDogById(27);

        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs(){
        // Given (multiple dogs and a dog house are constructed)
        DogHouse testHouse = new DogHouse();
        Dog dog1 = new Dog("Patches", new Date(), 234);
        Dog dog2 = new Dog("Tonks", new Date(), 122);
        Dog dog3 = new Dog("Jed", new Date(), 832);
        Dog dog4 = new Dog("Martha", new Date(), 726);

        int expected = testHouse.getNumberOfDogs() + 4;
        // When (dogs are added to the dog house)
        testHouse.add(dog1);
        testHouse.add(dog2);
        testHouse.add(dog3);
        testHouse.add(dog4);

        // Then (assert the number of dogs in the house is equal to how many were added)
        int actual = testHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
}

package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        //Given (a new instance of the Animal Factory is created)
        AnimalFactory test = new AnimalFactory();


        //When (a new dog is created from the Animal Factory)
        Dog testDog = test.createDog("Milo", null);
        DogHouse.add(testDog);
        System.out.println(testDog.getId());

        Dog dog2 = test.createDog("Dog", null);

        DogHouse.add(dog2);
        System.out.println(dog2.getId());



        String actual = testDog.getName();
        String expected = "Milo";

        Date actualBirthday = testDog.getBirthDate();
        Date expectedBirthday = null;

        int actualID = testDog.getId();
        int expectedID = 0;


        //Then (assert the new dog is created with the correct information)
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedBirthday, actualBirthday);
        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testCreateCat(){
        //Given (a new instance of the Animal Factory is created)
        AnimalFactory test = new AnimalFactory();

        //When (a new cat is created from the Animal Factory)
        Cat testCat = test.createCat("Striper", null);
        CatHouse.add(testCat);

        String actual = testCat.getName();
        String expected = "Striper";

        Date actualBirthday = testCat.getBirthDate();
        Date expectedBirthday = null;

        int actualID = testCat.getId();
        int expectedID = 0;

        //Then (assert the new cat is created with the correct information)
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedBirthday, actualBirthday);
        Assert.assertEquals(expectedID, actualID);

    }
}

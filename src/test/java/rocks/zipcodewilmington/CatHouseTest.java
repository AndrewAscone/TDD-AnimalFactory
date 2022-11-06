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
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        // Given (cat data)
        String givenName = "Poster";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat and a cat house are constructed)
        CatHouse testHouse = new CatHouse();
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        int expected = testHouse.getNumberOfCats() + 1;

        // When (a cat is added to the cat house)
        testHouse.add(cat1);
        int actual = testHouse.getNumberOfCats();

        // Then (assert the cat object has been added to the cat house)

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        // Given (cat data)
        String givenName = "Forbin";
        Date givenBirthDate = new Date();
        Integer givenId = 123;

        // When (two cats and a cat house are constructed)
        CatHouse testHouse1 = new CatHouse();
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Cat cat2 = new Cat("Bel", new Date(), 101);

        // When (cats are added to the cat house and one is removed by ID number)
        testHouse1.add(cat1);
        testHouse1.add(cat2);

        testHouse1.remove(123);

//        if(testHouse.getCatById(101) == cat2){
//            System.out.println("Cat 2 is still in the house");
//        }


        // Then (assert the cat still in the cat house has the ID number of the one that wasn't removed)
        Cat expected = cat2;
        Cat actual = testHouse1.getCatById(101);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        // Given (cat data)
        String givenName = "Jack Straw";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat and a cat house are constructed)
        CatHouse testHouse2 = new CatHouse();
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        int expected = testHouse2.getNumberOfCats();
        // When (a cat is added to, and then removed from, the cat house)
        testHouse2.add(cat1);
        testHouse2.remove(cat1);

        int actual = testHouse2.getNumberOfCats();

        // Then (assert the cat object has been removed from the cat house)

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatByID(){
        // Given (cat data)
        String givenName = "Elmeg";
        Date givenBirthDate = new Date();
        Integer givenId = 12345;

        // When (a cat and a cat house are constructed)
        CatHouse testHouse3 = new CatHouse();
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        testHouse3.add(cat1);

        // Then (assert the cat is in the cat house by calling its ID number)
        Cat expected = cat1;
        Cat actual = testHouse3.getCatById(12345);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        // Given (multiple cats and a cat house are constructed)
        CatHouse testHouse4 = new CatHouse();
        Cat cat1 = new Cat("Simba", new Date(), 1);
        Cat cat2 = new Cat("Butters", new Date(), 2);
        Cat cat3 = new Cat("Circuit", new Date(), 3);
        Cat cat4 = new Cat("Gizmo", new Date(), 4);

        // When (cats are added to the cat house)
        testHouse4.add(cat1);
        testHouse4.add(cat2);
        testHouse4.add(cat3);
        testHouse4.add(cat4);

        // Then (assert the number of cats in the cat house is equal to how many were added)
        int expected = 4;
        int actual = testHouse4.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }
}

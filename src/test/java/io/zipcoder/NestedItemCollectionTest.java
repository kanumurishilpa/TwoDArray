package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NestedItemCollectionTest {

    Integer[][] integerArray = {{1,2,5,3,4,5}, {4,3,2,1}};
    NestedItemCollection collection;

    @Before
    public void setup(){
        collection = new NestedItemCollection(integerArray);
    }

    @Test
    public void intializeNestedItemsArraySizeTest(){
        int expected = 2;
        int actual = collection.length();
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }

    @Test
    public void iniializedNestedItemsArrayElementTest(){
        NestedItem itemExpected = new NestedItem(integerArray[0]);
        NestedItem itemActual = collection.getAtIndex(0);
        Integer expected = itemExpected.getPrimeNumberCount();
        Integer actual = itemActual.getPrimeNumberCount();
        assertEquals(expected, actual);
    }
}

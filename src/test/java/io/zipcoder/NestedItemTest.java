package io.zipcoder;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class NestedItemTest {

    Integer[] arrayOfInts = {2,2,5,3};
    NestedItem nestedItem ;

    @Before
    public void setup(){
        nestedItem = new NestedItem(arrayOfInts);
    }

    @Test
    public void countPrimeNumbersTest(){
        int expected = 4;
        int actual = nestedItem.getPrimeNumberCount();
        assertEquals("The number of prime numbers should be 4",expected,actual);
    }

    @Test
    public void sortArrayOfIntsDescendingTest(){
        Integer[] expected = {5,3,2,2};
        Integer[] actual = nestedItem.getArrayOfInts();
        assertArrayEquals("The arrays should be equal", expected, actual);
    }

    @Test
    public void isPrimeTest(){
        int n = 17;
        boolean expected = true;
        boolean actual = nestedItem.isPrime(n);
        assertEquals(expected, actual);
    }
}

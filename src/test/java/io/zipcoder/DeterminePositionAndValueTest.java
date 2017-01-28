package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shilpakanumuri on 1/27/17.
 */
public class DeterminePositionAndValueTest {

    Integer[] newArray = {7,2,1,5,3};
    Integer[] newArray2 = {7,9,5,7,14};
    NestedItem item = new NestedItem(newArray);
    NestedItem item2 = new NestedItem(newArray2);
    DeterminePositionAndValue positionAndValue;

    @Before
    public void setup(){
        positionAndValue = new DeterminePositionAndValue();
    }

    @Test
    public void positionOfFirstOddNumberInARowTest(){
        int expected = 0;
        int actual = positionAndValue.positionOfFirstOddNumberInARow(item);
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }

    @Test
    public void valueOfFirstOddNumberInARowTest(){
        int expected = 7;
        int actual = positionAndValue.valueOfFirstOddNumberInARow(item);
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }

    @Test
    public void valueFirstElementThatDiffersTest(){
        boolean expected = false;
        boolean actual = positionAndValue.valueFirstElementThatDiffers(item,item2);
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }


}

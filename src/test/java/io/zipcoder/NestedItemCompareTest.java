package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;

/**
 * Created by shilpakanumuri on 1/26/17.
 */
public class NestedItemCompareTest {

    NestedItemCompare compare;
    NestedItemCollection item;
    NestedItem nestedItem;
    Integer[][] integerArray = {{4,3,2,1}, {1,2,5,3,4,5}};

    @Before
    public void setup(){
        compare = new NestedItemCompare();
        item = new NestedItemCollection(integerArray);
        nestedItem = new NestedItem(integerArray[2]);
    }

    @Test
    public void shouldBeSwappedTest(){


        boolean expected = true;
        boolean actual = compare.shouldBeSwapped();
        assertEquals("The value of the initialized array should be 2",expected, actual);
    }
}

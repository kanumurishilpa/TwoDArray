package io.zipcoder;

/**
 * Created by shilpakanumuri on 1/25/17.
 */
public class NestedItemCompare {

    public boolean shouldBeSwapped(NestedItem nestedItem1, NestedItem nestedItem2) {
        if(nestedItem1.getPrimeNumberCount() > nestedItem2.getPrimeNumberCount()){
            return true;
        }
        return false;
    }


}

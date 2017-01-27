package io.zipcoder;

/**
 * Created by shilpakanumuri on 1/25/17.
 */
public class SortedArrayBuilder {

    public NestedItem[] buildArray( NestedItem[] nestedItems) {
        boolean swaps = true;
        NestedItemCompare nestedItemCompare = new NestedItemCompare();
        while(swaps) {
            swaps = false;
            for(int i = 1; i < nestedItems.length; i++) {
                if(nestedItemCompare.shouldBeSwapped(nestedItems[i-1], nestedItems[i])) {
                    NestedItem temp = nestedItems[i];
                    nestedItems[i] = nestedItems[i-1];
                    nestedItems[i-1] = temp;
                }
            }
        }
        return nestedItems;
    }
}

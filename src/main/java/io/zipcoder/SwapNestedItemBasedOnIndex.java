package io.zipcoder;

public class SwapNestedItemBasedOnIndex {
	
	public void swap(NestedItemCollection nestedCollection , int index){
		
		NestedItem tempArray = nestedCollection.getAtIndex(index-1);
		nestedCollection.getNestedItems()[index-1] = nestedCollection.getAtIndex(index);
		nestedCollection.getNestedItems()[index] = tempArray;
	}

}

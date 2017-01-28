package io.zipcoder;

import java.util.Arrays;

public class SwapNestedItemEngine {

	NestedItemCollection nestedItemCollection;
	SwapNestedItemBasedOnIndex swapByCondition;
	DeterminePositionAndValue positionAndValue;
	
	public void arraySorter(Integer[][] inputArray) {
		nestedItemCollection = new NestedItemCollection(inputArray);
		swapByCondition = new SwapNestedItemBasedOnIndex();
		positionAndValue = new DeterminePositionAndValue();

		for (int i = 0; i < nestedItemCollection.getNestedItems().length; i++) {
			for (int j = 1; j < (nestedItemCollection.getNestedItems().length)- i; j++) {
				if (nestedItemCollection.getAtIndex(j-1).getPrimeNumberCount() > nestedItemCollection.getAtIndex(j).getPrimeNumberCount()){

					swapByCondition.swap(nestedItemCollection,j);

				}else if(nestedItemCollection.getAtIndex(j-1).getPrimeNumberCount() == nestedItemCollection.getAtIndex(j).getPrimeNumberCount()){
					if(positionAndValue.positionOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j-1)) > positionAndValue.positionOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j))){
						swapByCondition.swap(nestedItemCollection,j);

					}else if(positionAndValue.positionOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j-1)) == positionAndValue.positionOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j))){
						if(positionAndValue.valueOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j-1)) > positionAndValue.valueOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j))){
							swapByCondition.swap(nestedItemCollection,j);

						}else if(positionAndValue.valueOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j-1)) == positionAndValue.valueOfFirstOddNumberInARow(nestedItemCollection.getAtIndex(j))){
							if(positionAndValue.valueFirstElementThatDiffers(nestedItemCollection.getAtIndex(j-1), nestedItemCollection.getAtIndex(j))){
								swapByCondition.swap(nestedItemCollection,j);
							}

						}
					}
				}

			}

		}

			for(NestedItem nestedItem: nestedItemCollection.getNestedItems()){
				System.out.println(Arrays.deepToString(nestedItem.getArrayOfInts()));
			}


	}

}
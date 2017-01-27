package io.zipcoder;

/**
 * Created by shilpakanumuri on 1/25/17.
 */
public class DeterminePositionAndValue {

   public int positionOfFirstOddNumberInARow(NestedItem nestedItem){

        int position = Integer.MAX_VALUE;

        for(int i=0; i < nestedItem.getArrayOfInts().length; i++){
            if(nestedItem.getArrayOfInts()[i]%2 != 0){
                position = i;
                break;
            }
        }
        return position;
    }

    public int valueOfFirstOddNumberInARow(NestedItem nestedItem){

        int value = Integer.MAX_VALUE;

        for(int i=0; i < nestedItem.getArrayOfInts().length; i++){
        	if(nestedItem.getArrayOfInts()[i]%2 != 0){
                value = nestedItem.getArrayOfInts()[i];
                break;
            }
        }
        return value;
    }

    public boolean  valueFirstElementThatDiffers(NestedItem previousNestedItem, NestedItem afterNestedItem) {
		// TODO Auto-generated method stub
		
    	Integer[] previousArray= previousNestedItem.getArrayOfInts();
    	Integer[] afterArray= afterNestedItem.getArrayOfInts();
    	
		boolean swap = false;
		
		int length = Math.min(previousArray.length,afterArray.length);
		
		 for(int i=0; i < length; i++){
			 if(previousArray[i] != afterArray[i]){
				 if(previousArray[i] > afterArray[i]){
					 swap = true;
				 }
				 break;
			 }
	        }
		 return swap;
	}




}

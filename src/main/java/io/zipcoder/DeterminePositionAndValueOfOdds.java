package io.zipcoder;

/**
 * Created by shilpakanumuri on 1/25/17.
 */
public class DeterminePositionAndValueOfOdds {

    NestedItem item;

    public DeterminePositionAndValueOfOdds(Integer[] integerArrays){
       item = new NestedItem(integerArrays);

    }

    private int positionOfFirstOddNumberInARow(Integer[] integerArrays){

        int position = Integer.MAX_VALUE;

        for(int i=0; i < integerArrays.length; i++){

            if(i%2 != 0){
                position = i;
                break;
            }
        }
        return position;
    }

    private int valueofFirstOddNumberInARow(Integer[] integerArrays){

        int value = Integer.MAX_VALUE;

        for(int i=0; i < integerArrays.length; i++){
            if(i%2 != 0){
                value = integerArrays[i];
                break;
            }
        }
        return value;
    }





}

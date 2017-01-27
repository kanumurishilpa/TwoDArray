package io.zipcoder;

/**
 * Created by shilpakanumuri on 1/27/17.
 */
public class TwoDArraySorter {

    public static void main(String[] args){

         Integer[][] twoDArray = new Integer[][]{
                 {9 ,7,17,14,7},
                 {2,3,2,3},
                 {7,9,5,7,14},
                 {1,2,3,4,5},
                 {2,1,4,6,0}

         };

        SwapNestedItemEngine engineRun = new SwapNestedItemEngine();



        engineRun.arraySorter(twoDArray);


    }

}

package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;


public class NestedItem {
    private Integer[] arrayOfInts;
    private int primeNumberCount = 0;

    public Integer[] getArrayOfInts() {

        return arrayOfInts;
    }

    public int getPrimeNumberCount() {

        return primeNumberCount;
    }

    public NestedItem(Integer[] arrayOfInts){
        this.arrayOfInts = arrayOfInts;
        countPrimeNumber();
        sortArrayOfIntsDescending();
    }

    private void countPrimeNumber(){
        for (int element : arrayOfInts){
            if (isPrime(element)){
                primeNumberCount ++;
            }
        }
    }

    private void sortArrayOfIntsDescending(){

        Arrays.sort(arrayOfInts, Collections.reverseOrder());
    }

    public boolean isPrime(int n) {
        if(n == 1 || n==0) {return false;}
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }


}


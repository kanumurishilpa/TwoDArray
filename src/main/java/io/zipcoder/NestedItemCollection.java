package io.zipcoder;


public class NestedItemCollection {

    private NestedItem[] nestedItems;

    public NestedItemCollection(Integer[][] integerArrays){
        nestedItems = new NestedItem[0];
        parseAndPopulateNestedItemsArray(integerArrays);
    }

    private void parseAndPopulateNestedItemsArray(Integer[][]integerArrays){
        for(Integer[] integerArray: integerArrays){
            NestedItem nestedItem = new NestedItem(integerArray);
            add(nestedItem);
        }
    }

    private void add(NestedItem item){
        int tempArrayLength = nestedItems.length +1;
        NestedItem[] tempArray = new NestedItem[tempArrayLength];
        System.arraycopy(nestedItems,0,tempArray,0,nestedItems.length);
        tempArray[tempArrayLength-1] = item;
        nestedItems = tempArray;
    }

    public NestedItem[] getNestedItems() {
        return nestedItems;
    }

    public NestedItem getAtIndex(int index){
        NestedItem response =  null;
        if ((index >= nestedItems.length) || (index < 0)) {
            response = null;
        } else {
            response = nestedItems[index];
        }
        return response;
    }

    public int length(){
        return nestedItems.length;
    }
}

package SortingLogic;

/*
 Bubble sort -

 - Traverse from left to right;
 - Take two elements and swap if the right element is greater than left element
 - Traverse until you are at the end of the array.
 - Right most - Largest element of array
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        //for loop to go from right to left
        for(int lastUnsortedIndex= intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++){
                if (intArray[i]  > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

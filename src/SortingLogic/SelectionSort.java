package SortingLogic;

/*
 Bubble sort -

 - Traverse from left to right;
 - Change the largest value to nth index value if nth index value > greater value.

 - Swap with the largest element to the last element of the array.

 = Right most - Largest element of array
 */
public class SelectionSort {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        //for loop to go from right to left
        for(int lastUnsortedIndex= intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i]  > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
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

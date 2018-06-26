package SortingLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Insertion sort -

 - Assume the left most element array is the smallest element of the array
 - Compare the next element
 - If it is less, swap to the left element.
 - Now increment the k and compare the next element to k.
 - If it is, swap the element.
 - Now compare to the 1st element on the left.
 - if it is less, swap the next element on the left.
 - if it is not, leave as it is.
 - Compare the right element to left element.
 - if left element is less than right element, traverse again.
 - Now, compare to the left element. if left element is smaller, leave as it is.
 - If left element is larger, compare the right element with the left element.
 - Continue until the first element of the array.
 - Now go to the next element and repeat the iteration.

 = Right most - Largest element of array
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        //for loop to go from right to left
        for(int firstUnsortedIndex= 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElem = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElem; i--){
               intArray[i] = intArray[i-1];
            }
            intArray[i] = newElem;
        }

        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

//
//    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list){
//        int i, j, key, temp;
//        for (i=1; i<list.size();i++){
//            key=list.get(i);
//            j=i-1;
//            while (j>=0 && key < list.get(j)){
//                temp = list.get(j);
//                list.set(j, list.get(j+1));
//                list.set(j+1, temp);
//                j--;
//            }
//        }
//        return list;
//    }

    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

package AmazonInterviewPrep;
//Given an array, find the number if it is present


//Questions
// Is Array sorted???
// Does Array contain duplicates??
//How big is the array


//Pseudocode
// Create an array from 1 to n.
//Sort the array
//Use binary search method
  //int start = 0;
  // int end = array.length - 1;
  //while (start < end)
    //find midpoint
    //if (arr[midpoint]  == v) return true
    // else if (arr[midpoint] < v) start = midpoint + 1;
    // else end = midpoint;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = createIntArray(4);
        for(int i: arr){
            System.out.print(i + ",");
        }
        System.out.println(isNumberPresent(arr, arr.length, 2));
    }

    static int[] createIntArray(int length){
        Random rand = new Random();
        int[] myArr = new int[length];
        for (int i=0; i<length; i++){
            myArr[i] = rand.nextInt(10);
        }
        return myArr;
    }

    static boolean isNumberPresent(int[] arr, int length, int v){
        Arrays.sort(arr);
        int start = 0;
        int end = length - 1;
        while (start < end){
            //find midpoint
            int midPoint = (start + end) / 2;
            if (arr[midPoint] == v){
                return true;
            } else if (arr[midPoint] < v){
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return false;
    }


    //Implement Binary Search



}

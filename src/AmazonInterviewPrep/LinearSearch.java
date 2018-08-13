package AmazonInterviewPrep;//Linear Search
//Given an array, find the number if it is present

//Pseudo code
//Does the array contain duplicates?
//Is Array sorted

//Pseudo code
//for loop
  //compare the value of each element with the comparable value
  // return true if matches
  // false

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 7, 9, 5};
        System.out.println(isNumberPresent(arr, 5));
        System.out.println(isNumberPresent(arr, 3));

    }

    static boolean isNumberPresent(int[] arr, int v){
        for(int i=0; i< arr.length; i++){
            if (arr[i] == v){
                return true;
            }
        }
        return false;
    }


}
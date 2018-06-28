package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPairThatEqualsToSum {
    public static void main(String[] args){
        int[] arr = {1, 7, 3, 2, 5};
        System.out.println(findPairInArray(arr, 8));
    }

    //Pseudocode
    //Sort the array
    //initialize first as 0;
    //intialize last as size - 1
    // while (first < second)
       //get curr = sum of first and second element
       // if curr == value
           //add first and second element in arraylist
       // else if curr < value
           //increment first as first++
      // else
          // decrement second--;


    static ArrayList<Integer> findPairInArray(int[] arr, int value){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        int curr;
        while (first < last){
            curr = arr[first] + arr[last];
            if (curr == value){
                arr1.add(arr[first]);
                arr1.add(arr[last]);
                return arr1;
            } else if (curr < value){
                first++;
            } else {
                last--;
            }
        }
        return arr1;
    }


}

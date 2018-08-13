package AmazonInterviewPrep;
//Questions
//Is Array sorted
//Is Array contain duplicate numbers

//Pseudo code
//sort the array if it is not already sorted
//compare the nth element + 1 = nth element + 1
//do nothing else return nth element + 1;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6, 8, 10};
        //getMissingElement
        getMissingElement(arr);

    }

    static void getMissingElement(int[] arr){
       ArrayList<Integer> myArr = new ArrayList<>();
       //while loop
        int i = 0;
        while (i < arr.length - 1){
            if (arr[i + 1] != arr[i] + 1){
                myArr.add(arr[i] + 1);
            }
            i++;
        }

        System.out.println(myArr.toString());
    }

}

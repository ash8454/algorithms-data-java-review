package InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;

public class FindMissingNumbers {
    public static void main(String[] args){
        int[] numArray = new int[]{1,2,4,6,3,5,8,11,13};
        //System.out.println(findMissingNumber(numArray));
        findMissingNumbers(numArray, 2);
        findAllMissingNumbers(numArray);

    }

    //Find first two(k) missing numbers
    static void findMissingNumbers(int[] arr, int k){
        LinkedList<Integer> missingList = new LinkedList<>();
        //sort the array first
        Arrays.sort(arr);
        //compare n-1 element with n and see if the n-1th element + 1 equals to n
        int i = 0;
        while (i < arr.length -1){
            if (missingList.size() >= k){
                System.out.println(missingList.toString());
            }
            if (arr[i+1] != arr[i] + 1){
                missingList.add(arr[i] + 1);
            }
            i++;
        }


    }

    //Find all missing numbers
    static void findAllMissingNumbers(int[] arr){
        LinkedList<Integer> missingList = new LinkedList<>();
        //sort the array first
        Arrays.sort(arr);
        //compare n-1 element with n and see if the n-1th element + 1 equals to n
        int i = 0;
        while (i < arr.length -1){
            if (arr[i+1] != arr[i] + 1){
                missingList.add(arr[i] + 1);
            }
            i++;
        }

        System.out.println(missingList.toString());


    }
}

package InterviewQuestions;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] numArray = new int[]{1,2,4,6,3,5,8};
        System.out.println(findMissingNumber(numArray));

    }

    static int findMissingNumber(int[] arr){
        //sort the array first
        Arrays.sort(arr);
        //compare n-1 element with n and see if the n-1th element + 1 equals to n
        int i = 0;
        while (i < arr.length -1){
            if (arr[i+1] != arr[i] + 1){
                return arr[i] + 1;
            }
            i++;
        }
        return -1;

    }
}

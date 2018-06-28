package InterviewQuestions;

import java.util.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args){
        //array
        int[] arr = {1, 2, 4, 6, 1, 2, 11, 15};
        //return second largest item (n-1);
        System.out.println(findSecondLargestItem(arr));

    }

    static int findSecondLargestItem(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
}

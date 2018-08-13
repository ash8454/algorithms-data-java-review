package AmazonInterviewPrep;

//Assumptions
//Is Array sorted?
//Does Array contains duplicates


import java.util.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args){
        int[] arr = {1,8, 4, 2, 6, 9};
        // find second largest element
        System.out.println(findSecondLargestElement(arr));

    }

    static int findSecondLargestElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2 ];
    }




}

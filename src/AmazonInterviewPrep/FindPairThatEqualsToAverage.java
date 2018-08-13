package AmazonInterviewPrep;

import java.util.ArrayList;

public class FindPairThatEqualsToAverage {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 5, 6};
        System.out.println((findPairWithAverage(arr, 2).toString()));

    }


    static ArrayList<Integer> findPairWithAverage(int[] arr, int k){
        //Arrays.sort(arr);
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        // int start = arr[0];
        //int end = arr[arr.length - 1];
        //int average = (start + end)/2;
        //

        for (int i = 0; i < arr.length; i++){
            for (int j=arr.length-1; j > i; j--){
                int average = (arr[i] + arr[j])/2;
                if (average == k){
                    myArrList.add(arr[i]);
                    myArrList.add(arr[j]);
                    return myArrList;
                }
            }
        }
        return myArrList;
}
}


package Educative.Arrays;

public class CheckSecondMax {

    public static int findSecondMaximum(int[] arr){

        // Write - Your - Code
        int max = 0;
        int secondMax = 0;
        //for loop to get the max
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args){
        //Method1
        //sort the array
        //find the arr.length - 1;
        int[] arr = {8,7,9,3};
        System.out.println(findSecondMaximum(arr));

    }
}

package Arrays;

import java.util.Arrays;

class CheckSumForTwoPairs{

    public static int[] findSum(int[] arr, int value){

        int[] result = new int[2];
        int Pointer1= 0;
        int Pointer2 = arr.length - 1;
        int sum = 0;


        // Write - Your - Code
        while (Pointer1 != Pointer2){
            sum = arr[Pointer1] + arr[Pointer2];
            if (sum < value){
                Pointer1++;
            } else if (sum > value){
                Pointer2--;
            } else {
                result[0] = arr[Pointer1];
                result[1] = arr[Pointer2];
                return result;
            }
        }


        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,21,3,14,5,60,7,6};
        Arrays.sort(arr);
        int[] finalArr = findSum(arr, 81);
        for(int n: finalArr){
            System.out.print(n+",");
        }

    }
}
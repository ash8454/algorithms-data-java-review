package InterviewQuestions;

import java.util.Arrays;

public class FindStringPermutation {
    public static void main(String[] args){
        String word = "ABCDEFG";
        char[] charList = word.toCharArray();
        //do permutation to find list of words
        permute(charList, 0, charList.length-1);
    }

    static void permute(char[] arr, int i, int n){
        if (i == n){
            System.out.println(Arrays.toString(arr));
        } else {
            for (int j = i; j<= n; j++){
                swap(arr, i, j);
                permute(arr, i+1, j);
                swap(arr, i , j); //backtrack
            }
        }
    }

   static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
   }
}

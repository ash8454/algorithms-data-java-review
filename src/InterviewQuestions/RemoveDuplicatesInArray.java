package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class RemoveDuplicatesInArray {
    public static void main(String[] args){
        //arr
        int[] arr = {1, 2, 3, 2, 4, 4};
        removeDuplicatesInArray(arr);
    }

    static void removeDuplicatesInArray(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //Sort the Array
        Arrays.sort(arr);
        for (int i =0; i<arr.length; i++){
            if (hashMap.containsKey(arr[i])) {
                int newVal = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], newVal);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        System.out.println(hashMap.toString());
        System.out.println("--------");

        //Print out the most duplicate number
        for(int i: hashMap.keySet()){
           System.out.println(i);
        }


    }
}

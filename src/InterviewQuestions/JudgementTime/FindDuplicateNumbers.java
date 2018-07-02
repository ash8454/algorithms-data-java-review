package InterviewQuestions.JudgementTime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateNumbers {
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 5, 7, 7};
        //create an array to find duplicate numbers
        getMaxOccurenceElement(arr1);

    }

    static void getMaxOccurenceElement(int[] arr){
        //sort the array
        Arrays.sort(arr);
        //Create hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //now iterate over the array and find the max occurence element
        for(int i=0; i< arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                int newVal = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], newVal);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        System.out.println(hashMap.toString());
        //Iterator
        //find the max occurence element
        int max = 0;
        int maxItem = arr[0];
        for(int i: hashMap.keySet()){
            if (hashMap.get(i) > max){
                max = hashMap.get(i);
                maxItem = i;
            }
        }
        System.out.println(maxItem);
    }

}

package InterviewQuestions;

import java.util.HashMap;

public class FindMaxCount {
    public static void main(String[] args){
        int[] numArray = new int[]{1,2,4,6,3,8,5,8};

        System.out.println(findMaxCount(numArray));



    }

    static int findMaxCount(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //loop and put it in hashmap with key and value
        for(int i=0; i< arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                int newVal = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], newVal);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        int maxCount = 0;
        //for loop to get the max
        //Print out the most duplicate number
        for(int i: hashMap.keySet()){
            if (hashMap.get(i) > maxCount){
                maxCount = hashMap.get(i);
            }
        }
        return maxCount;
    }
}

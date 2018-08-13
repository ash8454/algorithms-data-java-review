package AmazonInterviewPrep;

//if array is sorted
//if array contains duplicates

//Pseudo code
//Assumptions
 // int[] arr = {1, 2, 3, 4, 2};
 // for loop and if it contains max duplicates return the max item
 // Hashmap
  //if the hashmap contains the key, increment with the value
    // else just put 1

 // while loop for keyset
   //if hasmap.get(k) > max
      //print out the k

import java.util.HashMap;

public class FindMaxOccurenceItem {
    public static void main(String[] args){
        //Assumption
        int[] arr = {1, 2, 4, 2, 3, 3, 3, 4};

        //get max occurenceItem
        System.out.println(getMaxOccurenceItem(arr));

    }

    static int getMaxOccurenceItem(int[] arr){
        //First create hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //for loop
        for(int i=0; i<arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                int newVal = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], newVal);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        int max = 1;
        int maxItem = arr[0];

        //for loop to get maxItem
        for(int i: hashMap.keySet()){

            if (hashMap.get(i) > max){
                max = hashMap.get(i);
                maxItem = i;
            }

        }
        return maxItem;

    }
}

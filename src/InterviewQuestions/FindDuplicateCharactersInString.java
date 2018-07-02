package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedList;

public class FindDuplicateCharactersInString {
    public static void main(String[] args){
        String testString = "abcdeegh";
        HashMap<Character, Integer> strMap = new HashMap<>();
        int maxCount = 1;
        for(int i=0; i<testString.length(); i++){
            char c = testString.charAt(i);
            if (strMap.containsKey(c)){
                int newVal = strMap.get(c) + 1;
                strMap.put(c, newVal);
            } else {
                strMap.put(c, 1);
            }
        }

        //Print out the most duplicate number
        for(char c: testString.toCharArray()){
            if (strMap.get(c) > maxCount){
                System.out.println(c);
                System.out.println(strMap.get(c));
            }
        }





        System.out.println(strMap.toString());
    }
}

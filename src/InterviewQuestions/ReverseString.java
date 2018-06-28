package InterviewQuestions;

import java.util.LinkedList;

public class ReverseString {
    public static void main(String[] args){
        String testString = "abcdefgh";
        StringBuilder finalString = new StringBuilder();
        LinkedList<Character> charList = new LinkedList<>();
        for(int i=0; i<testString.length(); i++){
            char c = testString.charAt(i);
            charList.push(c);
        }

        while (!charList.isEmpty()){
            finalString.append(charList.pop());
        }

        System.out.println(finalString);
    }
}

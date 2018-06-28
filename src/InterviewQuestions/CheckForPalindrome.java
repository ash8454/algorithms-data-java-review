package InterviewQuestions;

//Check if the string reverse is equal to string
//string 1 is reverse of string

import java.util.LinkedList;

public class CheckForPalindrome {
    public static void main(String[] args){
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("abccba"));
    }

    static boolean checkForPalindrome(String string) {
        StringBuilder originalString = new StringBuilder();
        StringBuilder reverseString = new StringBuilder();
        LinkedList<Character> charList = new LinkedList<>();
        for (int i=0; i < string.length(); i++){
            char c = string.charAt(i);
            charList.push(c);
            originalString.append(c);
        }

        while(!charList.isEmpty()){
            reverseString.append(charList.pop());
        }

        return reverseString.toString().equals(originalString.toString());

    }
}

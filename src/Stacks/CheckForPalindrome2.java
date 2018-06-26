package Stacks;

import java.util.Iterator;
import java.util.LinkedList;

/*
public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        return false;
    }
}
 */
public class CheckForPalindrome2 {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        //First create a string without punctuation
        StringBuilder stringWithoutPunctuation = new StringBuilder();
        //Create a stack for linked list to push and pop for each character
        LinkedList<Character> stack = new LinkedList<Character>();
        String lowercase = string.toLowerCase();
        //For loop for each character-//Add all the alphabets in the stack
        for (int i=0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if (c > 'a' && c <= 'z'){
                //Append in the string
                stringWithoutPunctuation.append(c);
                //Push it in the stack
                stack.push(c);
            }
        }

        //Now create a string builder to add the reverse of the string
        StringBuilder reversedString = new StringBuilder();
        //Now add the reverse string until stack is empty with pop method
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringWithoutPunctuation.toString());


    }
}

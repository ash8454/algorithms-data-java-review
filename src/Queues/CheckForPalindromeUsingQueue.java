package Queues;

import Stacks.CheckForPalindrome;

import java.util.LinkedList;

public class CheckForPalindromeUsingQueue {
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
        //Create a string builder object to append the string without punctuation
        //Create a linked list saving each character
        //For loop
            //Add push to the stack
            //Append each character to

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        String lowercase = string.toLowerCase();

        for (int i=0; i<lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if (c > 'a' && c <= 'z'){
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            if (stack.pop() != queue.removeFirst()){
                return false;
            }
        }

        return true;
    }

}

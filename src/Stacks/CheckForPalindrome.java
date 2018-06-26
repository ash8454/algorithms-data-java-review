package Stacks;

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
public class CheckForPalindrome {
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
        //Create a string builder object
        //For loop and append each character on string builder object
        //Now use stack pop method and append to reverse string builder object
        //Compare two stringbuilder objects
        StringBuilder originalString = new StringBuilder();
        LinkedList<Character> charList = new LinkedList<Character>();
        String lowercase = string.toLowerCase();
        for (int i=0; i<lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if (c > 'a' && c <= 'z'){
                charList.push(c);
                originalString.append(c);
            }
        }
        //create another stringbuilder object for reverse string
        StringBuilder reverseString = new StringBuilder();
        //for loop for stack and use pop method and append on reverse string
        while(!charList.isEmpty()){
           reverseString.append(charList.pop());
        }
        return reverseString.toString().equals(originalString.toString());
    }
}

package AmazonInterviewPrep;
//Assumptions
//string range

//palindrome - if string and string reverse is equal

//pseudo code

// first create a string builder for original string
// create another string builder for reverse string
// compare two string builder object

//create a char array
//create a linked list
 //loop for char array and push each char item to the stack
// for loop to print each element pop out from the stack
  //append it to reverse character object
//compare two objects

import java.util.LinkedList;

public class CheckStringisPalindrome {
    public static void main(String[] args){
        String myString1 = "desserts";
        String myString2 = "aaaa";

        System.out.println(isPalindrome(myString1));
        System.out.println(isPalindrome(myString2));
    }

    static boolean isPalindrome(String str){
        //Linked List Stack
        LinkedList<Character> charArray = new LinkedList<Character>();
        //String builder object for original string
        StringBuilder originalString = new StringBuilder();
        //String builder object for reverse String
        StringBuilder reverseString = new StringBuilder();
        char[] strArray = str.toCharArray();
        String lowercase = str.toLowerCase();

        for (int i=0; i < strArray.length; i++){
            char c = str.charAt(i);
            if (c > 'a' && c < 'z'){
                charArray.push(c);
                originalString.append(c);
            }

        }

        //while loop and pop out each element from stack

        while (!charArray.isEmpty()){
           // System.out.print(charArray.pop());
            reverseString.append(charArray.pop());
        }

        return originalString.toString().equals(reverseString.toString());

    }
}

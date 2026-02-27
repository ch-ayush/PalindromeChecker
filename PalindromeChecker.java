package PalindromeChecker;

import java.util.Scanner;
import java.util.Stack;

public class palindromeCheck{

    public static boolean isPalindrome(String str){
        // Convert string to char array
        char[] chars = str.toCharArray();
        
        // Create stack and push all characters
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        
        // Pop and compare with original characters
        for (char c : chars) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Manager System!\nVersion 1.0\nSystem initialized successfully!\n");
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
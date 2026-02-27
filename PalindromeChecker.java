package PalindromeChecker;

import java.util.Scanner;

public class palindromeCheck{

    public static boolean isPalindrome(String str){
        char[] chars = str.toCharArray();
        
        int start = 0;
        int end = chars.length - 1;
        
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
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
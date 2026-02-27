package PalindromeChecker;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class palindromeCheck{

    public static boolean isPalindrome(String str){
        char[] chars = str.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        
        for (char c : chars) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    
    public static void demonstrateFIFOvsLIFO(String str) {
        char[] chars = str.toCharArray();
        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        System.out.println("Adding characters: ");
        for (char c : chars) {
            queue.add(c);     
            stack.push(c);     
            System.out.print(c + " ");
        }
        System.out.println("\n");
        
        System.out.println("FIFO (Queue) vs LIFO (Stack):");
        System.out.println("-----------------------------");
        System.out.printf("%-10s | %-10s | %-10s%n", "Order", "Dequeue", "Pop");
        System.out.println("-----------------------------");
        
        int order = 1;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char dequeued = queue.remove();  
            char popped = stack.pop();      
            System.out.printf("%-10d | %-10c | %-10c%n", order++, dequeued, popped);
        }
        System.out.println("-----------------------------");
        System.out.println("Queue (FIFO): Same order as input");
        System.out.println("Stack (LIFO): Reversed order");
    }
    
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Manager System!\nVersion 1.0\nSystem initialized successfully!\n");
        String str = "racecar";
        
        // Demonstrate FIFO vs LIFO
        System.out.println("=== FIFO vs LIFO Demonstration ===\n");
        demonstrateFIFOvsLIFO(str);
        
        System.out.println("\n=== Palindrome Check ===\n");
        if(isPalindrome(str)){
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
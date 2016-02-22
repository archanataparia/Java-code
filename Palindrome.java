package StringNArraysCTC;

import java.io.*;
import java.util.*;
class MyPalindrome {
	Stack<String> stack = new Stack<String>();
	Queue<String> queue = new LinkedList<String>();
    void pushCharacter(char ch)
    {
    	stack.push(String.valueOf(ch));
    }
    void enqueueCharacter(char ch)
    {
    	queue.add(String.valueOf(ch));
    }
    char popCharacter()
    {
    	return stack.pop().charAt(0);
    }
    char dequeueCharacter()
    {
    	return queue.poll().charAt(0);
    }
    
}
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the MyPalindrome class object p.
        MyPalindrome p = new MyPalindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}

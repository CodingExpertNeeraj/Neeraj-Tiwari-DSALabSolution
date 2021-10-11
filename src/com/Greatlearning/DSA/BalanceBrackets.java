package com.Greatlearning.DSA;
import java.util.Scanner;
import java.util.Stack;
public class BalanceBrackets {
    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check for Balance: ");
		String inp = sc.next();

		if(checkStringIsBalanced(inp))
		{
			System.out.println("Entered string "+inp+" is Balanced.");
		}
		else
		{
			System.out.println("Entered string "+inp+" is not Balanced.");
		}

	}

	private static boolean checkStringIsBalanced(String inp) {
		Stack<Character> myStack = new Stack<Character>();
		for(int i=0;i<inp.length();i++)
		{
			char myCurrentChar = inp.charAt(i);
			if(myCurrentChar=='[' || myCurrentChar=='{' || myCurrentChar=='(') {
				myStack.add(myCurrentChar);
			}
			if(myStack.empty()) return false;
			char localChar;
			switch(myCurrentChar)
			{
			case ']':
			    localChar = myStack.pop();
				if(localChar=='(' || localChar=='{') {
					return false;
				}
				break;
			case '}':
				localChar = myStack.pop();
				if(localChar=='(' || localChar=='[') {
					return false;
				}
				break;
			case ')':
				localChar = myStack.pop();
				if(localChar=='[' || localChar=='{') {
					return false;
				}
				break;
			default:
				break;
			}
		}
		return(myStack.isEmpty());
	}
}

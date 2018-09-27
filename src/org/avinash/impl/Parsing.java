package org.avinash.impl;

import java.util.Stack;

public class Parsing {

	boolean isBalanced(String str) {
		Stack<Character> brackets = new Stack<Character>();
		
		char[] charList = str.toCharArray();
		
		for (int i = 0; i < charList.length; i++) {
			if (charList[i] == '{' || charList[i] == '(' || charList[i] == '[') {
				brackets.push(charList[i]);
			} else {
				if(charList[i] == '}' && brackets.peek() == '{') {
					brackets.pop();
				}else if(charList[i] == ')' && brackets.peek() == '('){
					brackets.pop();
				}else if(charList[i] == ']' && brackets.peek() == '['){
					brackets.pop();
				}else {
					break;
				}
			}
		}

		return brackets.size() == 0;
	}
}

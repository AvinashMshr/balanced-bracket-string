package org.avinash.impl;

public class Main {

	public static void main(String[] args) {
		Parsing parsing = new Parsing();
		String str ="[{}]()(){";
		if(parsing.isBalanced(str)) {
			System.out.println("It is balanced");
		}else {
			System.out.println("It is unbalanced");
		}
	}
}

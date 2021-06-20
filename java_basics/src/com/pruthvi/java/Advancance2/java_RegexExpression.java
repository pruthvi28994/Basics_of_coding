package com.pruthvi.java.Advancance2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_RegexExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[abc]-->a or b or c
//		[^abc]--> except abc
//		[a-z] --> character within a-z
//		$-->end
//		.abc-->if you use (.) before or after then it neglects all the character before or after
//		[] {1}-->{} use specify number of character
//		^--->start
		Scanner sc = new Scanner(System.in);
		String USNmatch = "^[1][a-zA-Z]{2}[0-9]{2}[a-zA-Z]{2}[0-9]{3}$";
		// make use of Pattern to check your regexpression
		Pattern regex = Pattern.compile(USNmatch);
		String USN;
		System.out.println("Regular Expression");
		System.out.println("1-->enter the USN:");
		USN = sc.nextLine();

		// matcher helps to match with your input text
		Matcher m = regex.matcher(USN);
		System.out.println("Details of Pattern are :" + m);
		// find() returns boolean if true
		boolean status = m.find();
		System.out.println("USN is in " + status + " format");

	}

}

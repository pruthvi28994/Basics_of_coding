package java_ClassAndObjects;

import java.util.Arrays;

public class java_String_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lets learn the string functions");
		//string are immutable i.e once defined cannot modify the value of the string
		String str1="Pruthvi Sagar S";
		String str2="Mysore";
		System.out.println("1.Length of the string1 =>"+str1.length()+" string2 =>:"+str2.length());
		
		System.out.println("2.String concatenation using concat()=>"+str1.concat(str2));
		System.out.println("3.Character at defined position 2=>"+str1.charAt(2));
		
		System.out.println("4.Check if both string are equal");
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are Not equal");
		}
		System.out.println("5.Return the index of the character =>"+str1.indexOf('a'));
		System.out.println("6.Replace the character=> "+str2.replace('e', 'u'));
		System.out.println("7.Split will split the string in to units ");
		String[] arr=str1.split(" ");
		Arrays.asList(arr).forEach(s->System.out.println(s));
		
		System.out.println();
		System.out.println("8.Substring of the string1=>"+str1.substring(0,7));
		System.out.println("9.check if string1 ends with 'S':"+str1.endsWith("S"));
		System.out.println("20.check if string1 matches str2:"+str1.matches(str2));
		
	}

}

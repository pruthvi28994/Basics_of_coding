package java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
        String s1=sc.nextLine();
        s1=s1.substring(1,s1.length()-1);
        String input1[]=s1.split(",");
        
        for(int i=0;i<input1.length;i++){
            list1.add(Integer.parseInt(input1[i]));
        }
        for(int i:list1) {
        	System.out.println(i);
        }
	}

}

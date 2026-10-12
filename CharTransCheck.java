package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class CharTransCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(charTransformCheck(str1, str2));
		
		
	}
	public static String charTransformCheck(String str1 , String str2) {
		if(str1.length() != str2.length()) 
			return "NO";
		
		HashMap<Character,Character>  map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>(); 
		
		
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(map1.containsKey(ch)) {
				if(map1.get(ch) == ch2) 
					return "NO";
			}
		}
		return "YES";
	}
	

}

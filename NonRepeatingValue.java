package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		System.out.println(nonrepeatingCharacter(str1));

	}
	
	public static String nonrepeatingCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch,0) +1);
		}
		
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(map.get(ch) == 1) 
				return Character.toString(ch);
		}
		
		return "-1";
	}
}

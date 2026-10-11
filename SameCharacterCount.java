package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class SameCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(checkingCharCountAreSame(str1, str2));

	}
	
	public static String checkingCharCountAreSame(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return "NO";
		}
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i< str1.length();i++) {
			char ch = str1.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		for(int i = 0; i< str1.length();i++) {
			char ch = str2.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		
		for(int i = 0; i < str1.length(); i++) {
			if(!map1.containsKey(str1.charAt(i))) {
				return "NO";
			}
			if(!map1.get(str1.charAt(i)).equals(map2.get(str1.charAt(i)))) {
				return "NO";
			}
		}
		return "YES";
	}

}

package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class MaxCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		System.out.println(maxCharCount(str1));
	}
	
	public static char maxCharCount(String str1) {
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(int i = 0; i< str1.length();i++) {
			char ch = str1.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		char maxChar = ' ';
		int maxCount = 0;
		
		for(Character val : map1.keySet()) {
			if(map1.get(val) > maxCount) {
				maxCount = map1.get(val);
				maxChar = val;
			}
		}
		return maxChar;
	}

}

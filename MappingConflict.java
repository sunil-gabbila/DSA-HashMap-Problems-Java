package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class MappingConflict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(firstCharMatchingConflict(str1, str2));
	}
	
	public static int firstCharMatchingConflict(String str1, String str2) {
		if(str1.length() != str2.length())
			return -1;
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		
		int position = 1;
		for(int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(map1.containsKey(ch1)) {
				if(map1.get(ch1) != ch2) {
					return position;
				}
			}
			map1.put(ch1, ch2);
			map2.put(ch2, ch1);
			position++;
			
		}
		return position;
	}

}

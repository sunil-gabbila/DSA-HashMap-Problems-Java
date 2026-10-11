package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class FisrtRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		
		System.out.println(fisrtReapeatedOne(str1));

	}
	
	public static String fisrtReapeatedOne(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				return Character.toString(ch);
			}
			map.put(ch,map.getOrDefault(ch, 0) + 1);
		}
		return "-1";
	}

}

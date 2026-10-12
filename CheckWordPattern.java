package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class CheckWordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String [] arr = str2.split(" ");
		System.out.println(checkPattern(str1, arr));
		sc.close();
		
	}
	
	public static String checkPattern(String str ,String [] arr) {
		
		HashMap <Character,String> map1 = new HashMap<>();
		HashMap<String, Character> map2 = new HashMap<>();
		
		if(str.length() != arr.length) {
			return "NO";
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch  = str.charAt(i);
			String word = arr[i];
			if(map1.containsKey(ch)) {
				if(!map1.get(ch).equals(word))
					return "NO";
			}
			if(map2.containsKey(word)) {
				if(!map2.get(word).equals(ch)) {
					return "NO";
				}
			}
			map1.put(ch, word);
			map2.put(word, ch);
		}
		return "YES";
	}

}

package com.kodnest.Mapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		
		System.out.println(anagramCheck(str1, str2));

	}
	
	public static String anagramCheck(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return "NO";
		}
		
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		
		for(int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		
		if(map1.equals(map2)) {
			return "YES";
		}
		return "NO";
		
	}
	
}



//// Another way of approch with Arrays  which are converted from string to char Array
  public static String anagramCheck(String str1, String str2) {
		  if(str1.length() != str2.length()) {
			  return "NO";
		  }
    	char [] arr1 = str1.toCharArray();
    	char [] arr2 = str2.toCharArray();
    	
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	
    	if(Arrays.equals(arr1,arr2)) {
    		return "YES";
    	}
    	return "NO";
  }






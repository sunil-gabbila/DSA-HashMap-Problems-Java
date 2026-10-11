package com.kodnest.Mapping;

import java.util.Scanner;
import java.util.TreeMap;

public class CountEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		TreeMap<Character,Integer> res = characterCount(str);
		
		res.forEach((key, value)-> {
			System.out.println(key + " " + value);
		});

	}
	
	public static TreeMap<Character, Integer> characterCount(String str) {
		TreeMap<Character,Integer> treeMap = new TreeMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			treeMap.put(ch,treeMap.getOrDefault(ch, 0) + 1);
		}
		
		return treeMap;
	}

}

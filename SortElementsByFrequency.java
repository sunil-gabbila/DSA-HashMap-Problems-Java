package com.kodnest.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortElementsByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> res = sortByfreq(n, arr);
		
		for(int val : res) {
			System.out.print(val + " ");
		}
	}
	
	public static ArrayList<Integer> sortByfreq(int n, int [] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int val : arr) {
			map.put(val, map.getOrDefault(val, 0)+1);
		}
		
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				int freqA = map.get(a);
				int freqB = map.get(b);
				if(freqA == freqB) 
					return Integer.compare(a, b);
				
				return Integer.compare(freqB, freqA);
			}
		});
		return list;
	}

}

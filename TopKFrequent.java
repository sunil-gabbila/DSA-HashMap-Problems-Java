package com.kodnest.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TopKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		ArrayList<Integer> res = frequentK(n, arr, k);
		
		for(int val : res) {
			System.out.print(val + " ");
		}
	}
	
	public static ArrayList<Integer> frequentK(int n, int [] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int val : arr) {
			map.put(val, map.getOrDefault(val, 0)+1);
		}
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0; i < k; i++) {
			int maxFreq = 0, maxElement = 0;
			for(int val : map.keySet()) {
				if(map.get(val) > maxFreq) {
					maxFreq = map.get(val);
					maxElement = val;
				}
				else if(maxFreq == map.get(val) && val < maxElement) {
					maxElement = val;
				}
			}
			arrayList.add(maxElement);
			map.remove(maxElement);
		}
			
			return arrayList;
			
	}

}

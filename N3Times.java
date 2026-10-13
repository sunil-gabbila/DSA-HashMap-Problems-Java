package com.kodnest.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class N3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> res = majorityCheck(n, arr);
		
		for (Integer val : res) {
			System.out.println(val + " ");
		}

	}
	
	public static ArrayList<Integer> majorityCheck(int n, int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int val : map.keySet()) {
			if(map.containsKey(val)) {
				if(map.get(val) > n/3) {
					list.add(val);
				}
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}
		return list;
	}
	

}

package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(majorityCheck(n, arr));

	}
	
	public static int majorityCheck(int n, int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		for(int val : map.keySet()) {
			if(map.containsKey(val)) {
				if(map.get(val) > n/2) {
					return val;
				}
			}
		}
		return -1;
	}

}

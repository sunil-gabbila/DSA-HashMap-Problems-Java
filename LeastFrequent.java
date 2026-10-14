package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class LeastFrequent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(leastFrequentElement(n, arr));
	}
	
	public static int leastFrequentElement(int n, int[] arr) {
        // Write your logic here

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int key : arr) {
                map.put(key, map.getOrDefault(key,0) + 1);
            }

                int minFreq = Integer.MAX_VALUE;
                int minElement = Integer.MAX_VALUE;

            for( int value : map.keySet()) {

                if(map.get(value) < minFreq) {
                    minFreq = map.get(value);
                    minElement = value;
                }
                else if(map.get(value) == minFreq && value < minElement) {
                    minElement = value;
                }
            }
        return minElement;
    }

}

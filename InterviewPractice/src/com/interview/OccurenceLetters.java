package com.interview;

public class OccurenceLetters {

	public static void main(String[] args) {
		int[] counters = new int[256];
		
		String str = "Maniraj";
		
		int len = str.length();
		
		for(int i = 0; i < len; i++) {
			counters[str.charAt(i)]++;
		}
		
		int array[] = new int[len];
		for(int i = 0; i < len; i++) {
			array[i] = str.charAt(i);
			int flag = 0;
			
			for(int j = 0; j <= i; j++) {
				if(array[j] == str.charAt(i)) {
					flag++;
				}
			}
			if(flag == 1)
				System.out.println("Occurence of " + str.charAt(i) + " in a String is: " + counters[str.charAt(i)]);
		}
	}

}

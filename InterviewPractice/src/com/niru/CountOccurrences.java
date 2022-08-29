package com.niru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOccurrences {

	public static void main(String[] args) {
		int[] array = {1,2,2,5,3,5,9};
		int len = array.length;
											
		//List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList()); //Collectors
		Set<Integer> sst = new HashSet<>( Arrays.stream(array).boxed().collect(Collectors.toList()));
		
		List<Integer> collect = new ArrayList<>(sst);
		
		 int[] primitive = collect.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();
		 System.out.println(Arrays.toString(primitive));
		
		for(int j = 0; j < len; j++) {
			System.out.println(array[j] + " occurance count: " + occuredNumber(array, len, array[j]));
		}
	}
	
	public static int occuredNumber(int[] a, int len, int number) {
		int flag = 0;
		for(int i = 0; i < len; i++) {
			if(a[i] == number)
				flag++;
		}
		return flag;
	}

}

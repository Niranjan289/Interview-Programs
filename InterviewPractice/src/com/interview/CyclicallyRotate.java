package com.interview;

import java.util.Arrays;

public class CyclicallyRotate {
	
	/*
	 * 1. check for how many position need move
	 * 2. write first rotateRightPosition method here 
	 * 				i. take instance variable for last field
	 * 				ii. take for loop with length - 2 and i >= 0 i --
	 * 				iii.  update position like A[i + 2] = A[i]
	 * 				iv. update first position with last instance variable value
	 * 3. write for print statement with group value
	 * 4. write for check and k iteration and call rotateRightPosition method.
	 * 5. In Main method iterate how many time need to print
	 * 
	 */
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6};
		int k = 0;
		
		for(int i = 0; i < 7; i++) {
			rotatePosition(A, k);
			printOutput(A);
			k = 2;
		}
	}
	
	public static void rotatePosition(int[] A, int k) {
		if(k < 0 || k >= A.length) {
			return;
		}
		
		for(int i = 0; i < k; i++) {
			rotateRightPosition(A);
		}
	}
	
	public static void rotateRightPosition(int[] A) {
		int last = A[A.length - 1];
		for(int i = A.length - 2; i >= 0; i--) {
			A[i + 1] = A[i];
		}
		A[0] = last;
	}
	
	public static void printOutput(int[] A) {
		int[] out = new int[4];
		for(int i = 0; i < 4; i++) {
			out[i] = A[i];
		}
		System.out.println(Arrays.toString(out));
	}

}

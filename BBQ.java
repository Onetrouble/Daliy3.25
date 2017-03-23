package com.situ;

public class BBQ {
	public static void oddAndEvenCount(int[] array){
		int evencount=0;
		int oddcount=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2==0){
				evencount++;
			}else{
				oddcount++;
			}
		}
		System.out.println("偶数个数"+evencount);
		System.out.println("奇数个数"+oddcount);
	
	}


}

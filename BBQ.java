package com.situ;

import org.junit.Test;

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
	

//----*                   5             i=1  j =1+2+3+4+5*
//---* *                 4 6
//--* * *               3 5 7
//-* * * *             2 4 6  8
//* * * * *           1 3 5  7 9

	@Test
	public void test5() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int z = 0; z <=i ; z++) {
				System.out.print("* ");
			}
			
			System.out.println();
			}
			
			
		}
	}


package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class xiaxie {
//   @Test  
//public void test1(){
//	int[] array=new int[4];
//	array[0]=70;
//	array[1]=60;
//	array[2]=50;
//	array[3]=40;
//	System.out.println(sum(array));
//	System.out.println(getMax(array));
//	System.out.println(getMin(array));
//	System.out.println(oddNums(array));
//	System.out.println(evenNums(array));
//	
//}
//
//public static int sum(int[] array){
//	int sum=0;
//	for (int i = 0; i < array.length; i++) {
//		sum=sum+i;
//	}
//	return sum;
//}
//
//public static int getMax(int[] array){
//	int max=array[0];
//	int min=array[0];
//	for (int i = 0; i < array.length; i++) {
//		if(max < array[i]){
//			max=array[i];
//		}
//			
//	}
//	return max;
//}
//
//public static int getMin(int[] array){
//	int min=array[0];
//	for (int i = 0; i < array.length; i++) {
//		if(min > array[i]){
//			min=array[i];
//		}
//	}
//	return min;
//}
//
//public static int evenNums(int[] array){
//	int count=0;
//	for (int i = 0; i < array.length; i++) {
//		if( array[i] % 2 ==0){
//			count+=1;
//		}
//	}
//	return count;
//	
//}
//
//public static int oddNums(int[] array){
//	int count1=0;
//	for (int i = 0; i < array.length; i++) {
//		if( array[i] % 2 ==1){
//			count1+=1;
//		}
//	}
//	return count1;
//}
//public void printArray(int[] array){
//	for (int i = 0; i < array.length; i++) {
//		
//		System.out.println(array[i]);
//	}
//}
//@Test
//	public void test2() {
//		int score[] = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
//				0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
//		int[] numCountArray=new int[10];
//		for (int i = 0; i < numCountArray.length; i++) {
//			switch(score[i]){
//			case 1:
//				numCountArray[i]+=1;
//				break;
//			case 2:
//				numCountArray[2] += 1;
//				break;
//			case 3:
//				numCountArray[3] += 1;
//				break;
//			case 4:
//				numCountArray[4] += 1;
//				break;
//			case 5:
//				numCountArray[5] += 1;
//				break;
//			case 6:
//				numCountArray[6] += 1;
//				break;
//			case 7:
//				numCountArray[7] += 1;
//				break;
//			case 8:
//				numCountArray[8] += 1;
//				break;
//			case 9:
//				numCountArray[9] += 1;
//				break;
//				default:
//				break;
//		}
//		}
//		for (int i = 0; i < numCountArray.length; i++) {
//			System.out.println(i+"的次数"+numCountArray[i]);
//		}
//
//	}
//public static int sum1(int[] array){
//	int sum =0;
//	for (int i = 0; i < array.length; i++) {
//		sum=sum+array[i];
//	}
//	return sum;
//}
//
//public static int getMax1(int[] array){
//	int max = array[0];
//	for (int i = 0; i < array.length; i++) {
//		if(max < array[i]){
//			max=array[i];
//		}
//	}
//	return max;
//}
//
//public static  int getMin1(int[] array){
//	int min= array[0];
//	for (int i = 0; i < array.length; i++) {
//		if(min > array[i]){
//			min=array[i];
//		}
//	}
//	return min;
//}
//
//	@Test
//	public void test21() {
//		int count11 = 0;
//		int count12 = 0;
//		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
//				0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
//		for (int i = 0; i < score.length; i++) {
//			if (score[i] % 2 == 0) {
//				count11++;
//			} else {
//				count12++;
//			}
//		}
//		System.out.println(count11);
//		System.out.println(count12);
//	}
//	public void test3(){
//		int max=getMax(3,5);
//		System.out.println(max);
//		
//		boolean b =compare(3,5);
//		if(b == true){
//			System.out.println("liagexiangdeng");
//		}else{
//			System.out.println("不行等");
//		}
//			System.out.println(b);
//	}
//
//	private boolean compare(int 3, int 5) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	private int getMax(int i, int j) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	
	
//	public static void main(String[] args) {
//		
//		boolean b= compare(3,5);
//		if(b==true){
//			System.out.println("liazhixiangdeng");
//		}else{
//			System.out.println("buxingdeng");
//		}
//		System.out.println(b);
//	}
//	
//	public static boolean comapare(int num1,int num2){
//		if(num1 ==num2){
//			return true;
//		}else{
//			return false;
//		}
//	}
//	
//	@Test
//	public void printSeasonByIf(){
//		Scanner scanner=new Scanner(System.in);
//		int month=scanner.nextInt();
//		if(month<1 || month>12){
//			System.out.println("不合法月份");
//			return;
//		}
//		
//		if(month==1 || month ==2 || month==12){
//			System.out.println("冬季");
//		}else if(month==3 ||month==4 || month==5){
//			System.out.println("春季");
//		}else if(month==6 ||month==7||month==8){
//			System.out.println("夏季");
//		}else if(month==9 || month==10 ||month==11){
//			System.out.println("秋季");
//		}
//	}
//	
//	public static int getSum(int[] array){
//		int sum=0;
//		for (int i = 0; i < array.length; i++) {
//			sum=sum+array[i];
//		}
//		return sum;
//	}
	
public static void oddAndEvenCount(int[] array){
	int evencount=0;
	int oddcount=0;
	for (int i = 0; i < array.length; i++) {
		if(i % 2==0){
			evencount++;
		}else{
			oddcount++;
		}
	}
	System.out.println("偶数个数"+evencount);
	System.out.println("奇数个数"+oddcount);
	System.out.println("奇数个数"+oddcount);
	System.out.println("奇数个GAILEDE数"+oddcount);
	System.out.println("奇数个宝宝数"+oddcount);
	System.out.println("奇数个宝宝E数"+oddcount);
}

@Test
public void test6(){
	int[] array1=new int[]{10,22,32,40};
        oddAndEvenCount(array1);
}
}

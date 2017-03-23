package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class lianxizuoye {
	@Test
	public void test1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

	@Test
	public void test2() {
		int num = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				num = i / 7;
				System.out.println(i);
			}
		}
		}
	

	
	public boolean compare1(int x, int y) {
		if (x == y) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("qingshuchu");
		int num = scanner.nextInt();
		switch (num) {
		case 1:
		case 2:
		case 12:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		default:
			System.out.println("没有此季节");
			break;
		}
	}

	@Test
	public void test6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入几月份");
		int num = scanner.nextInt();
		if (num <= 5 && num >= 3) {
			System.out.println("春季");
		} else if (num <= 8 && num >= 6) {
			System.out.println("夏季");
		} else if (num <= 11 && num >= 9) {
			System.out.println("秋季");
		} else if ((num <= 2 && num >= 1) || (num == 12)) {
			System.out.println("冬季");
		}
	}
public static int getMax(int num1,int num2){
	if(num1 > num2){
		return num1;
		}else {
			return num2;
		}
			
	}
	@Test
	public void test11(){
		int count=0;
	for(int i=1; i<100;i++){
		if(i % 7 ==0){
			System.out.println(i);
		count+=1;
		}
		}
	System.out.println(count);
	}
	public static boolean compare(int num1,int num2){
		if(num1 ==num2){
			return true;
		}else{
			return false;
		}
	}
	
@Test
	public void test12() {
		boolean b = compare(3, 4);
		if (b == true) {
			System.out.println("俩个值相等");
		} else {
			System.out.println("不相等");
		}
		System.out.println(b);
	}
@Test
public void printSeasonByIf(){
	
}
}
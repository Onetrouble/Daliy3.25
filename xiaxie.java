package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class xiaxie {
//	// @Test
//	// public void test1(){
//	// int[] array=new int[4];
//	// array[0]=70;
//	// array[1]=60;
//	// array[2]=50;
//	// array[3]=40;
//	// System.out.println(sum(array));
//	// System.out.println(getMax(array));
//	// System.out.println(getMin(array));
//	// System.out.println(oddNums(array));
//	// System.out.println(evenNums(array));
//	//
//	// }
//	//
//	// public static int sum(int[] array){
//	// int sum=0;
//	// for (int i = 0; i < array.length; i++) {
//	// sum=sum+i;
//	// }
//	// return sum;
//	// }
//	//
//	// public static int getMax(int[] array){
//	// int max=array[0];
//	// int min=array[0];
//	// for (int i = 0; i < array.length; i++) {
//	// if(max < array[i]){
//	// max=array[i];
//	// }
//	//
//	// }
//	// return max;
//	// }
//	//
//	// public static int getMin(int[] array){
//	// int min=array[0];
//	// for (int i = 0; i < array.length; i++) {
//	// if(min > array[i]){
//	// min=array[i];
//	// }
//	// }
//	// return min;
//	// }
//	//
//	// public static int evenNums(int[] array){
//	// int count=0;
//	// for (int i = 0; i < array.length; i++) {
//	// if( array[i] % 2 ==0){
//	// count+=1;
//	// }
//	// }
//	// return count;
//	//
//	// }
//	//
//	// public static int oddNums(int[] array){
//	// int count1=0;
//	// for (int i = 0; i < array.length; i++) {
//	// if( array[i] % 2 ==1){
//	// count1+=1;
//	// }
//	// }
//	// return count1;
//	// }
//	// public void printArray(int[] array){
//	// for (int i = 0; i < array.length; i++) {
//	//
//	// System.out.println(array[i]);
//	// }
//	// }
//	// @Test
//	// public void test2() {
//	// int score[] = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
//	// 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
//	// int[] numCountArray=new int[10];
//	// for (int i = 0; i < numCountArray.length; i++) {
//	// switch(score[i]){
//	// case 1:
//	// numCountArray[i]+=1;
//	// break;
//	// case 2:
//	// numCountArray[2] += 1;
//	// break;
//	// case 3:
//	// numCountArray[3] += 1;
//	// break;
//	// case 4:
//	// numCountArray[4] += 1;
//	// break;
//	// case 5:
//	// numCountArray[5] += 1;
//	// break;
//	// case 6:
//	// numCountArray[6] += 1;
//	// break;
//	// case 7:
//	// numCountArray[7] += 1;
//	// break;
//	// case 8:
//	// numCountArray[8] += 1;
//	// break;
//	// case 9:
//	// numCountArray[9] += 1;
//	// break;
//	// default:
//	// break;
//	// }
//	// }
//	// for (int i = 0; i < numCountArray.length; i++) {
//	// System.out.println(i+"的次数"+numCountArray[i]);
//	// }
//	//
//	// }
//	// public static int sum1(int[] array){
//	// int sum =0;
//	// for (int i = 0; i < array.length; i++) {
//	// sum=sum+array[i];
//	// }
//	// return sum;
//	// }
//	//
//	// public static int getMax1(int[] array){
//	// int max = array[0];
//	// for (int i = 0; i < array.length; i++) {
//	// if(max < array[i]){
//	// max=array[i];
//	// }
//	// }
//	// return max;
//	// }
//	//
//	// public static int getMin1(int[] array){
//	// int min= array[0];
//	// for (int i = 0; i < array.length; i++) {
//	// if(min > array[i]){
//	// min=array[i];
//	// }
//	// }
//	// return min;
//	// }
//	//
//	// @Test
//	// public void test21() {
//	// int count11 = 0;
//	// int count12 = 0;
//	// int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
//	// 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
//	// for (int i = 0; i < score.length; i++) {
//	// if (score[i] % 2 == 0) {
//	// count11++;
//	// } else {
//	// count12++;
//	// }
//	// }
//	// System.out.println(count11);
//	// System.out.println(count12);
//	// }
//	// public void test3(){
//	// int max=getMax(3,5);
//	// System.out.println(max);
//	//
//	// boolean b =compare(3,5);
//	// if(b == true){
//	// System.out.println("liagexiangdeng");
//	// }else{
//	// System.out.println("不行等");
//	// }
//	// System.out.println(b);
//	// }
//	//
//	// private boolean compare(int 3, int 5) {
//	// // TODO Auto-generated method stub
//	// return false;
//	// }
//	//
//	// private int getMax(int i, int j) {
//	// // TODO Auto-generated method stub
//	// return 0;
//	// }
//	//
//	//
//
//	// public static void main(String[] args) {
//	//
//	// boolean b= compare(3,5);
//	// if(b==true){
//	// System.out.println("liazhixiangdeng");
//	// }else{
//	// System.out.println("buxingdeng");
//	// }
//	// System.out.println(b);
//	// }
//	//
//	// public static boolean comapare(int num1,int num2){
//	// if(num1 ==num2){
//	// return true;
//	// }else{
//	// return false;
//	// }
//	// }
//	//
//	// @Test
//	// public void printSeasonByIf(){
//	// Scanner scanner=new Scanner(System.in);
//	// int month=scanner.nextInt();
//	// if(month<1 || month>12){
//	// System.out.println("不合法月份");
//	// return;
//	// }
//	//
//	// if(month==1 || month ==2 || month==12){
//	// System.out.println("冬季");
//	// }else if(month==3 ||month==4 || month==5){
//	// System.out.println("春季");
//	// }else if(month==6 ||month==7||month==8){
//	// System.out.println("夏季");
//	// }else if(month==9 || month==10 ||month==11){
//	// System.out.println("秋季");
//	// }
//	// }
//	//
//	// public static int getSum(int[] array){
//	// int sum=0;
//	// for (int i = 0; i < array.length; i++) {
//	// sum=sum+array[i];
//	// }
//	// return sum;
//	// }
//
//	public static void oddAndEvenCount(int[] array) {
//		int evencount = 0;
//		int oddcount = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (i % 2 == 0) {
//				evencount++;
//			} else {
//				oddcount++;
//			}
//		}
//		System.out.println("偶数个数" + evencount);
//		System.out.println("奇数个数" + oddcount);
//		System.out.println("奇数个数" + oddcount);
//		System.out.println("奇数个GAILEDE数" + oddcount);
//		System.out.println("奇数个宝宝数" + oddcount);
//		System.out.println("奇数个宝宝E数" + oddcount);
//	}
//
//	@Test
//	public void test6() {
//		int[] array1 = new int[] { 10, 22, 32, 40 };
//		oddAndEvenCount(array1);
//	}
//
//	@Test
//	public void test1() {
//		int a = 5;
//		int b = 3;
//		System.out.println(a);
//		System.out.println(b);
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("aftera:" + a);
//		System.out.println("afterb:" + b);
//	}
//
//	@Test
//	public void test2() {
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		if (score < 0 && score > 100) {
//			System.out.println("不合法成绩");
//			return;
//		}
//		if (score >= 90) {
//			System.out.println("优秀");
//		} else if (score >= 80) {
//			System.out.println("lianghao");
//		} else if (score >= 70) {
//			System.out.println("yiban");
//		} else if (score >= 60) {
//			System.out.println("jige");
//		} else if (score < 60) {
//			System.out.println("bujige");
//		}
//	}
//
//	@Test
//	public void test4() {
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			sum = sum + i;
//			System.out.println(i);
//		}
//		System.out.println(sum);
//	}
//
//	@Test
//	public void test7() {
//		int year = 2018;
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
//			System.out.println(year+"shirunnian");
//
//		}else{
//		System.out.println(year+"bushirunnian");
//		}
////	}
//	@Test
//	public void test5(){
//		int[] array=new int[4];
//		Scanner scanner =new Scanner(System.in);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("打印學生信息");
//			array[i]=scanner.nextInt();
////			數組不能忘記
//		}
//		int sum=0;
//		for (int i = 0; i < array.length; i++) {
//			sum=sum+array[i];
//		}
//		int avg=sum / array.length;
//		System.out.println(avg);
//				
//	}
////	@Test
////	public void test8(){
////		int i=0;
////		while(i<5){
////			i++;
////			System.out.println("hello");
////		}
////	}
//	
//	@Test
//	public void test9() {
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		if (score < 0 && score > 100) {
//			System.out.println("不合法成績");
//			return;
//		}
//		int type = score / 10;
//		// 條件不能忘記
//		switch (type) {
//		case 10:
//			System.out.println("優秀");
//			break;
//		case 9:
//			System.out.println("youxiu");
//			break;
//		case 8:
//			System.out.println("lianghao");
//			break;
//		case 7:
//			System.out.println("yiban");
//			break;
//		case 6:
//			System.out.println("jige");
//			break;
//		case 5:
//			System.out.println("bujige");
//			break;
//		default:
//			System.out.println("bujige");
//			// 輸出不能忘記
//			break;
//		}
//	}
//
//	@Test
//	public void test10() {
//		int[] array = new int[4];
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("打印學生信息");
//			array[i] = scanner.nextInt();
//		}
//
//		int sum = sum(array);
//		int avg = sum / array.length;
//		System.out.println(avg);
//	}
//
//	// 返回值這裡是重點
//	public static int sum(int[] array) {
//		int sum = 0;
//		for (int j = 0; j < array.length; j++) {
//			sum = sum + array[j];
//		}
//		return sum;
//
//	}
//
//	@Test
//	public void test11() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸出學生呢給那些");
//		int num = scanner.nextInt();
//		Student[] students = new Student[num];
//		for (int i = 0; i < students.length; i++) {
//			Student student = new Student();
//			System.out.println("輸入第" + (i + 1) + "個學生姓名");
//			student.name = scanner.next();
//			System.out.println("輸入第" + (i + 1) + "個學生年齡");
//			student.age = scanner.nextInt();
//			System.out.println("輸入第" + (i + 1) + "個學生性別");
//			student.sex = scanner.next();
//			students[i] = student;
//		}
//		printStudentInFo(students);
//		// 這裡不能出錯
//	}
//
//	private void printStudentInFo(Student[] students) {
//		for (int j = 0; j < students.length; j++) {
//			// 出錯地方
//			System.out.println("姓名" + students[j].name);
//			System.out.println("年齡" + students[j].age);
//			System.out.println("性別" + students[j].sex);
//		}
//	}
//
//	@Test
//	public void test12() {
//		Scanner scanner = new Scanner(System.in);
//
//		Student[] students = new Student[3];
//		for (int i = 0; i < students.length; i++) {
//			Student student = new Student();
//			System.out.println("輸入nide 學生姓名");
//			student.name = scanner.next();
//			System.out.println("輸入nide學生年齡");
//			student.age = scanner.nextInt();
//			System.out.println("輸入nide學生性別");
//			student.sex = scanner.next();
//			students[i] = student;
//		}
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].age);
//			System.out.println(students[i].sex);
//		}
//		while (true) {
//
//			System.out.println("genjuxingmingchaxun-1");
//			System.out.println("genjunianlingchaxun-2");
//			System.out.println("genjuxingbie-3");
//			System.out.println("tuichu-0");
//
//			int type = 0;
//			if (type == 0) {
//				System.out.println("tuichu");
//				break;
//			}
//			switch (type) {
//			case 1:
//				System.out.println("请输入信息");
//				String name = scanner.next();
//				boolean isByNameFound = false;
//				for (int i = 0; i < students.length; i++) {
//					Student student = students[i];
//					if (name.equals(student.name)) {
//						System.out.println(student.name);
//						System.out.println(student.age);
//						System.out.println(student.sex);
//						isByNameFound = true;
//					}
//				}
//
//				if (isByNameFound = false) {
//					System.out.println("沒有信息");
//				}
//			}
//		}
//	}
//	public void printArray(int[] array){
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}
//	
//	@Test
//	public void test13(){
//		int[] score = new int[]{0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
//	    int[] numArrayCount=new int[10];
//	    for (int i = 0; i < score.length; i++) {
//			switch(score[i]){
//			case 0:
//				numArrayCount[0]++;
//				break;
//			case 1:
//				numArrayCount[1]++;
//				break;
//			case 2:
//				numArrayCount[2]++;
//				break;
//			case 3:
//				numArrayCount[3]++;
//				break;
//			case 4:
//				numArrayCount[4]++;
//				break;
//			case 5:
//				numArrayCount[5]++;
//				break;
//			case 6:
//				numArrayCount[6]++;
//				break;
//			case 7:
//				numArrayCount[7]++;
//				break;
//			case 8:
//				numArrayCount[8]++;
//				break;
//			case 9:
//				numArrayCount[9]++;
//				break;
//			default:
//				break;
//		}
//	    }
//	    for (int i = 0; i < numArrayCount.length; i++) {
//			System.out.println(i+"decishu"+numArrayCount[i]);
//		}
//	}

	@Test
	public  void test21() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	@Test
	public void test22(){
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	
	@Test
	public void test29(){
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void test31() {
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");

			}
			System.out.println();
			
		}
	}
	@Test
	public void test33() {
		int[] arr = new int[] { 10, 5, 7 };
		brintArray1(arr);
	}
	
	
	public static void brintArray1(int[] array){
		System.out.print("[");
		
		for (int i = 0; i < array.length; i++) {
			if(i!=array.length-1){
				System.out.print(array[i]+",");
			}else{
				System.out.println(array[i]+"]");
			}
		}
}}
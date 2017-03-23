package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class lianxi {
////	 @Test
////	 public void test1(){
////	
////	 }
////	 int a = 5;
////	 int b = 3;{
////	 System.out.println("a:"+a);
////	 System.out.println("b:"+b);
////	
////	 int temp = a;
////	 a = b ;
////	 b = temp;{
////	 System.out.println("aftera:"+a);
////	 System.out.println("afterb:"+b);
////	 }
////	 }
////	 @Test
////	 public void test2(){
////	 Scanner scanner = new Scanner(System.in);
////	 int num =scanner.nextInt();
////	 if(num < 0 && num > 100 ){
////	 System.out.println("不合法成绩");
////	 return;
////	 }
////	
////	 else if( num >= 90){
////	 System.out.println("优秀");
////	 }
////	 else if( num >= 80){
////	 System.out.println("良好");
////	 }
////	 else if( num >= 70){
////	 System.out.println("一般");
////	 }
////	 else if( num >= 60){
////	 System.out.println(" 及格");
////	 }
////	 else if( num < 60){
////	 System.out.println("不及格");
////	 }
////	
////	
////	 }
//	// @Test
//	// public void test3(){
//	// int sum = 0;
//	// for( int i =0; i <= 100 ; i++){
//	// // sum= sum+i;
//	// sum = i;
//	// System.out.println("i:"+i);
//	// }
//	// System.out.println(sum);
//	// }
//	// @Test
//	// public void test4(){
//	// int i = 0;
//	// int sum = 0;
//	// while(i<100){
//	// i++;
//	// sum=sum+i;
//	//
//	// }
//	// System.out.println(sum);
//
//	// @Test
//	// public void test5(){
//	// int year =2017;
//	// if((year % 4 == 0 && year % 100 != 0)||(year % 400 ==0)){
//	// System.out.println("shirunnim"+year);}
//	// else{ 这里else 千万不能忘记
//	// System.out.println("bushirunnim"+year);
//	// }
//	// @Test
//	// public void test6(){
//	// int[] array= new int[3];
//	// Scanner scanner = new Scanner(System.in);
//	// for(int i = 0;i < array.length; i++){
//	// System.out.println("请输入第"+(i+1)+"个学生信息");
//	// array [i]=scanner.nextInt();
//	// }
//	// int sum=0;
//	// for(int j=0 ; j<array.length; j++){
//	// sum= sum+ array[j];
//	// }
//	// int avg= sum/ array.length;
//	// System.out.println("pingjun"+avg);
//	// // }
//	// @Test
//	// public void test7(){
//	// int i=0;
//	// while(i<5){
//	// i++;
//	// System.out.println("HElleworld");
//	// }
//	//
//	// }
//	//
//	// @Test
//	// public void test8(){
//	// Scanner scanner =new Scanner(System.in);
//	// int score =scanner.nextInt();
//	// if( score<0 || score > 100){
//	// System.out.println("buhefachengji");
//	// return;
//	// }
//	// int type =score /10;
//	// switch(type){
//	// case 10:
//	// case 9 :
//	// System.out.println("youxiu");
//	// break;
//	// case 8:
//	// System.out.println("lianghao");
//	// break;
//	// case 7:
//	// System.out.println("yiban");
//	// break;
//	// case 6:
//	// System.out.println("jige ");
//	// break;
//	// case 5:
//	// System.out.println("bujige");
//	// break;
//	// default:
//	// System.out.println("bujige");
//	// break;
//	// }
//	//
//	// }
//	 @Test
//	 public void test9(){
//	 Scanner scanner =new Scanner(System.in);
//	 int[] array=new int[3];
//	 for (int i = 0; i < array.length; i++) {
//	 System.out.println("sad"+(i+1)+"");
//	 array[i]=scanner.nextInt();
//	 }
//	
//	
//	 int sum=0;
//	 for (int i = 0; i < array.length; i++) {
//	 sum=sum+array[i];
//	 }
//	
//	 int avg= sum/ array.length;
//	 System.out.println("asd"+avg);
//	 }
////	@Test
////	public void test10() {
////		Scanner scanner = new Scanner(System.in);
////		System.out.println("打印一个学生信息");
////		int num = scanner.nextInt();
////		Student[] students = new Student[num];
////		for (int i = 0; i < students.length; i++) {
////			Student student = new Student();
////			System.out.println("qing" + (i + 1) + "个同学姓名");
////			student.name = scanner.next();
////			System.out.println("请输入第" + (i + 1) + "个同学年龄");
////			student.age = scanner.nextInt();
////			System.out.println("请输入第" + (i + 1) + "个同学性别");
////			student.sex = scanner.next();
////			students[i] = student;
////		}
////		printStudentInfo(students);
////	}
////
////	private void printStudentInfo(Student[] students) {
////		for (int j = 0; j < students.length; j++) {
////			System.out.println("姓名" + students[j].name);
////			System.out.println("年龄" + students[j].age);
////			System.out.println("性别" + students[j].sex);
////
////		}
////	}
////	
////	@Test
////	public void test33 () {
////		int[] array= new int[3];
////		array[0]=3;
////		array[1]=4;
////		array[2]=5;
////		for (int i = 0; i < array.length; i++) {
////			System.out.println(array[i]);
////		}
////	}
////
////	@Test
////	public void test11() {
////		Scanner scanner = new Scanner(System.in);
////		int[] array = new int[2];
////		
////		Student[] students = new Student[2];
////		for (int i = 0; i < students.length; i++) {
////			Student stu = new Student();
////			System.out.println("请输入第" + (i + 1) + "个学生姓名");
////			stu.name = scanner.next();
////			System.out.println("请输入第" + (i + 1) + "个学生年龄");
////			stu.age = scanner.nextInt();
////			System.out.println("请输入第" + (i + 1) + "个学生性别");
////			stu.sex = scanner.next();
////			students[i] = stu;
////		}
////		
////		for (int i = 0; i < students.length; i++) {
////			System.out.println("姓名" + students[i].name);
////			System.out.println("年龄" + students[i].age);
////			System.out.println("性别" + students[i].sex);
////		}
////		
////		while (true) {
////
////			System.out.println("根据姓名查询-1");
////			System.out.println("s sdsada ");
////			System.out.println("ad adasd");
////			System.out.println("tuichu-0");
////
////			int type = scanner.nextInt();
////
////			if (type == 0) {
////				System.out.println("tuichu ");
////				break;
////
////			}
////
////			switch (type) {
////			case 1:
////				// /根据姓名查询
////				System.out.println("请输入你要查询的姓名");
////				String name = scanner.next();
////				boolean isSearchByNameFound = false;
////				for (int i = 0; i < students.length; i++) {
////					Student student = students[i];
////					if (name.equals(student.name)) {
////						System.out.println("姓名" + student.name);
////						System.out.println("年龄" + student.age);
////						System.out.println("性别" + student.sex);
////						isSearchByNameFound = true;
////					}
////
////				}
////				if (isSearchByNameFound == false) {
////					System.out.println("没有查询到该学生信息");
////				}
////				break;
////			default:
////				break;
////			}
////		}
////	}
////	
////	@Test
////	public void test44() {
////		Scanner scanner = new Scanner(System.in);
////		Student[] students= new Student[2];
////		 Student stu =new Student();
////		for (int i = 0; i < students.length; i++) {
////			System.out.println("请输入第"+(i+1)+"个学生姓名");
////			  stu.name=scanner.next();
////			  System.out.println("请输入第"+(i+1)+"个学生年龄");
////			  stu.age=scanner.nextInt();
////			  System.out.println("请输入第"+(i+1)+"个学生性别");
////			  stu.sex=scanner.next();
////			  
////		      students[i]=stu;
////		}
////		for (int i = 0; i < students.length; i++) {
////			System.out.println("姓名"+stu.name);
////			System.out.println("年龄"+stu.age);
////			System.out.println("性别"+stu.sex);	
////		}
////		while(true){
////			System.out.println("根据姓名查询-1");
////			System.out.println("根据姓名年龄-2");
////			System.out.println("根据姓名性别-3");
////			System.out.println("退出-0");
////		
////		 int type = scanner.nextInt();
////		 if(type ==0){
////			 System.out.println("退出");
////		     break;
////		 }
////		 switch(type){
////		 case 1:
////			 System.out.println("请输入要查询的姓名");
////			 String name = scanner.next();
////			 boolean isSearchByNameFound =false;
////			 for (int i = 0; i < students.length; i++) {
////				 Student student=students[i];
////				 if(name.equals(student.name)){
////					 System.out.println("姓名"+student.name);
////					 System.out.println("年龄"+student.age);
////					 System.out.println("性别"+student.sex);
////					 isSearchByNameFound = true;
////				 }
////					}
////			 if(isSearchByNameFound=false) {
////				 System.out.println("没有该学生");
////				
////			}
////			 break;
////		 default:
////			 break;
////		 }
////		}
////		}
////@Test
////public void test1(){
////	int a=5;
////	int b=3;
////	    System.out.println("a:"+a);
////	    System.out.println("b:"+b);
////	int temp = a;
////	a = b;
////	b = temp;
////	    System.out.println("after a:"+a);
////	    System.out.println("after b:"+b);
////}
//
////	@Test
////	public void test2(){
////		Scanner scanner =new Scanner(System.in);
////		int num = scanner.nextInt();
////		if(num < 0 && num > 100){
////			System.out.println("不合法成绩");
////			return;
////		}
////		else if( num >= 80){
////			System.out.println("优秀");
////		}
////		else if( num >= 70){
////			System.out.println("良好");
////		}
////		else if( num >= 60){
////			System.out.println("一般");
////		}
////		else if( num < 60){
////			System.out.println("不及格");
////		}
////	}
////	@Test
////	public void tes3(){
////		int sum =0;
////		for(int i = 0;i <= 100 ;i++){
//////			sum=sum+i;
////			sum+=i;
////			System.out.println("i:");
////		}
////		System.out.println(sum);
//////	}
////	@Test
////	public void test4(){
////		int sum =0;
////		int i =0;
////		while(i<100);
////		i++;
////		sum=sum+i;
////		
////		System.out.println(sum);
////	}
//
////@Test
////public void test5(){
////	int[]  array=new int[3];
////	 System.out.println("打印训生信息");
////	 Scanner scanner=new Scanner(System.in);
////	 for (int i = 0; i < array.length; i++) {
////		 System.out.println("请输入第"+(i+1)+"个学生信息");
////		array[i]=scanner.nextInt();
////	}
////	 int sum=0;
////	 for (int j = 0; j < array.length; j++) {
////		 sum=sum+array[j];
////	}
////   int avg = 0;
////	 avg=sum/array.length;
////	 System.out.println("平均成绩"+avg);
//
////
////@Test
////public void test6(){
////	Scanner scanner=new Scanner(System.in);
////	int score=scanner.nextInt();
////	if(score < 0 || score > 100){
////		System.out.println("不合法发成绩");
////		return;
////	}
////	int type=score/10;
////	switch(type){
////	case 9:
////		System.out.println("优秀");
////		break;
////	case 8:
////		System.out.println("良好");
////		break;
////	case 7:
////		System.out.println("yiban");
////		break;
////	case 6:
////		System.out.println("jige");
////		break;
////	case 5:
////		System.out.println("bujige");
////		break;
////		
//////		default:
//////			System.out.println("bujige");
////////			break;
////////	}
////////}
//////	@Test
//////	public void test7(){
//////		Scanner scanner =new Scanner(System.in);
//////		System.out.println("打印学生信息");
//////		int num=scanner.nextInt();
//////		Student[] stu=new Student[num];
//////		for (int i = 0; i < stu.length; i++) {
//////			Student student=new Student();
//////			System.out.println("输出第"+(i+1)+"个学生姓名");
//////			student.name=scanner.next();
//////			System.out.println("输出低"+(i+1)+"个学生年龄");
//////			student.age=scanner.nextInt();
//////			System.out.println("输出第"+(i+1)+"个学生性别");
//////			student.sex=scanner.next();
//////			stu[i]=student;
//////		}
//////		printStudentInfo(stu);
//////	}
//////	private void printStudentInfo(Student[] stu){
////////		{ 调用上面数组}
//////	for (int j = 0; j < stu.length; j++) {
//////		System.out.println("姓名"+stu[j].name);
//////		System.out.println("年龄"+stu[j].age);
//////		System.out.println("性别"+stu[j].sex);
//////	
//////	}	
//////		}
//////		
////		@Test
////		public void test3(){
////			Scanner scanner =new Scanner(System.in);
////		 Student[] students=new Student[2];
////		 for (int i = 0; i < students.length; i++) {
////			 Student student=new Student();
////			 System.out.println("输出第"+(i+1)+"个学生姓名");
////				student.name=scanner.next();
////				System.out.println("输出低"+(i+1)+"个学生年龄");
////				student.age=scanner.nextInt();
////				System.out.println("输出第"+(i+1)+"个学生性别");
////				student.sex=scanner.next();
////				students[i]=student;
////			}
////		 for (int i = 0; i < students.length; i++) {
////			 System.out.println("姓名"+students[i].name);
////				System.out.println("年龄"+students[i].age);
////				System.out.println("性别"+students[i].sex);
////			
////		}
////		 while(true){
////			
////			 System.out.println("根性姓名查询-1");
////			 System.out.println("根性姓名年龄-2");
////			 System.out.println("根性姓名性别-3");
////			 System.out.println("退出-0");
////			 
////			int type=scanner.nextInt();
////			
////				 if( type == 0){
////					 System.out.println("退出");
////					 break;
////				 }
////				 switch(type) {
////				 case 1:
////					 System.out.println("根据姓名查询");
////					 String name=scanner.next();
////					 boolean isByNameFound=false;
////					 for (int i = 0; i < students.length; i++) {
////						 Student student= students[i];
////						if(name.equals(student.name)){
////							System.out.println("姓名"+student.name);
////							System.out.println("年龄"+student.age);
////							System.out.println("性别"+student.sex);
////						 isByNameFound=true;
////						 
////			 }
////		}
////				if(isByNameFound=false){
////					System.out.println("没有该学生信息");
////			}
////				break;
////				default:
//					break;
//					
//			}
//			 
//	
//	@Test
//	public void test1(){
//	int count=0;
//	for (int i = 0; i < 100; i++) {
//		
//		if(i % 7 ==0){
//			i++;
//			count ++; 
////			count=count+1;
////			count+=1;
//	}
//		System.out.println(i);
//	}
//	System.out.println(count);
//			
//	}
	@Test
	public void test1(){
		int[] array = new int[5];
		array[0] = 25;      
		array[1] = 26;
		array[2] = 27;
		array[3] = 21;
		array[4] = 28;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
	}
		int max=0;
		int min=0;
		
		for (int i = 0; i < array.length; i++) {
			max=min=array[0];
			if(array[i]>max) max=array[i];
			if(array[i]<min) min=array[i];
		}
		int count1=0;
		int count2=0;
		for (int j = 0; j < array.length; j++) {
			if(array[j] % 2==0){
				count2++;
			}
			if(array[j] % 2==1){
				count1++;
		}
		
		}
		System.out.println("zonghe"+sum);
		System.out.println("最大"+max);
		System.out.println("zuixiao"+min);
		System.out.println("奇数个数"+count1);
		System.out.println("偶数个数"+count2);
	}
	@Test
	public void test16(){
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3};
		int[] count=new int[]{0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < score.length; i++) {
			if(score[i] == 0){
				count[0]++;
			}
			else if(score[i] == 1){
				count[1]++;
			}
			else if(score[i] == 2){
				count[2]++;
			}
			else if(score[i] == 3){
				count[3]++;
			}
			else if(score[i] == 4){
		        count[4]++;
			}
			else if(score[i] == 5){
				count[5]++;
			}
			else if(score[i] == 6){
				count[6]++;
			}
			else if(score[i] == 7){
				count[7]++;
			}
			else if(score[i] == 8){
				count[8]++;
			}
			else if(score[i] == 9){
				count[9]++;
			}
		
				
			
	}
		System.out.println("零的次数"+count[0]);
		System.out.println("1的次数"+count[1]);
		System.out.println("2的次数"+count[2]);
		System.out.println("3的次数"+count[3]);
		System.out.println("4的次数"+count[4]);
		System.out.println("5的次数"+count[5]);
		System.out.println("6的次数"+count[6]);
		System.out.println("7的次数"+count[7]);
		System.out.println("8的次数"+count[8]);
		System.out.println("9的次数"+count[9]);

}
	@Test
	public void test25(){
		
		int[] array=new int[]{10,9,8,7,6,5};
		System.out.println(sum(array));
		System.out.println("最大值"+getMax(array));
		System.out.println("最小值"+getMin(array));
		System.out.println("奇数个数"+oddNum(array));
		System.out.println("偶数个数"+evenNum(array));
		
		
	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;

	}

	public static int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int getMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static int oddNum(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count++;
			}
		}
		return count;
	}


	public static int evenNum(int[] array) {
		int count1 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count1++;
			}
		}
		return count1;

	}

	public void callNums() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
				0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3 };

		int num0 = 0;
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				num0 = num0 + 1;
				break;

			default:
				break;
			}
		}
		System.out.println("0的次数" + num0);
	}

	public void callNums2() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
				0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3 };
		int[] numCountArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				numCountArray[0] = numCountArray[0] + 1;
				break;

			default:
				break;
			}
		}
		for (int j = 0; j < numCountArray.length; j++) {

			System.out.println("0的次数" + numCountArray[0]);
		}
	}
	@Test
	public void test3() {

		int[] num = new int[] { 11, 12, 14, 13, 15 };
	}

	public static int sum1(int[] num) {
		int sum1 = 0;
		for (int i = 0; i < num.length; i++) {
			sum1 = sum1 + i;
		}

		return sum1;

	}
	
	public static int getMax1(int[] num) {
		int max12 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max12 < num[i]) {
				max12 = num[i];
			}
		}
		return max12;
	}

	public static int getMin1(int[] num) {
		int min12 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min12 < num[i]) {
				min12 = num[i];
			}
		}
		return min12;
	}


	public static void oddNum1(int[] num) {
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 1) {
				count++;
			} else
				count1++;
		}
		System.out.println("奇数个数"+count);
		System.out.println("偶数个数"+count1);
	}

	public static void calnums2() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1,
				0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3 };
		int[] numCountNum = new int[10];
		for (int i = 0; i < numCountNum.length; i++) {
			switch (score[i]) {
			case 0:
				numCountNum[i] += 1;
				break;
			case 1:
				numCountNum[i] += 1;
			case 2:
				numCountNum[i]+=1;
			case 3:
				numCountNum[i]+=1;
			case 4:
				numCountNum[i]+=1;
			case 5:
				numCountNum[i]+=1;
			case 6:
				numCountNum[i]+=1;
			case 7:
				numCountNum[i]+=1;
			case 8:
				numCountNum[i]+=1;
			case 9:
				numCountNum[i]+=1;
			default:
				break;
			}
		}
	}

	@Test
	public void test14(){
		Scanner scanner =new Scanner(System.in);
			Student[] students=new Student[2];
			for (int i = 0; i < students.length; i++) {
				Student student=new Student();
				System.out.println("请输入学生的姓名");
				student.name=scanner.next();
				System.out.println("请输入学生的年龄");
				student.age=scanner.nextInt();
				System.out.println("请输入学生的性别");
				student.sex=scanner.next();
				students[i]=student;
			}
			for (int i = 0; i < students.length; i++) {
				System.out.println("姓名"+students[i].name);
				System.out.println("年龄"+students[i].age);
				System.out.println("性别"+students[i].sex);
			}
			while(true){
				System.out.println("根据姓名查询-1");
				System.out.println("根据年龄查询-2");
				System.out.println("根据性别查询-3");
				System.out.println("退出-0");
				
				int type=scanner.nextInt();
				if(type==0){
					System.out.println("退出");
					break;
				}
			 switch(type){
			 case 1:
				 System.out.println("qingshufruxinxi");
//				 biewangle
				 String name=scanner.next();
				 boolean isSearchByNameFound=false;
				 for (int i = 0; i < students.length; i++) {
					Student student=students[i];
					if(name.equals(student.name)){
					 isSearchByNameFound=true;
					}
				}
				 if(isSearchByNameFound=false){
					 System.out.println("没有该学生信息");
				 }default:
					 break;
					 
			 }
			}
		
	}
	
	@Test
    public void test33 () {
	int[] array= new int[]{ 10, 5,7};
	for (int i = 0; i < array.length; i++) {
		
		System.out.println(array[i]);
	}
	}
	
	public void printArra(int[] array){
	 array= new int[]{ 10, 5,7};
		System.out.println("[");
		for (int i = 0; i < array.length; i++) {
			if(i!=array[i]-1){
				System.out.println(",");
			}else
				System.out.println(i);
		}
		
		System.out.println("]");
	}

	@Test
	public static void test21() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
		}
		System.out.println("*");
	}
	
	@Test
	public void test31() {
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
		
		
	}
	
}

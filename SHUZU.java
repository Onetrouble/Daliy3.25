package com.situ;

import java.beans.Statement;
import java.util.Scanner;

import org.junit.Test;

public class SHUZU {
@Test
public void test1(){
	int[]     array = new int[3];
	array[0] = 100;
	array[1]=  98;
	array[2]=  76;
	int a = 3;

	
//	array.length
	System.out.println(array.length);
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
}

@Test
public void test2(){
	int[]  array = new int[3];
	array[0] = 100;
	array[1] =  90;
	array[2] =  10;
	
	Scanner scanner = new Scanner(System.in);
	for(int i = 0; i< array.length; i++){
	System.out.println("请输入第"+(i+1)+"个学生的成绩："); 
	array[i] = scanner.nextInt();
		
		
	int sum = 0;
	for (int j = 0; j < array.length; j++) {
	sum = sum + array[j];
	}
	int avg = sum / array.length;
	System.out.println("平均值是"+avg);
	}
}
@Test
public void test3(){
	int[]  array=new int[3];
	array[0]=100;
	array[1]=90;
	array[2]=80;
	Scanner scanner = new Scanner(System.in);
	for(int i= 0; i< array.length;i++){
		System.out.println("请输第"+(i+1)+"个学生成绩");
		array[i]=scanner.nextInt();
	}
	
	int sum =0;
	for(int j = 0; j<array.length; j++){
		sum = sum +  array[j];
	}		
	int avg = sum / array.length;
	System.out.println("平均值"+avg);
}@Test
public void test4(){
	int[]  array=new int[3];
	   array[0]=100;
	   array[1]=90;
	   array[2]=80;
	 Scanner scanner = new Scanner(System.in);
	for(int i = 0;i < array.length;i++){
	 System.out.println("请输入第"+(i+1)+"个学生成绩");
	 array[i]=scanner.nextInt();
	}
	int sum = 0;
	for(int j =0 ; j< array.length;j++){
		sum =sum+ array[j];
	}
    int avg = sum /array.length;{
    	System.out.println("平均值是"+avg);
    }
}@Test
public void test5(){
	int[]  array=new int[3];
    array[0]=100;
    array[1]=90;
    array[2]=80;
    Scanner scanner =new Scanner(System.in);
    for(int i =0; i< array.length;i++){
    	System.out.println("请输入第"+(i+1)+"个学生成绩");
    	array[i]=scanner.nextInt();
    	}
    int sum =0;
    for(int j = 0; j<array.length;j++){
    	sum=sum+array[j];
    }
    int avg =sum / array.length;
    System.out.println("平均成绩"+avg);
}@Test
public void test6(){
	int []  array=new int[3];
//	array[0]=100;
//	array[1]=90;
//	array[2]=80;
//			
	Scanner scanner =new Scanner(System.in);
	for(int i = 0; i<array.length;i++){
	System.out.println("请输入第"+(i+1)+"个学生成绩");
	array[i]=scanner.nextInt();
}    
	int sum = 0;
	for (int j = 0; j<array.length; j++){
		sum= sum+array[j];
	}
	int avg=sum / array.length;{
	System.out.println("平均成绩"+avg);
	}
}
}
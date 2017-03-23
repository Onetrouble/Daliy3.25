package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class HelloWorld {
	public static void main(String[] args) {
		
	}
	
	@Test
	public void test1() {
		// System.out.println("Hello World");
		int i = 0;
		while (i < 5) {
			System.out.println("Hello World");
			i++;

		}
	}
	@Test
	 public void test2(){
		int i =0;
		int sum =0;
		while(i < 100){
			i++;
//			sum=sum+i
			sum+=i;
			
//			System.out.println(i);
		}
			System.out.println(sum);	
	}@Test
	public void test3(){
		int i = 0;
		while(i < 5){
		System.out.println("Hello World");
		i++;
		}
	}
	@Test
	public void test4(){
		int i = 0;
		while(i < 5){
			System.out.println("Hello World");
			i++;
		}
	}@Test
	public void test5(){
		int i=0;
		int sum = 0;
		while(i < 100 ){
			i++;
//			sum =sum+i;
			sum+=i;
//            System.out.println(i);			
		}   System.out.println(sum);
		
	}
	
	}
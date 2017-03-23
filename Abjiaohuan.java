package com.situ;

import org.junit.Test;

public class Abjiaohuan {

	@Test
	public void test1() {
		int a = 5;
		int b = 3;
		System.out.println("a:");
		System.out.println("b:");
		int temp = a;
		a = b;
		b = temp;
		{
			System.out.println(after:);
		}
	}

	@Test
	public void test2() {
		int a = 5;
		int b = 3;
		{
			System.out.println("a:" + a);
			System.out.println("b:" + b);
		}
		int temp = a;
		a = b;
		b = temp;
		{
			System.out.println("after a:" + a);
			System.out.println("after b:" + b);
		}

	}
}
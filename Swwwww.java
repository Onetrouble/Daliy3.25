package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class Swwwww {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("65");
			int x = sc.nextInt();
			int  y=x/10;
			if(x < 0 || x > 100){
				System.out.println("不合法的成绩");
				return;
			}
			switch (y) {
			case 9:
				System.out.println("成绩优秀");
				break;
			case 8:
			    System.out.println("成绩良好");
				break;
			case 7:
				System.out.println("成绩一般");
				break;
			case 6:
				System.out.println("成绩及格");

			default:
				System.out.println("不及格");
				break;
			}
			
		}
		@Test
		public void test1(){
		Scanner scanner = new Scanner(System.in);
		int score =scanner.nextInt();
		if(score<0  || score > 100){
			System.out.println("非法输入");
			return;
		}
	    int type = score /  10;
	    switch (type) {
	    case 10:
	    case  9:
	    	System.out.println("优秀");
	   break;
	    case  8:
	   System.out.println("良好");
	   break;
	    case  7:
	   System.out.println("一般");
	   break;
	    case  6:
	    	System.out.println("及格");
	   break; 	
	    
	    case  5:
	    	System.out.println("不及格");
		break;
    default:
    	System.out.println("default");
    
        break;
	}
}
@Test
public void text1(){
	Scanner scanner =new Scanner(System.in);
	int score =scanner.nextInt();
	if(score < 0  || score > 100){
		System.out.println("不合法成绩");
		return;
	}
    int type = score / 10;
    switch (type){
    case 10:
    case 9:
    	System.out.println("优秀");
    	break;
	case 8:
		System.out.println("良好");
		break;
	case 7:
		System.out.println("一般");
		break;
	case 6:
		System.out.println("及格");
		break;
	case 5:
		System.out.println("不及格");
		break;
	default:
		System.out.println("default");
		break;
    } 
    }
	@Test
	public void test2(){
		Scanner scanner =new Scanner(System.in);
		int score =scanner.nextInt();
		if(score < 0 || score > 100){
			System.out.println("不合法成绩");
			return;
		}
		int type =score / 10;
		switch(type){
		case 10:
		case  9:
			System.out.println("优秀");
			break;
		case  8:
			System.out.println("良好");
			break;
		case  7:
			System.out.println("一般");
			break;
		case  6:
			System.out.println("及格");
			break;
		case  5:
			System.out.println("不及格");
			break;
		default:
			System.out.println("不及格");
			break;
	}
}
}	
     	
	



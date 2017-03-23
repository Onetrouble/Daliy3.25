package com.situ;

import java.util.Scanner;

import org.junit.Test;


public class chengjiti {
   public void test1(){
	   System.out.println();
	   Scanner scanner = new Scanner(System.in);
	   int num = scanner.nextInt();
	   if(num < 0 && num > 100 ){
		   System.out.println("不合法成绩");
		   return;
	   }
		   
	   
	   if (num >= 90){
		   System.out.println("优秀");
	   }else if ( num >= 80 && num < 90){
		   System.out.println("良好");
	   }
		 
   }public void test2(){
	   Scanner scanner = new Scanner(System.in);{
		   int num = scanner.nextInt();
		      if(num < 0 || num > 100){
			  System.out.println("buhefa");
			  return;
	     }      
			  else if(num >= 90){
				  System.out.println("youxiu");
		 }   
			  else if (num >= 80 &&  num < 90){
				  System.out.println("lianghao");
		 }
			  else if(num  >= 70 && num < 80){
				  System.out.println("yiban");
		 }
			  else if(num >= 60 && num < 70){
				  System.out.println("jige");
			  }
			  else if (num < 60 ){
				  System.out.println("buhege");
			  }
   }
  }		
   public void test3(){
	   Scanner scanner =new Scanner(System.in);{
		int num = scanner.nextInt();
		if(num < 0 && num > 100){
			System.out.println("buhege");
				return;
		}
			 else if(num >= 90){
				  System.out.println("youxiu");
		 }   
			  else if (num >= 80 &&  num < 90){
				  System.out.println("lianghao");
		 }
			  else if(num  >= 70 && num < 80){
				  System.out.println("yiban");
		 }
			  else if(num >= 60 && num < 70){
				  System.out.println("jige");
			  }
			  else if (num < 60 ){
				  System.out.println("buhege");
			  }
  }
 		
		
			
			
			
		}public void test4(){
             Scanner scanner = new Scanner(System.in);
             int num = scanner.nextInt();
			}
		@Test
		public void test5(){
		Scanner scanner=new Scanner(System.in);
		int num = scanner.nextInt();
		if(num < 0 && num > 100 ){
			System.out.println("buhefachengjhu");
			return;
		}
		else if(num >= 80 && num < 90){
			System.out.println("yo");
		}
		else if(num < 60 ){
			System.out.println("bujige");
		}
		}
		@Test
		public void test6(){
			Scanner scanner = new Scanner(System.in);
			int num =scanner.nextInt();
		  if(num < 0 && num > 100){
			  System.out.println("不合法成绩");
			  return;
		} else if (num >= 90){
			System.out.println("优秀");
		} else if (num >= 80){
			System.out.println("良好");
		} else if (num >= 70){
			System.out.println("一般");
		} else if (num >= 60){
			System.out.println("及格");
		} else if (num < 60){
			System.out.println("不及格");
		}
		}
		}
		   
	   
	



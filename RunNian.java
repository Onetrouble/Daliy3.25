package com.situ;

import org.junit.Test;

public class RunNian {
	 @Test
     public void test1(){
    	 int year =2017;
    	 if( (year%4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
    		 System.out.println(year+"shshirunnian");
    		 System.out.println(year+"bushishirunnian");
    		 
    	 }
    			 
     }
	 
	 public void test2(){
    	 int year=2017;
    	 if ((year % 4== 0 && year % 100 != 0)||(year%400==0));
    	 System.out.println(year+"shi");
    	 System.out.println(year+"bushishi");
     }
	 
     public void test3(){
    	 int year=2017;
    	 if((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0)){
    		 System.out.println(year+"shi");
    		 System.out.println(year+"bushi");
    	 }
     }
     
     public void test4(){
    	 int year = 2017;
    	 if ((year % 4 == 0 && year % 100 != 0)||(year % 100 == 0)){
    		 System.out.println(year+"shirunnian");
    		 System.out.println(year+"bushirunnian");
    		 
    		 
    	 }
     }
     
     @Test
     public void test5(){
    	 int year=2017;
    	 if((year % 4==0  &&  year % 100 != 0)||(year % 100 == 0)){
    		 System.out.println("shirunnian"+year);
    	 } else {
    		 System.out.println("bushirunnian"+year);
    	 }
     }
     @Test
     public void test6(){
    	 int year =2017;
    	 if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
    		 System.out.println(year+"是闰年");
     }   else 
    	     System.out.println(year+"不是闰年");
     }
	
}    
    			 
    



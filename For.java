package com.situ;

import org.junit.Test;

public class For {
  @Test
   public void test1(){
	  for(int i = 0; i <5; i++){
		  System.out.println("Hello World");
	  }
  }
  @Test
  public void test2(){
	  int sum = 0;
	  for(int i=0;  i<=100; i++){
		  sum+=i;
      System.out.println("i:"+i);
	
	  }
	  System.out.println(sum);
  }
  @Test
  public void test3(){
	  int sum=0;
	  for(int i = 0 ; i <= 100 ; i++){
		sum=sum+i;
		System.out.println(sum);
	  }
		  
}@Test
public void test4(){
	int i = 0;
	int sum = 0;
	while(i<100){
	i++;
//	sum=sum+i;
	sum+=i;
	System.out.println(i);
	}
	System.out.println(sum);
}@Test
public void test5(){
	int sum =0 ;
	for(int i = 0; i<= 100 ; i++){
		sum=sum+ i;
		System.out.println("i："+i);
	}System.err.println(sum);
}
@Test
public void test6(){
	int sum=0;
	for(int i = 0; i <= 100 ;i++){
//		sum=sum+ i;
		sum+=i;
		System.out.println("i:"+i);
	}   System.out.println(sum);
}
@Test
public void test7(){
	int sum = 0;
	for( int i = 0; i <= 100; i++){
//		sum=sum+i;
		sum+=i;
		System.out.println("i:"+i);
	}   System.out.println(sum);
}    

}



package com.situ;

import java.util.Scanner;

import org.junit.Test;

public class MethodTesst {
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);

		Student stu = new Student();
		stu.name = scanner.next();
		System.out.println("請輸入學生姓名：");
		stu.age = scanner.nextInt();
		System.out.println("請輸入你的年齡：");
		stu.sex = scanner.next();
		System.out.println("請輸入你的性別：");

		stu.sex = scanner.next();

		System.out.println("姓名 " + stu.name);
		System.out.println("年齡" + stu.age);
		System.out.println("性別" + stu.sex);
	}

	@Test
	public void test2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int num = scanner.nextInt();
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			System.out.println("请输入第" + (i + 1) + "同学的姓名");
			student.name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "同学的年龄");
			student.age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "同学的性别");
			student.sex = scanner.next();

			students[i] = student;
		}

		printStudentInfo1(students);
	}

	@Test
	public void test3() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int num = scanner.nextInt();
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			System.out.println("请输入第" + (i + 1) + "同学的姓名");
			student.name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "同学的年龄");
			student.age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "同学的性别");
			student.sex = scanner.next();

			students[i] = student;
		}

		printStudentInfo(students);
	}

	private void printStudentInfo1(Student[] students) {
		for (int j = 0; j < students.length; j++) {
			System.out.println("姓名" + students[j].name);
			System.out.println("年纪" + students[j].age);
			System.out.println("性别" + students[j].sex);
		}
	}

	@Test
	public void test4() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int num = scanner.nextInt();
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			System.out.println("请输入第" + (i + 1) + "同学的姓名");
			student.name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "同学的年龄");
			student.age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "同学的性别");
			student.sex = scanner.next();

			students[i] = student;
		}

		for (int j = 0; j < students.length; j++) {
			System.out.println("姓名" + students[j].name);
			System.out.println("年纪" + students[j].age);
			System.out.println("性别" + students[j].sex);
		}
	}

	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Student[] students = new Student[num];

		for (int i = 0; i < students.length; i++) {
			
               Student student =new Student();
			System.out.println("请输入第" + (i + 1) + "个同学姓名");
			student.name = scanner.next();
			System.out.println("请输入第" + (i + 1) + "个同学年龄");
			student.age = scanner.nextInt();
			System.out.println("请输入第" + (i + 1) + "个同学性别");
			student.sex = scanner.next();

			students[i] = student;
		}
		
		printStudentInfo(students);
	}

	private void printStudentInfo(Student[] students) {
		for (int j = 0; j < students.length; j++) {
			System.out.println("姓名" + students[j].name);
			System.out.println("年龄" + students[j].age);
			System.out.println("性别" + students[j].sex);
		}
	}
	@Test
	public void test6(){
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入学生个数");
		int num = scanner.nextInt();
		Student[] students= new Student[num];
		for(int i = 0; i < students.length; i++){
			Student student =new Student();
			
			System.out.println("请输入第"+(i+1)+"个学生姓名");
	        student.name = scanner.next(); 
	        System.out.println("请输入第"+(i+1)+"个学生的年龄");
	        student.age= scanner.nextInt();
	        System.out.println("请输入第"+(i+1)+"个学生的性别");
	        student.sex=scanner.next();
	        students[i]=student;
		}
		printStudentInfo(students);
		    
	}
	
	private void  printStudentInfo2(Student[] students){
		 for (int j = 0; j < students.length; j++){
			 System.out.println(""+students[j].name);
			 System.out.println(""+students[j].age);
			 System.out.println(""+students[j].sex);
		 }
	}
	@Test
	public void test8(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出学生的个数");
		int num = scanner.nextInt();
		Student [] students=new Student[num];
		for(int i = 0 ; i < students.length; i ++){
			Student student = new Student();
			System.out.println("请输入第"+(i+1)+"个学生姓名");
			student.name=scanner.next();
			System.out.println("s"+(i+1)+"s");
			student.age=scanner.nextInt();
			System.out.println("s"+(i+1)+"d");
			student.sex=scanner.next();
		}
		printStudentInfo(students);
	}
	private void printStudentInfo3(Student[] students){
		for(int j = 0; j < students.length; j++){
			System.out.println("姓名"+students[j].name);
			System.out.println("年龄"+students[j].age);
			System.out.println("性别"+students[j].sex);
		}
	}
	@Test
	public void test9(){
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("请输出学生个数");
		int num = scanner.nextInt();
		  Student[] students= new Student[num];
		for(int i = 0; i < students.length; i++){
	      Student student = new Student();
	      System.out.println("请输出第"+(i+1)+"个同学的姓名");
	      student.name=scanner.next();
	      System.out.println("请输出第"+(i+1)+"个同学的年龄");
	      student.age=scanner.nextInt();
	      System.out.println("请输出第"+(i+1)+"个铜须的性别");
	      student.sex=scanner.next();
	      
		}
		printStudentInfo(students);
	}
	private void printStudentInfo5(Student[] students) {
	
	for( int j =0; j < students.length;j++){
		System.out.println("姓名"+students[j].name);
		System.out.println("年龄"+students[j].age);
		System.out.println("性别"+students[j].sex);
	}
		
	}
	@Test
	public void test10(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输出学生个数");
		int num = scanner.nextInt();
		Student[] students= new Student[num];
		
	    for(int i= 0;i < students.length;i++){
	    	
			Student student = new Student();
		
			System.out.println("请输入第"+(i+1)+"个学生姓名");
			student.name=scanner.next();
			System.out.println("请输入第"+(i+1)+"个学生年龄");
			student.age=scanner.nextInt();
			System.out.println("请输入第"+(i+1)+"个学生性别");
			student.sex=scanner.next();
			students[i]=student;
		}
		printStudentInfo(students);
	}

	public void printStudentInfo26(Student[] students){
		for(int j = 0; j < students.length; j++){
			System.out.println("姓名"+students[j].name);
			System.out.println("年龄"+students[j].age);
			System.out.println("性别"+students[j].sex);
		}
		
	}
	
	}
	

	  
  
  
  
  
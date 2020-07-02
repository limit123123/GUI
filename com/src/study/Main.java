package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Comput jisuan=new Comput(); 
		Scanner in=new Scanner(System.in);
		System.out.print("请输入您的学号:");
	    int id = in.nextInt(); 
	    in.nextLine();
		System.out.print("请输入您的姓名:");
		String name = in.nextLine(); 
		System.out.print("请输入您的英语成绩:");
		 int a= in.nextInt(); 
		System.out.print("请输入您的高数成绩:");
		 int b= in.nextInt(); 
		System.out.print("请输入您的C语言成绩:");
		 int c= in.nextInt(); 
		System.out.print("请输入您的Java程序设计成绩:");
		 int d= in.nextInt(); 
		jisuan.getaveragegrade(a, b, c, d); //用对象调用方法，输出到控制台
		jisuan.save(id, name, a, b, c, d);
	}

}

package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Comput jisuan=new Comput(); 
		Scanner in=new Scanner(System.in);
		System.out.print("����������ѧ��:");
	    int id = in.nextInt(); 
	    in.nextLine();
		System.out.print("��������������:");
		String name = in.nextLine(); 
		System.out.print("����������Ӣ��ɼ�:");
		 int a= in.nextInt(); 
		System.out.print("���������ĸ����ɼ�:");
		 int b= in.nextInt(); 
		System.out.print("����������C���Գɼ�:");
		 int c= in.nextInt(); 
		System.out.print("����������Java������Ƴɼ�:");
		 int d= in.nextInt(); 
		jisuan.getaveragegrade(a, b, c, d); //�ö�����÷��������������̨
		jisuan.save(id, name, a, b, c, d);
	}

}

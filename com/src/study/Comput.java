package study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Comput implements UserInterface {

	public void save(int id,String name,int a,int b, int c,int d) {
		 File file = new File("F:\\10299\\Hello.txt");   // 创建文件
	        try {
				file.createNewFile();
				 // creates a FileWriter Object
				FileWriter writer = new FileWriter(file);
				 // 向文件写入内容
				 writer.write("学号：");
				 writer.write(String.valueOf(id));
		        writer.write("  姓名：");
		        writer.write(name);
		        writer.write("  英语成绩：");
		        writer.write(String.valueOf(a));
		        writer.write("  高数成绩：");
		        writer.write(String.valueOf(b));
		        writer.write("  c语言成绩：");
		        writer.write(String.valueOf(c));
		        writer.write("  Java程序设计：");
		        writer.write(String.valueOf(d));
		
		        writer.flush();
		        writer.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}   
	}
	public void getaveragegrade(int a,int b, int c,int d) {
		int avg;
		avg=(a+b+c+d)/4;
		System.out.println("您的平均成绩是"+avg);
	}

}

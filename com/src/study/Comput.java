package study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Comput implements UserInterface {

	public void save(int id,String name,int a,int b, int c,int d) {
		 File file = new File("F:\\10299\\Hello.txt");   // �����ļ�
	        try {
				file.createNewFile();
				 // creates a FileWriter Object
				FileWriter writer = new FileWriter(file);
				 // ���ļ�д������
				 writer.write("ѧ�ţ�");
				 writer.write(String.valueOf(id));
		        writer.write("  ������");
		        writer.write(name);
		        writer.write("  Ӣ��ɼ���");
		        writer.write(String.valueOf(a));
		        writer.write("  �����ɼ���");
		        writer.write(String.valueOf(b));
		        writer.write("  c���Գɼ���");
		        writer.write(String.valueOf(c));
		        writer.write("  Java������ƣ�");
		        writer.write(String.valueOf(d));
		
		        writer.flush();
		        writer.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}   
	}
	public void getaveragegrade(int a,int b, int c,int d) {
		int avg;
		avg=(a+b+c+d)/4;
		System.out.println("����ƽ���ɼ���"+avg);
	}

}

package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window extends JFrame implements ActionListener{
	Comput jisuan;
	JTextField texta,textb,textc,textd,textid,textname;
	JTextArea showAvg;
	JButton controlButton;
	Window(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("F:\\10299\\成绩.png").getImage());   
	}
	void init() {
		jisuan=new Comput();
		texta=new JTextField(5);
		textb=new JTextField(5);
		textc=new JTextField(5);
		textd=new JTextField(5);
		textid=new JTextField(10);
		textname=new JTextField(5);
		showAvg=new JTextArea();
		controlButton=new JButton("计算平均成绩");
		JPanel x=new JPanel();
		x.add(new JLabel("学号"));
		x.add(textid);
		x.add(new JLabel("姓名"));
		x.add(textname);
		x.add(new JLabel("英语成绩:"));
		x.add(texta);
		x.add(new JLabel("高数成绩:"));
		x.add(textb);
		x.add(new JLabel("c语言成绩:"));
		x.add(textc);
		x.add(new JLabel("Java程序设计:"));
		x.add(textd);
		x.add(controlButton);
		controlButton.addActionListener(this);
		add(x,BorderLayout.NORTH);
		add(new JScrollPane(showAvg),BorderLayout.CENTER);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	try {
		int a=Integer.parseInt(texta.getText().trim());
		int b=Integer.parseInt(textb.getText().trim());
		int c=Integer.parseInt(textc.getText().trim());
		int d=Integer.parseInt(textd.getText().trim());
		int id=Integer.parseInt(textid.getText().trim());
		String name=String.valueOf(textname.getText().trim());
		showAvg.append("您的平均成绩为"+jisuan.getaveragegrade(a, b, c, d));
		jisuan.save(id, name, a, b, c, d);

	} catch (Exception e) {
	showAvg.append("\n"+e+"\n");
	}	
	}

}

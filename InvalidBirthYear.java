/*
 * Design a following Registration form and raise an appropriate exception if invalid 
 * information is entered like Birth Year ‘0000’
 */

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class InvalidBirthYearException extends Exception
{
	public String toString()
	{
		return "Invalid Birth Year:";
	}
}
public class slip6_1 extends JFrame implements ActionListener
{
	JLabel cowin;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	JButton b1,b2,b3,b4,b5;
	slip6_1()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		cowin=new JLabel("COWIN REGISTRATION");
		cowin.setBounds(200,20,200,30);
		add(cowin);
		l1=new JLabel("Adhar Card:");
		l1.setBounds(100, 60, 130, 30);
		add(l1);
		t1=new JTextField(20);
		t1.setBounds(180,60,130,30);
		add(t1);
		l2=new JLabel("Birth Year:");
		l2.setBounds(100,100,100,30);
		add(l2);
		t2=new JTextField(20);
		t2.setBounds(180,100,130,30);
		add(t2);
		l3=new JLabel("Mobile No:");
		l3.setBounds(100,140,100,30);
		add(l3);
		t3=new JTextField(20);
		t3.setBounds(180,140,130,30);
		add(t3);
		l4=new JLabel("Age Group:");
		l4.setBounds(100,180,100,30);
		add(l4);
		r1=new JRadioButton("18 & Above",false);
		r1.setBounds(180,184,100,30);
		add(r1);
		r2=new JRadioButton("45 & Above",false);
		r2.setBounds(300,184,100,30);
		add(r2);
		l4=new JLabel("Selct Hospital:");
		l4.setBounds(100,220,100,30);
		add(l4);
		t4=new JTextField(20);
		t4.setBounds(190,220,100,30);
		add(t4);
		l5=new JLabel("Vaccine:");
		l5.setBounds(100,260,100,30);
		add(l5);
		r3=new JRadioButton("Covishield",false);
		r3.setBounds(180,260,100,30);
		add(r3);
		r4=new JRadioButton("Covaxin",false);
		r4.setBounds(280,260,100,30);
		add(r4);
		r5=new JRadioButton("Sputnik V",false);
		r5.setBounds(380,265,100,20);
		add(r5);
		l6=new JLabel("Time Slot:");
		l6.setBounds(100,300,100,30);
		add(l6);
		r6=new JRadioButton("Morning",false);
		r6.setBounds(180,300,100,30);
		add(r6);
		r7=new JRadioButton("Afternoon",false);
		r7.setBounds(280,300,100,30);
		add(r7);
		r8=new JRadioButton("Evening",false);
		r8.setBounds(380,300,100,30);
		add(r8);
		b1=new JButton("ADD");
		b1.setBounds(100,360,100,30);
		add(b1);
		b2=new JButton("UPDATE");
		b2.setBounds(220,360,100,30);
		add(b2);
		b3=new JButton("DELETE");
		b3.setBounds(340,360,100,30);
		add(b3);
		b4=new JButton("VIEW");
		b4.setBounds(460,360,100,30);
		add(b4);
		b5=new JButton("SEARCH");
		b5.setBounds(580,360,100,30);
		add(b5);
		b1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		try
		{
			String s1="0000";
			String s=t2.getText();
			if((s.equals(s1)))
			{
				throw new InvalidBirthYearException();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Birth Year="+s);
			}
		}catch(Exception e)
		{
			JOptionPane.showConfirmDialog(this,"error="+e);
		}
	}
}
	public static void main(String[] args) 
	{
		new slip6_1();
	}
}
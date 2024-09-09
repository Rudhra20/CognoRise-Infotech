package Calci;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculatorApp implements ActionListener {
	
	double num1=0,num2=0,num3=0;
	Scanner sc=new Scanner(System.in);
	int calculation;
	
	JFrame frame=new JFrame("Calculator");
	JLabel label=new JLabel();
	JTextField textField=new JTextField();
	JRadioButton on=new JRadioButton("on");
	JRadioButton off=new JRadioButton("off");
	JButton zero=new JButton("0");
	JButton one=new JButton("1");
	JButton two=new JButton("2");
	JButton three=new JButton("3");
	JButton four=new JButton("4");
	JButton five=new JButton("5");
	JButton six=new JButton("6");
	JButton seven=new JButton("7");
	JButton eight=new JButton("8");
	JButton nine=new JButton("9");
	JButton dot=new JButton(".");
	JButton delete=new JButton("Del");
	JButton equal=new JButton("=");
	JButton clear=new JButton("C");
	JButton mul=new JButton("X");
	JButton add=new JButton("+");
	JButton sub=new JButton("-");
	JButton div=new JButton("/");
	JButton rec=new JButton("1/x");
	JButton sqrt=new JButton("\u221A");
	JButton sq=new JButton("x\u00B2");
	
	
	calculatorApp(){
		prepareGui();
		addComponents();
		addActionEvent();
		
	}
	
	public void prepareGui() {
		frame.setSize(305, 510);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void addComponents() {
		label.setBounds(250, 0, 50, 50);
		label.setForeground(Color.white);
		frame.add(label);
		
		textField.setBounds(10, 40, 270, 40);
		textField.setFont(new Font("Arial",Font.BOLD,20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);
		
		on.setBounds(10,95,60,40);
		on.setSelected(true);
		on.setFont(new Font("Arial",Font.BOLD,14));
		on.setBackground(Color.black);
		on.setForeground(Color.white);
		on.setFocusable(false);
		frame.add(on);
		
		off.setBounds(10,125,60,40);
		off.setSelected(false);
		off.setFont(new Font("Arial",Font.BOLD,14));
		off.setBackground(Color.black);
		off.setForeground(Color.white);
		off.setFocusable(false);
		frame.add(off);
		
		ButtonGroup btngp=new ButtonGroup();
		btngp.add(on);
		btngp.add(off);
		
		seven.setBounds(10, 230, 60, 40);
		seven.setFont(new Font("Arial",Font.BOLD,14));
		frame.add(seven);
		eight.setBounds(80, 230, 60, 40);
		eight.setFont(new Font("Arial",Font.BOLD,14));
		frame.add(eight);
		nine.setBounds(150, 230, 60, 40);
		nine.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(nine);
	    
	    four.setBounds(10, 290, 60, 40);
		four.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(four);
	    five.setBounds(80, 290, 60, 40);
		five.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(five);
	    six.setBounds(150, 290, 60, 40);
		six.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(six);
	    
	    one.setBounds(10, 350, 60, 40);
		one.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(one);
	    two.setBounds(80, 350, 60, 40);
		two.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(two);
	    three.setBounds(150, 350, 60, 40);
		three.setFont(new Font("Arial",Font.BOLD,14));
	    frame.add(three);
	    
	    dot.setBounds(150, 410, 60, 40);
		dot.setFont(new Font("Arial",Font.BOLD,20));
	    frame.add(dot);
	    zero.setBounds(10, 410,130, 40);
		zero.setFont(new Font("Arial",Font.BOLD,20));
	    frame.add(zero);
	    
	    equal.setBounds(220, 350, 60, 100);
		equal.setFont(new Font("Arial",Font.BOLD,20));
		equal.setBackground(new Color(239,188,2));
	    frame.add(equal);
	    
	    div.setBounds(220, 110, 60, 40);
	  	div.setFont(new Font("Arial",Font.BOLD,20));
	  	div.setBackground(new Color(239,188,2));
	  	frame.add(div);
	  	
	    sqrt.setBounds(10, 170,60, 40);
	  	sqrt.setFont(new Font("Arial",Font.BOLD,20));
	  	frame.add(sqrt);
	  	
	    mul.setBounds(220, 230, 60, 40);
	  	mul.setFont(new Font("Arial",Font.BOLD,20));
	  	mul.setBackground(new Color(239,188,2));
	  	frame.add(mul);
	  	sub.setBounds(220, 170, 60, 40);
	  	sub.setFont(new Font("Arial",Font.BOLD,20));
	  	sub.setBackground(new Color(239,188,2));
	  	frame.add(sub);
	  	add.setBounds(220, 290, 60, 40);
	  	add.setFont(new Font("Arial",Font.BOLD,20));
	  	add.setBackground(new Color(239,188,2));
	  	frame.add(add);
	  	
	 	sq.setBounds(80, 170, 60, 40);
	  	sq.setFont(new Font("Arial",Font.BOLD,20));
	    frame.add(sq);
	    rec.setBounds(150, 170, 60, 40);
	  	rec.setFont(new Font("Arial",Font.BOLD,15));
	    frame.add(rec);
	    delete.setBounds(150, 110, 60, 40);
	  	delete.setFont(new Font("Arial",Font.BOLD,12));
	  	delete.setBackground(Color.red);
	  	delete.setForeground(Color.white);
	    frame.add(delete);
	    clear.setBounds(80, 110, 60, 40);
	  	clear.setFont(new Font("Arial",Font.BOLD,12));
	  	clear.setBackground(Color.pink);
	  	clear.setForeground(Color.white);
	    frame.add(clear);
	    
	    }
	public void addActionEvent() {
		on.addActionListener(this);
		off.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		delete.addActionListener(this);
		clear.addActionListener(this);
		equal.addActionListener(this);
		sqrt.addActionListener(this);
		rec.addActionListener(this);
		zero.addActionListener(this);
		sq.addActionListener(this);
		dot.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		calculatorApp calculator=new calculatorApp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==on) {
			enable();
			
		}
		else if(source==off) {
			disable();
			
		}
		else if(source==clear)
		{
			label.setText("");
			textField.setText("");
		}
		else if(source==delete) {
			int length=textField.getText().length();
			int number=length-1;
			if(length>0) {
				StringBuilder back= new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				textField.setText(back.toString());
				
				
			}
			if(textField.getText().endsWith(""));
			label.setText("");
			
		}
		else if(source==zero) {
			if(textField.getText().equals("0")) {
				return;
			}else {
				textField.setText(textField.getText()+"0");
				
			}
			
		}
		else if(source==one) {
			textField.setText(textField.getText()+"1");
		}
		else if(source==two) {
			textField.setText(textField.getText()+"2");
		}
		else if(source==three) {
			textField.setText(textField.getText()+"3");
		}
		else if(source==four) {
			textField.setText(textField.getText()+"4");
		}
		else if(source==five) {
			textField.setText(textField.getText()+"5");
		}
		else if(source==six) {
			textField.setText(textField.getText()+"6");
		}
		else if(source==seven) {
			textField.setText(textField.getText()+"7");
		}
		else if(source==eight) {
			textField.setText(textField.getText()+"8");
		}
		else if(source==nine) {
			textField.setText(textField.getText()+"9");
		}
		else if(source==dot) {
			if(textField.getText().contains(".")) {
				return;
			}else {
				textField.setText(textField.getText()+".");	
			}
			
		}
		else if(source==add)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=1;
			textField.setText("");
			label.setText(str+"+");
		}
		else if(source==sub)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=2;
			textField.setText("");
			label.setText(str+"-");
		}
		else if(source==mul)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=3;
			textField.setText("");
			label.setText(str+"x");
		}
		else if(source==div)
		{
			String str=textField.getText();
			num1=Double.parseDouble(textField.getText());
			calculation=4;
			textField.setText("");
			label.setText(str+"/");
		}
		else if(source==sq) {
			num1=Double.parseDouble(textField.getText());
			double square=Math.pow(num1, 2);
			String string=Double.toString(square);
			if(string.endsWith(".0")) {
				textField.setText(string.replace(".0",""));
						
				
			}else {
				textField.setText(string);
			}
			
		}
		else if(source==sqrt) {
			num1=Double.parseDouble(textField.getText());
			double sqrt=Math.sqrt(num1);
			textField.setText(Double.toString(sqrt));
			
		}
		else if(source==rec) {
			num1=Double.parseDouble(textField.getText());
			double rec=1/num1;
			String string=Double.toString(rec);
			if(string.endsWith(".0")) {
				textField.setText(string.replace(".0",""));
						
				
			}else {
				textField.setText(string);
			}
			
			
		}
		else if(source==equal) {
			num2=Double.parseDouble(textField.getText());
			double result = 0;
			switch(calculation) {
			case 1:
				 result=num1 +num2;
				break;
			case 2:
				result=num1-num2;
				break;
			case 3:
				result=num1*num2;
				break;
			case 4:
				result=num1/num2;
				break;
			}
			if(Double.toString(result).endsWith(".0")) {
				textField.setText(Double.toString(result).replace(".0",""));
			}else {
				textField.setText(Double.toString(result));
			}
			label.setText("");
			num1=result;
			
		}
	}
	
	
	public void enable() {
		on.setEnabled(false);
		off.setEnabled(true);
		textField.setEnabled(true);
		label.setEnabled(true);
		clear.setEnabled(true);
		
		
		zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		add.setEnabled(true);
		sub.setEnabled(true);
		mul.setEnabled(true);
		div.setEnabled(true);
		
		delete.setEnabled(true);
		sq.setEnabled(true);
		sqrt.setEnabled(true);
		rec.setEnabled(true);
		equal.setEnabled(true);
				
				
				
				
	}
	public void disable()
	{
		on.setEnabled(true);
		off.setEnabled(false);
		textField.setEnabled(false);
		label.setEnabled(false);
		label.setText("");
		textField.setText("");
		clear.setEnabled(false);
		zero.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		add.setEnabled(false);
		sub.setEnabled(false);
		mul.setEnabled(false);
        div.setEnabled(false);
		
		delete.setEnabled(false);
		sq.setEnabled(false);
		sqrt.setEnabled(false);
		rec.setEnabled(false);
		equal.setEnabled(false);
				
	}

}

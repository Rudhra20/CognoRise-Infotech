package Calci;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
	JLabel jl;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton,clearButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton subButton;
	JButton addButton;
	
	boolean isOperatorClicked=false;
	String oldValue;
	
	public calculator() {
		
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300, 200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl =new JLabel("");
		jl.setBounds(30, 50, 540, 40);
		jl.setBackground(Color.GRAY);
		jl.setOpaque(true);
		jl.setHorizontalAlignment(SwingConstants.RIGHT);
		jl.setForeground(Color.WHITE);
		
		jf.add(jl);
		
		sevenButton =new JButton("7");
		sevenButton.setBounds(30, 130, 80,80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton =new JButton("8");
		eightButton.setBounds(130, 130, 80,80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton =new JButton("9");
		nineButton.setBounds(230, 130, 80,80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton =new JButton("4");
		fourButton.setBounds(30, 230, 80,80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton =new JButton("5");
		fiveButton.setBounds(130, 230, 80,80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton =new JButton("6");
		sixButton.setBounds(230, 230, 80,80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton =new JButton("1");
		oneButton.setBounds(30, 330, 80,80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton =new JButton("2");
		twoButton.setBounds(130, 330, 80,80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton =new JButton("3");
		threeButton.setBounds(230, 330, 80,80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton =new JButton(".");
		dotButton.setBounds(30, 430, 80,80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton =new JButton("0");
		zeroButton.setBounds(130, 430, 80,80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton =new JButton("=");
		equalButton.setBounds(230, 430, 80,80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		//division operator
		divButton =new JButton("/");
		divButton.setBounds(330, 130, 80,80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		//multiply operator
		mulButton =new JButton("X");
		mulButton.setBounds(330, 230, 80,80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		//subtract operator
		subButton =new JButton("-");
		subButton.setBounds(330, 330, 80,80);
		subButton.addActionListener(this);
		jf.add(subButton);
		
		//add operator
		addButton =new JButton("+");
		addButton.setBounds(330, 430, 80,80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		//clear operator
		clearButton =new JButton("Clear");
		clearButton.setBounds(430, 430, 80,80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculator();
		
		
        		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked) {
				jl.setText("7");
				isOperatorClicked=false;
			}
			else {
			String labelText=jl.getText();
			jl.setText(labelText+"7");
			}
		}
		else if(e.getSource()==eightButton) {
			if(isOperatorClicked) {
				jl.setText("8");
				isOperatorClicked=false;
			}
			else {
			
			jl.setText(jl.getText()+"8");
			}
			
		}
		else if(e.getSource()==nineButton) {
			jl.setText("9");
			
		
			
		}
		else if(e.getSource()==fourButton) {
			jl.setText("4");
			
		}
		else if(e.getSource()==fiveButton) {
			jl.setText("5");
			
		}
		else if(e.getSource()==sixButton) {
			jl.setText("6");
			
		}
		else if(e.getSource()==oneButton) {
			jl.setText("1");
			
		}
		else if(e.getSource()==twoButton) {
			jl.setText("2");
			
		}
		else if(e.getSource()==threeButton) {
			jl.setText("3");
			
		}
		else if(e.getSource()==dotButton) {
			jl.setText(".");
			
		}
		else if(e.getSource()==zeroButton) {
			jl.setText("0");
			
		}
		else if(e.getSource()==equalButton) {
			String newValue=jl.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			float result=oldValueF+newValueF;
			//float result1=oldValueF-newValueF;
			//float result2=oldValueF*newValueF;
			//float result3=oldValueF/newValueF;
			jl.setText(result+ " ");
			//jl.setText(result1+ " ");
			//jl.setText(result2+ " ");
			//jl.setText(result3+ " ");
		}
		else if(e.getSource()==addButton) {
			isOperatorClicked=true;
			oldValue=jl.getText();
			
			
		}
		else if(e.getSource()==subButton) {
			
			isOperatorClicked=true;
			oldValue=jl.getText();
			
		}
		else if(e.getSource()==mulButton) {
		
			isOperatorClicked=true;
			oldValue=jl.getText();
		}
		else if(e.getSource()==divButton) {
			
			isOperatorClicked=true;
			oldValue=jl.getText();
		}
		else {
			jl.setText("");
		}
		
	}

}

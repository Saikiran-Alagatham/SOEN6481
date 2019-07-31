import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double operand1,operand2,middlevalue,Personal;
	String operator,result;
	String Answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
			initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 458, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton.setBounds(6, 62, 63, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = Answer;
				textField.setText(number);
				
			}
		});
		btnNewButton_1.setBounds(6, 110, 63, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setBounds(98, 63, 63, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setBounds(98, 110, 63, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(191, 63, 63, 36);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setBounds(191, 110, 63, 36);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setBounds(277, 63, 63, 36);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("+");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});
		btnNewButton_7.setBounds(381, 63, 63, 36);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("e^π");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + Math.pow(2.71828, 3.14159);
				textField.setText(number);
			}
		});
		btnNewButton_8.setBounds(6, 164, 63, 36);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("/");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		btnNewButton_9.setBounds(6, 216, 63, 36);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_10.getText();
				textField.setText(number);
			}
		});
		btnNewButton_10.setBounds(98, 164, 63, 36);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_11.getText();
				textField.setText(number);
			}
		});
		btnNewButton_11.setBounds(98, 216, 63, 36);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_12.getText();
				textField.setText(number);
			}
		});
		btnNewButton_12.setBounds(191, 164, 63, 36);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btnNewButton_13.getText());
		          }
			}
		});
		btnNewButton_13.setBounds(191, 216, 63, 36);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("6");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_14.getText();
				textField.setText(number);
			}
		});
		btnNewButton_14.setBounds(277, 110, 63, 36);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton_15.getText();
				textField.setText(number);
			}
			
		});
		btnNewButton_15.setBounds(277, 164, 63, 36);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				operand2=Double.parseDouble(textField.getText());
				
				if(operator == "+") {
					middlevalue = operand1 + operand2;
					answer = String.format("%.2f",middlevalue);
					textField.setText(answer);
					
					
				}else if(operator == "-") {
					middlevalue = operand1 - operand2;
					answer = String.format("%.2f",middlevalue);
					textField.setText(answer);
					Answer=answer;
					
				}else if(operator == "*") {
					middlevalue = operand1 * operand2;
					answer = String.format("%.2f",middlevalue);
					textField.setText(answer);
					Answer=answer;
					
				}else if(operator == "%") {
					middlevalue = operand1 % operand2;
					answer = String.format("%.2f",middlevalue);
					textField.setText(answer);
					Answer=answer;
					
				}else if(operator == "/") {
					middlevalue = operand1 / operand2;
					answer = String.format("%.2f",middlevalue);
					textField.setText(answer);
					Answer=answer;
					
				}
				
				
			}
		});
		btnNewButton_16.setBounds(277, 216, 63, 36);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		button.setBounds(381, 110, 63, 36);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		button_1.setBounds(381, 164, 63, 36);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operand1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		button_2.setBounds(381, 216, 63, 36);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Delete");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String delete = null;
				
				if(textField.getText().length()>0) {
					StringBuilder b=new StringBuilder(textField.getText());
					b.deleteCharAt(textField.getText().length()-1);
					delete = b.toString();
					textField.setText(delete);
					
					
				}
			}
		});
		button_3.setBounds(381, 264, 63, 36);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("π");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + 3.14;
				textField.setText(number);
			}
		});
		button_4.setBounds(277, 264, 63, 36);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("e");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + 2.71;
				textField.setText(number);
			}
		});
		button_5.setBounds(191, 264, 63, 36);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("power");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter base value:");
				double d1=sc.nextDouble();
				System.out.println("enter exponent value:");
				double d2=sc.nextDouble();
				
				String number = textField.getText() + Math.pow(d1, d2);
				textField.setText(number);
				
			}
		});
		button_6.setBounds(98, 264, 63, 36);
		frame.getContentPane().add(button_6);
	}
}

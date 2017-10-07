package calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=312,-1
	 */
	private final JTextField textField = new JTextField();
	private JTextField textField_1;
	protected AbstractButton txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 25, 296, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.addActionListener(new ActionListener() {
			private AbstractButton txtDisplay;

			public void actionPerformed(ActionEvent arg0) {
				//AbstractButton txtDisplay = 8;
	  			String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn8.setBounds(20, 76, 57, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(87, 76, 57, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(154, 76, 43, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(203, 78, 49, 43);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(22, 159, 55, 42);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(87, 159, 57, 42);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(154, 159, 57, 42);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(221, 159, 44, 42);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(20, 250, 57, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(86, 250, 58, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(86, 250, 58, 40);
		frame.getContentPane().add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(154, 252, 57, 40);
		frame.getContentPane().add(btn9);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult.setBounds(216, 250, 57, 40);
		frame.getContentPane().add(btnMult);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(20, 328, 57, 40);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDot.setBounds(86, 328, 58, 40);
		frame.getContentPane().add(btnDot);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(154, 328, 57, 40);
		frame.getContentPane().add(btnDiv);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSin.setBounds(221, 328, 57, 40);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCos.setBounds(20, 392, 57, 35);
		frame.getContentPane().add(btnCos);
	}
}

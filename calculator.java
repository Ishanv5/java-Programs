import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculateClass {

	private JFrame frame;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField Ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateClass window = new CalculateClass();
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
	public CalculateClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1 = new JTextField();
		Num1.setBounds(56, 14, 117, 50);
		frame.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(217, 17, 110, 44);
		frame.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1=Integer.parseInt(Num1.getText());
					n2=Integer.parseInt(Num2.getText());
					ans=n1+n2;
					Ans.setText(Integer.toString(ans));
					
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null, " Please enter valid nos ");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(95, 99, 110, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1=Integer.parseInt(Num1.getText());
					n2=Integer.parseInt(Num2.getText());
					ans=n1-n2;
					Ans.setText(Integer.toString(ans));
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, " Please enter valid nos ");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(237, 99, 110, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		Ans = new JTextField();
		Ans.setBounds(138, 174, 127, 50);
		frame.getContentPane().add(Ans);
		Ans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Solution");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(62, 174, 86, 44);
		frame.getContentPane().add(lblNewLabel);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField m1;
	private JTextField LN;
	private JTextField FN;
	private JTextField m2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 482, 335);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Label1 = new JLabel("First Name");
		Label1.setBounds(10, 11, 63, 34);
		panel.add(Label1);
		Label1.setFont(new Font("Stencil", Font.PLAIN, 11));
		
		FN = new JTextField();
		FN.setBounds(83, 5, 315, 40);
		panel.add(FN);
		FN.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mark 2");
		lblNewLabel_3.setBounds(191, 131, 41, 11);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Mark");
		lblNewLabel_2.setBounds(92, 131, 32, 11);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 11));
		
		m2 = new JTextField();
		m2.setBounds(173, 153, 86, 34);
		panel.add(m2);
		m2.setColumns(10);
		
		JLabel Label2 = new JLabel("Last Name");
		Label2.setBounds(10, 62, 63, 34);
		panel.add(Label2);
		Label2.setFont(new Font("Stencil", Font.PLAIN, 11));
		
		JLabel dis = new JLabel("");
		dis.setBounds(22, 235, 402, 55);
		panel.add(dis);
		
		LN = new JTextField();
		LN.setBounds(83, 56, 315, 40);
		panel.add(LN);
		LN.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				String firstN = FN.getText(); 	
				
				String lastN = LN.getText(); 	
				
				dis.setText(Label1 + "" + lastN);
				
				double mark1 = Double.parseDouble(m1.getText());
				double mark2 = Double.parseDouble(m1.getText());
				double avg = (mark1 + mark2)/2;
				
				dis.setText(firstN + "  " + lastN + "\t  your  mark  is:  " + avg);
			}
		});
		btnNewButton.setBounds(303, 140, 121, 61);
		panel.add(btnNewButton);
		
		m1 = new JTextField();
		m1.setBounds(68, 153, 86, 34);
		panel.add(m1);
		m1.setColumns(10);
		
	
	}
}

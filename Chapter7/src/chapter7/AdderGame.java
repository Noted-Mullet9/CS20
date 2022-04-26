package chapter7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class AdderGame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdderGame window = new AdderGame();
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
	public AdderGame() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Question = new JLabel("Label");
		Question.setBounds(146, 78, 147, 32);
		Question.setText(AdderMethods.random + "+" + AdderMethods.random2);
		panel.add(Question);
		
		textField = new JTextField();
		textField.setBounds(207, 78, 86, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(163, 132, 89, 23);
		panel.add(submitButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(95, 192, 250, 32);
		panel.add(lblNewLabel);
		
		JLabel Title = new JLabel("Adder Game");
		Title.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		Title.setBounds(163, 0, 125, 41);
		panel.add(Title);
	}
}

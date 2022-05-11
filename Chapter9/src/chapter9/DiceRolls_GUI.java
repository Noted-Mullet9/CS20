package chapter9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DiceRolls_GUI {

	private JFrame frame;
	
	DiceMethods dr = new DiceMethods();
	private JTextField Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRolls_GUI window = new DiceRolls_GUI();
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
	public DiceRolls_GUI() {
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
		
		JLabel Title = new JLabel("Dice Rolls");
		Title.setBounds(162, 5, 109, 31);
		Title.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(Title);
		
		JLabel Prompt1 = new JLabel("sample");
		Prompt1.setBounds(128, 71, 46, 14);
		
		System.out.println("How many rolls? ");
		dr.outcome = input.nextInt();
		panel.add(Prompt1);
		
		Input = new JTextField();
		Input.setBounds(242, 68, 86, 20);
		panel.add(Input);
		Input.setColumns(10);
		
		JLabel Outcomes = new JLabel("sample");
		Outcomes.setBounds(195, 164, 46, 14);
		panel.add(Outcomes);
		
		JButton Submit_Button = new JButton("Submit");
		Submit_Button.setBounds(167, 116, 89, 23);
		panel.add(Submit_Button);
	}
}

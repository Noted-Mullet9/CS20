package chapter9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Reverse {

	private JFrame frame;
	
	private String text;
	
	ReverseMethods rm = new ReverseMethods();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reverse window = new Reverse();
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
	public Reverse() {
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
		
		JLabel Output = new JLabel("New label");
		Output.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Output.setBounds(10, 77, 414, 81);
		panel.add(Output);
		
		text = " ";
		
		for (int i = rm.num_elements - 1; i >= 0; i--) {
			  
			 text += "    " + rm.numbers[i];
			
			}
		
		 Output.setText(text);
		 
		 JLabel Countdown = new JLabel("Countdown!!!!");
		 Countdown.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 Countdown.setBounds(160, 11, 141, 55);
		 panel.add(Countdown);
	}
}

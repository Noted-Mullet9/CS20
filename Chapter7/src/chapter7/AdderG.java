package chapter7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdderG {
	
	Questions q1 = new Questions();

	private JFrame frame;
	private JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdderG window = new AdderG();
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
	public AdderG() {
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
		
		JLabel Title = new JLabel("Math Game");
		Title.setFont(new Font("Tahoma", Font.BOLD, 18));
		Title.setBounds(167, 0, 133, 39);
		panel.add(Title);
		
		JLabel Prompt = new JLabel("New label");
		Prompt.setBounds(10, 94, 181, 33);
		panel.add(Prompt);
		Prompt.setText(q1.askQuestion());
				
		Answer = new JTextField();
		Answer.setBounds(230, 94, 141, 33);
		panel.add(Answer);
		Answer.setColumns(10);
		
		JLabel Output = new JLabel("");
		Output.setBounds(71, 217, 94, 33);
		panel.add(Output);
		
		JLabel Score = new JLabel("");
		Score.setBounds(243, 217, 94, 33);
		panel.add(Score);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int response = Integer.parseInt(Answer.getText());

				Output.setText(q1.Check(response));
				
				

			}

		});
		Submit.setBounds(177, 162, 89, 23);
		panel.add(Submit);
		
	}
}


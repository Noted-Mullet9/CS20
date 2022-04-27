package chapter7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdderGame implements ActionListener{

	private JFrame frame;
	private JTextField input;
	//private JTextField input;
	private JLabel output;
	AdderMethods am = new AdderMethods();
	
	
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
		Question.setBounds(147, 78, 59, 32);
		Question.setText(AdderMethods.random + " + " + AdderMethods.random2 + " = ");
		panel.add(Question);
		
		input = new JTextField();
		input.setBounds(202, 78, 86, 32);
		panel.add(input);
		input.setColumns(10);
		
		JLabel Title = new JLabel("Adder Game");
		Title.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 18));
		Title.setBounds(163, 0, 125, 41);
		panel.add(Title);
		
		JLabel dis = new JLabel("New label");
		dis.setBounds(57, 182, 367, 48);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 int userinput = Integer.parseInt(input.getText());
				  
				  {
				          
				          if(userinput == am.answer)
				          {
				        	  dis.setText("Correct!");
				          }
				          else if(userinput != am.answer)
				          {

				        	  dis.setText("Wrong!");
				          }
				          else if(userinput == 999)
				          {
			                   System.exit(0);
				          }
				         
				      }
			}
				
			
		});
		btnNewButton.setBounds(174, 118, 89, 23);
		panel.add(btnNewButton);
	}
				 
}


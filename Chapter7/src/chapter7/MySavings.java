package chapter7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class MySavings {

  private JFrame frame;
  private JTextField input;
  private JLabel output;

 PiggyBank pb = new PiggyBank();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MySavings window = new MySavings();
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
  public MySavings() {
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

    JLabel p1 = new JLabel("1. Show Total in bank.");
    p1.setBounds(10, 62, 185, 14);
    panel.add(p1);

    JLabel p2 = new JLabel("2. Add a penny.");
    p2.setBounds(10, 87, 131, 14);
    panel.add(p2);

    JLabel p0 = new JLabel("Savings");
    p0.setBounds(180, 0, 84, 48);
    panel.add(p0);
    p0.setFont(new Font("Tahoma", Font.PLAIN, 20));

    JLabel p5 = new JLabel("5. Add a quarter.");
    p5.setBounds(10, 162, 113, 14);
    panel.add(p5);

    JLabel p3 = new JLabel("3. Add a nickel.");
    p3.setBounds(10, 112, 113, 14);
    panel.add(p3);

    JLabel p4 = new JLabel("4. Add a dime.");
    p4.setBounds(10, 137, 93, 14);
    panel.add(p4);

    JLabel p6 = new JLabel("6. Take money out of bank");
    p6.setBounds(10, 177, 213, 36);
    panel.add(p6);

    JLabel p7 = new JLabel("Enter 0 to quit");
    p7.setBounds(298, 87, 94, 14);
    panel.add(p7);

    JLabel p8 = new JLabel("Enter your choice");
    p8.setBounds(298, 112, 113, 14);
    panel.add(p8);

    input =     new JTextField();
    input.setBounds(280, 141, 131, 56);
    panel.add(input);
    input.setColumns(10);

    JButton Submit = new JButton("Submit");
    Submit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      {

        int userinput = Integer.parseInt(input.getText());

          //output.setText(String.valueOf(newTotal));
          // System.out.println(String.valueOf(piggyBank));
          
          if(userinput == 1)
          {
        	pb.giveTotal();
          }
          else if(userinput == 2)
          {
        	  pb.addCoin(0.01);
        	  output.setText(String.valueOf(pb.giveTotal()));
          }
          else if(userinput == 3)
          {
        	  pb.addCoin(0.05);
        	  output.setText(String.valueOf(pb.giveTotal()));
          }
          else if(userinput == 4)
          {
        	  pb.addCoin(0.10);
        	  output.setText(String.valueOf(pb.giveTotal()));
          }
          else if(userinput == 5)
          {
        	  pb.addCoin(0.25);
        	  output.setText(String.valueOf(pb.giveTotal()));
          }
          
          else if(userinput == 6)
          {
        	  pb.removeCoin();
        	  output.setText(String.valueOf(pb.giveTotal()));
          }
          
          else if(userinput == 0)
          {
        	  System.exit(0);
          }


      }

    });
    Submit.setBounds(303, 208, 89, 23);
    panel.add(Submit);

    output = new JLabel("");
    output.setBounds(10, 208, 275, 42);
    panel.add(output);

   
  }

}
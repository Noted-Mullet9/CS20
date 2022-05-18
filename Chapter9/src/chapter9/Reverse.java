package chapter9;

/*

Program: Reverse.java          Last Date of this Revision: May 18, 2022

Purpose: An application that creates and displays the indexes in the array in reverse essentially creating a countdown 

Author: Alador Tesema, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Reverse {

  private JFrame frame;

  //creates new string variable
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

    //assign text a blank string value 
    text = " ";

    //following lines print out the every index in the array but in reversed order using the text variable
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
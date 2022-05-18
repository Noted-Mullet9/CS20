package chapter9;

/*

Program: DiceRolls.java          Last Date of this Revision: May 18, 2022

Purpose: An application that prompts the user for an amount of dice rolls and returns their outcomes 
Author: Alador Tesema, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DiceRolls {

  private JFrame frame;

  DiceMethods dr = new DiceMethods();
  private JTextField Input;
  private String output = "";
  private int p;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DiceRolls window = new DiceRolls();
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
  public DiceRolls() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 456, 438);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JPanel panel = new JPanel();
    panel.setBounds(0, 0, 430, 390);
    frame.getContentPane().add(panel);
    panel.setLayout(null);

    JLabel Title = new JLabel("Dice Rolls");
    Title.setBounds(162, 5, 109, 31);
    Title.setFont(new Font("Tahoma", Font.PLAIN, 25));
    panel.add(Title);

    JLabel Prompt1 = new JLabel("sample");
    Prompt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
    Prompt1.setBounds(61, 67, 183, 34);
    panel.add(Prompt1);
    Prompt1.setText(dr.askQuestion());

    Input = new JTextField();
    Input.setBounds(226, 68, 139, 37);
    panel.add(Input);
    Input.setColumns(10);

    JTextArea Outcomes = new JTextArea();
    Outcomes.setLineWrap(true);
    Outcomes.setBounds(10, 173, 407, 192);
    panel.add(Outcomes);

    JButton Submit_Button = new JButton("Submit");
    Submit_Button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        //records user input 
        p = Integer.parseInt(Input.getText());

        //calls setRolls method and gives it a value (users input)
        dr.setRolls(p);

        //calls calculate method and calculates the outcomes of the rolls
        dr.calculate();

        //assigns output a blank value
        output = " ";

        //the following lines print out the outcomes of the rolls 
        for (int i = 3; i <= 18; i++) {
          output += (dr.giveOutcomes(i) + "     ");
        }

        Outcomes.setText(output);

      }
    });
    Submit_Button.setBounds(167, 127, 99, 23);
    panel.add(Submit_Button);

  }
}
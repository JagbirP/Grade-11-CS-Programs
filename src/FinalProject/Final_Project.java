package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author purej1485
 */
public class Final_Project  implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainpanel = new JPanel();

  // Calculator "Screen" where the inputted expression goes
  JLabel screen = new JLabel();
  
  // Number Buttons
  JButton onebutton = new JButton("1");
  JButton twobutton = new JButton("2");
  JButton threebutton = new JButton("3");
  JButton fourbutton = new JButton("4");
  JButton fivebutton = new JButton("5");
  JButton sixbutton = new JButton("6");
  JButton sevenbutton = new JButton("7");
  JButton eightbutton = new JButton("8");
  JButton ninebutton = new JButton("9");
  JButton zerobutton = new JButton("0");
  
  //decimal button
  JButton decbutton = new JButton(".");
  
  // Simple Operation Buttons
  JButton addbutton = new JButton("+");
  JButton subbutton = new JButton("-");
  JButton mulbutton = new JButton("*");
  JButton divbutton = new JButton("/");
  

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(400,600);
    // shows the window
    frame.setVisible(true);
    
    frame.add(mainpanel);
    mainpanel.setLayout(null);
    
    // Screen Label
    screen.setBounds(0,0,75,400);
 
    
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Final_Project  gui = new Final_Project ();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}


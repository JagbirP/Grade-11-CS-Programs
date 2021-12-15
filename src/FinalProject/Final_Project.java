package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class Final_Project implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainpanel = new JPanel();

    // Calculator "Screen" where the inputted expression goes
    ColourLabel screen = new ColourLabel();
    
    

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
    // Simple Operation + Decimal + Parantheses + equal Buttons 
    JButton addbutton = new JButton("+");
    JButton subbutton = new JButton("-");
    JButton mulbutton = new JButton("*");
    JButton divbutton = new JButton("/");
    JButton decbutton = new JButton(".");
    JButton openbracbutton = new JButton("(");
    JButton closebracbutton = new JButton(")");
    JButton equalbutton = new JButton ("=");

    // Method to assemble our GUI
    public void run() {
        // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
        JFrame frame = new JFrame("Title");
        // Makes the X button close the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // makes the windows 800 pixel wide by 600 pixels tall
        frame.setSize(400, 600);
        // shows the window
        frame.setVisible(true);

        frame.add(mainpanel);
        mainpanel.setLayout(null);

        // Screen Label
        screen.setBounds(25, 70, 275, 125);
        mainpanel.add(screen);
        
        //number buttons
        onebutton.setBounds(50, 300, 50, 50);
        mainpanel.add(onebutton);
        onebutton.addActionListener(this);
        onebutton.setActionCommand("onebutton");
        
        twobutton.setBounds(100, 300, 50, 50);
        mainpanel.add(twobutton);
        
        threebutton.setBounds(150, 300, 50, 50);
        mainpanel.add(threebutton);
        
        fourbutton.setBounds(50, 250, 50, 50);
        mainpanel.add(fourbutton);
        
        fivebutton.setBounds(100, 250, 50, 50);
        mainpanel.add(fivebutton);
        
        sixbutton.setBounds(150, 250, 50, 50);
        mainpanel.add(sixbutton);
        
        sevenbutton.setBounds(50, 200, 50, 50);
        mainpanel.add(sevenbutton);
        
        eightbutton.setBounds(100, 200, 50, 50);
        mainpanel.add(eightbutton);
        
        ninebutton.setBounds(150, 200, 50, 50);
        mainpanel.add(ninebutton);
        
        zerobutton.setBounds(50, 350, 50, 50);
        mainpanel.add(zerobutton);

        // Operations + Equal + Decinal Buttons
        addbutton.setBounds(200, 300, 50, 50);
        mainpanel.add(addbutton);

        subbutton.setBounds(250, 300, 50, 50);
        mainpanel.add(subbutton);

        mulbutton.setBounds(200, 250, 50, 50);
        mainpanel.add(mulbutton);

        divbutton.setBounds(250, 250, 50, 50);
        mainpanel.add(divbutton);

        decbutton.setBounds(100, 350, 50, 50);
        mainpanel.add(decbutton);

        openbracbutton.setBounds(200, 200, 50, 50);
        mainpanel.add(openbracbutton);

        closebracbutton.setBounds(250, 200, 50, 50);
        mainpanel.add(closebracbutton);
        
        equalbutton.setBounds(150,350,150,50);
        mainpanel.add(equalbutton);
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();

    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        Final_Project gui = new Final_Project();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

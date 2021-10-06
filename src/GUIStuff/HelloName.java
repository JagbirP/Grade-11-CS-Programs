package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class HelloName implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainpanel = new JPanel();
    JTextField textbox = new JTextField();
    JTextField outputBox = new JTextField();

    // Method to assemble our GUI
    public void run() {
        // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
        JFrame frame = new JFrame("Title");
        // Makes the X button close the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // makes the windows 800 pixel wide by 600 pixels tall
        frame.setSize(800, 600);
        // shows the window
        frame.setVisible(true);
        
        frame.add(mainpanel);
        mainpanel.setLayout(null);
        
        //user textbox
        textbox.setBounds(350, 290, 100, 20);
        mainpanel.
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();
        
    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        HelloName gui = new HelloName();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

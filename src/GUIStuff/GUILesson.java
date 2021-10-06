package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class GUILesson implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainPanel = new JPanel();
    JTextField textbox = new JTextField("default text");
    JTextField numberbox = new JTextField();
    JButton button = new JButton("Press Me");
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

        //put the panel in the frame
        frame.add(mainPanel);

        // disable the layout manager
        mainPanel.setLayout(null);

        // set the size and location of the text box
        textbox.setBounds(200,200,100,50);
        
        //add it to the screen
        mainPanel.add(textbox);
        
        //resize and position the button
        button.setBounds(200,300,100,50);
        mainPanel.add(button);
        //add the listener
        button.addActionListener(this);
        button.setActionCommand("button");
        
        outputBox.setBounds(200,400,300,100);
        outputBox.setEnabled(false);
        mainPanel.add(outputBox);
        
        numberbox.setBounds(350,200,100,50);
        mainPanel.add(numberbox);
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();
        //What command happened?
        if(command.equals ("button")){
            //get the text typed into the textbox
            String name = textbox.getText();
            //say hello in the output box
            outputBox.setText("Hello " + name); 
            
            //get the number from the text box
            String numberword = numberbox.getText();
            //convert it into an actual number
            double number = Double.parseDouble(numberword);
            
            double product = number*5;
            outputBox.setText("" + product);
        }
    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        GUILesson gui = new GUILesson();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

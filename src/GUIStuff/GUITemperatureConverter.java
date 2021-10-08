package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class GUITemperatureConverter implements Runnable, ActionListener {

    // Class Variables  
    JPanel panel = new JPanel();

    //f to c converter variables
    JLabel LabelF = new JLabel("Degrees Fahrenheit");
    JTextField TextF = new JTextField();
    JButton fbut = new JButton("F to C");

    //c to f converter varibles
    JLabel LabelC = new JLabel("Degrees Celcius");
    JTextField TextC = new JTextField();
    JButton cbut = new JButton("C to F");

    // Method to assemble our GUI
    public void run() {
        // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
        JFrame frame = new JFrame("Temperature Converter");
        // Makes the X button close the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // makes the windows 800 pixel wide by 600 pixels tall
        frame.setSize(800, 600);
        // shows the window
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        //f to c variables
        LabelF.setBounds(150, 200, 150, 25);
        panel.add(LabelF);
        
        TextF.setBounds(350, 200, 100, 25);
        panel.add(TextF);
        
        fbut.setBounds(500, 200, 100, 25);
        panel.add(fbut);
        fbut.addActionListener(this);
        fbut.setActionCommand("FButton");
        
        // c to f varibles
        
        LabelC.setBounds(150, 300, 150, 25);
        panel.add(LabelC);
        
        TextC.setBounds(350, 300, 100, 25);
        panel.add(TextC);
        
        cbut.setBounds(500, 300, 100, 25);
        panel.add(cbut);
        cbut.addActionListener(this);
        cbut.setActionCommand("CButton");
 
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();
        
        //f to c converter
        if(command.equals("FButton")){
            String ftoc = TextF.getText();
            double FtoC = Double.parseDouble(ftoc);
            double FtoCFinal = (FtoC -32)*5/9;
            FtoCFinal = Math.round(FtoCFinal*100)/100.0;
            TextC.setText("" + FtoCFinal);
        }
        
        //c to f converter
        if(command.equals("CButton")){
            String ctof = TextC.getText();
            double CtoF = Double.parseDouble(ctof);
            double CtoFFinal = (CtoF * 9/5)+32;
            CtoFFinal = Math.round(CtoFFinal*100)/100.0;
            TextF.setText("" + CtoFFinal);
        }

    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        GUITemperatureConverter gui = new GUITemperatureConverter();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

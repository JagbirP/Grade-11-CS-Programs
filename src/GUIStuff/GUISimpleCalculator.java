package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class GUISimpleCalculator implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainpanel = new JPanel();

    // first number
    JTextField firstbox = new JTextField();

    //second number
    JTextField secbox = new JTextField();

    //Result
    JTextField resbox = new JTextField("Result");

    //Arithemetic buttons
    JButton addbutton = new JButton("Add");
    JButton subbutton = new JButton("Sub");
    JButton mulbutton = new JButton("Mul");
    JButton divbutton = new JButton("Div");
    
    //labels
    JLabel First = new JLabel("First Integer");
    JLabel Second = new JLabel("Second Integer");
    JLabel Result = new JLabel("Result");

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

        //first number textbox
        firstbox.setBounds(250, 150, 150, 25);
        mainpanel.add(firstbox);

        //second number textbox
        secbox.setBounds(250, 250, 150, 25);
        mainpanel.add(secbox);

        //Result Box
        resbox.setBounds(250, 350, 150, 25);
        mainpanel.add(resbox);
        resbox.setEnabled(false);
        
        //labels
        First.setBounds(150,150,100,25);
        mainpanel.add(First);
        
        Second.setBounds(150,250,100,25);
        mainpanel.add(Second);
        
        Result.setBounds(150,350,100,25);
        mainpanel.add(Result);
        
        //Arithmetic buttons
        addbutton.setBounds(100, 450, 100, 25);
        mainpanel.add(addbutton);
        addbutton.addActionListener(this);
        addbutton.setActionCommand("addbutton");

        subbutton.setBounds(200, 450, 100, 25);
        mainpanel.add(subbutton);
        subbutton.addActionListener(this);
        subbutton.setActionCommand("subbutton");

        mulbutton.setBounds(300, 450, 100, 25);
        mainpanel.add(mulbutton);
        mulbutton.addActionListener(this);
        mulbutton.setActionCommand("mulbutton");

        divbutton.setBounds(400, 450, 100, 25);
        mainpanel.add(divbutton);
        divbutton.addActionListener(this);
        divbutton.setActionCommand("divbutton");

    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();

        //addition 
        if (command.equals("addbutton")) {
            String add1 = firstbox.getText();
            String add2 = secbox.getText();
            double add3 = Double.parseDouble(add1);
            double add4 = Double.parseDouble(add2);
            double addtotal = add3 + add4;
            resbox.setText("" + addtotal);
        }

        // subtraction
        if (command.equals("subbutton")) {
            String sub1 = firstbox.getText();
            String sub2 = secbox.getText();
            double sub3 = Double.parseDouble(sub1);
            double sub4 = Double.parseDouble(sub2);
            double subtotal = sub3 - sub4;
            resbox.setText("" + subtotal);
        }

        //multiplication
        if (command.equals("mulbutton")) {
            String mul1 = firstbox.getText();
            String mul2 = secbox.getText();
            double mul3 = Double.parseDouble(mul1);
            double mul4 = Double.parseDouble(mul2);
            double multotal = mul3 * mul4;
            resbox.setText("" + multotal);
        }

        //division
        if (command.equals("divbutton")) {
            String div1 = firstbox.getText();
            String div2 = secbox.getText();
            double div3 = Double.parseDouble(div1);
            double div4 = Double.parseDouble(div2);
            double divtotal = div3 / div4;
            resbox.setText("" + divtotal);
        }

    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        GUISimpleCalculator gui = new GUISimpleCalculator();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

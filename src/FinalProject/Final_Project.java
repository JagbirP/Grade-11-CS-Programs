package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.regex.*;

/**
 *
 * @author purej1485
 */
public class Final_Project implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainpanel = new JPanel();

    // Calculator "Screen" where the inputted expression goes
    ColourLabel screen = new ColourLabel();
    Font screenfont = new Font("Arial", Font.BOLD, 20);

    // math expression
    String expression = new String();
    
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
    JButton equalbutton = new JButton("=");
    
    //extra buttons
    
    JButton clearbutton = new JButton("CLEAR");

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
        screen.setBounds(50, 75, 250, 125);
        mainpanel.add(screen);

        //number buttons
        onebutton.setBounds(50, 300, 50, 50);
        mainpanel.add(onebutton);
        onebutton.addActionListener(this);
        onebutton.setActionCommand("onebutton");

        twobutton.setBounds(100, 300, 50, 50);
        mainpanel.add(twobutton);
        twobutton.addActionListener(this);
        twobutton.setActionCommand("twobutton");

        threebutton.setBounds(150, 300, 50, 50);
        mainpanel.add(threebutton);
        threebutton.addActionListener(this);
        threebutton.setActionCommand("threebutton");

        fourbutton.setBounds(50, 250, 50, 50);
        mainpanel.add(fourbutton);
        fourbutton.addActionListener(this);
        fourbutton.setActionCommand("fourbutton");

        fivebutton.setBounds(100, 250, 50, 50);
        mainpanel.add(fivebutton);
        fivebutton.addActionListener(this);
        fivebutton.setActionCommand("fivebutton");

        sixbutton.setBounds(150, 250, 50, 50);
        mainpanel.add(sixbutton);
        sixbutton.addActionListener(this);
        sixbutton.setActionCommand("sixbutton");

        sevenbutton.setBounds(50, 200, 50, 50);
        mainpanel.add(sevenbutton);
        sevenbutton.addActionListener(this);
        sevenbutton.setActionCommand("sevenbutton");

        eightbutton.setBounds(100, 200, 50, 50);
        mainpanel.add(eightbutton);
        eightbutton.addActionListener(this);
        eightbutton.setActionCommand("eightbutton");

        ninebutton.setBounds(150, 200, 50, 50);
        mainpanel.add(ninebutton);
        ninebutton.addActionListener(this);
        ninebutton.setActionCommand("ninebutton");

        zerobutton.setBounds(50, 350, 50, 50);
        mainpanel.add(zerobutton);
        zerobutton.addActionListener(this);
        zerobutton.setActionCommand("zerobutton");

        // Operations + Equal + Decinal Buttons
        addbutton.setBounds(200, 300, 50, 50);
        mainpanel.add(addbutton);
        addbutton.addActionListener(this);
        addbutton.setActionCommand("addbutton");

        subbutton.setBounds(250, 300, 50, 50);
        mainpanel.add(subbutton);
        subbutton.addActionListener(this);
        subbutton.setActionCommand("subbutton");

        mulbutton.setBounds(200, 250, 50, 50);
        mainpanel.add(mulbutton);
        mulbutton.addActionListener(this);
        mulbutton.setActionCommand("mulbutton");

        divbutton.setBounds(250, 250, 50, 50);
        mainpanel.add(divbutton);
        divbutton.addActionListener(this);
        divbutton.setActionCommand("divbutton");

        decbutton.setBounds(100, 350, 50, 50);
        mainpanel.add(decbutton);
        decbutton.addActionListener(this);
        decbutton.setActionCommand("decbutton");

        /*
        openbracbutton.setBounds(200, 200, 50, 50);
        mainpanel.add(openbracbutton);
        openbracbutton.addActionListener(this);
        openbracbutton.setActionCommand("openbracbutton");

        closebracbutton.setBounds(250, 200, 50, 50);
        mainpanel.add(closebracbutton);
        closebracbutton.addActionListener(this);
        closebracbutton.setActionCommand("closebracbutton");
*/
        clearbutton.setBounds(200, 200, 100, 50);
        mainpanel.add(clearbutton);
        clearbutton.addActionListener(this);
        clearbutton.setActionCommand("clearbutton");
        
        equalbutton.setBounds(150, 350, 150, 50);
        mainpanel.add(equalbutton);
        equalbutton.addActionListener(this);
        equalbutton.setActionCommand("equalbutton");
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();

        // update the screen for each inputted number/operation when pressed
        switch (command) {
            case "onebutton":
                expression = expression + "1";
                break;
            case "twobutton":
                expression = expression + "2";
                break;
            case "threebutton":
                expression = expression + "3";
                break;
            case "fourbutton":
                expression = expression + "4";
                break;
            case "fivebutton":
                expression = expression + "5";
                break;
            case "sixbutton":
                expression = expression + "6";
                break;
            case "sevenbutton":
                expression = expression + "7";
                break;
            case "eightbutton":
                expression = expression + "8";
                break;
            case "ninebutton":
                expression = expression + "9";
                break;
            case "zerobutton":
                expression = expression + "0";
                break;
            case "addbutton":
                expression = expression + " + ";
                break;
            case "subbutton":
                expression = expression + " - ";
                break;
            case "mulbutton":
                expression = expression + " * ";
                break;
            case "divbutton":
                expression = expression + " / ";
                break;
            case "decbutton":
                expression = expression + ".";
                break;
            case "clearbutton":
                expression = "";
                break;
            case "openbracbutton":
                expression = expression + "(";
                break;
            case "closebracbutton":
                expression = expression + ")";
                break;
            default:
                break;
        }
        // if the user hits equal, change the screen to the answer
        if (command.equals("equalbutton")) {
            expression = Answer(expression);
        }
        // updates screen for all numbers and operations
        screen.setText(expression);
        screen.setFont(screenfont);

    }

    // updates the expression string by taking out blanks and commas during conversion
    public static String toText(String[] nums) {

        String output = "";

        for (int i = 0; i < nums.length; i++) {

            // if there is a blank, do nothing, else add it to output with spaces
            if (nums[i].equals("")) {

            } else {
                output += nums[i];
                if (i != nums.length - 1) {
                    output += " ";
                }

            }
        }

        return output;
    }

    // check if the string array still has multipication or division
    public static boolean muldivCheck(String[] nums) {

        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            if ("*".equals(nums[i]) || "/".equals(nums[i])) {
                check = true;
                break;
            }

        }
        return check;
    }

    // Calculate the answer and display to screen
    public String Answer(String expression) {
        
        String[] nums = expression.split(" ");
        
        // variable to check for multipication/division
        boolean Checkmuldiv = false;

        // until there is only 1 number left, aka until the expression is solved
        while (nums.length != 1) {

            // check to see if there is multipication or division in the expression
            Checkmuldiv = muldivCheck(nums);

            while (Checkmuldiv != false) {

                for (int j = 0; j < nums.length; j++) {

                    // in the expression, and solve if there is
                    // if it is either operation, do the operation and then make 
                    // i-1 into the answer
                    if ("*".equals(nums[j])) {
                        // do the operation and make i-1 
                        nums[j - 1] = Double.toString(Double.parseDouble(""
                                + nums[j - 1]) * Double.parseDouble("" + nums[j + 1]));

                        // remove the parts of the expression already operated
                        nums[j] = "";
                        nums[j + 1] = "";

                        // update the expression string to match new expression
                        expression = Arrays.toString(nums);

                        // remove opening and closing brackets from string conversion
                        expression = expression.substring(1, expression.length() - 1);

                        // send to method toText
                        expression = toText(nums);

                        // update string array
                        nums = expression.split(" ");

                        System.out.println(expression);

                    } else if ("/".equals(nums[j])) {
                        // do the operation and make i-1 
                        nums[j - 1] = Double.toString(Double.parseDouble(""
                                + nums[j - 1]) / Double.parseDouble("" + nums[j + 1]));

                        // remove the parts of the expression already operated
                        nums[j] = "";
                        nums[j + 1] = "";

                        // update the expression string to match new expression
                        expression = Arrays.toString(nums);

                        // remove opening and closing brackets from string conversion
                        expression = expression.substring(1, expression.length() - 1);

                        // send to method toText
                        expression = toText(nums);

                        // update string array
                        nums = expression.split(" ");

                        System.out.println(expression);

                    }
                    // check if there is division or multipication left
                    Checkmuldiv = muldivCheck(nums);

                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums.length != 1 && "+".equals(nums[i])) {
                    // do the operation and make i-1 
                    nums[i - 1] = Double.toString(Double.parseDouble(""
                            + nums[i - 1]) + Double.parseDouble("" + nums[i + 1]));

                    // remove the parts of the expression already operated
                    nums[i] = "";
                    nums[i + 1] = "";

                    // update the expression string to match new expression
                    expression = Arrays.toString(nums);

                    // remove opening and closing brackets from string conversion
                    expression = expression.substring(1, expression.length() - 1);

                    // send to method toText
                    expression = toText(nums);

                    // update string array
                    nums = expression.split(" ");

                    System.out.println(expression);

                }

                if (nums.length
                        != 1 && "-".equals(nums[i])) {
                    // do the operation and make i-1 
                    nums[i - 1] = Double.toString(Double.parseDouble(""
                            + nums[i - 1]) - Double.parseDouble("" + nums[i + 1]));

                    // remove the parts of the expression already operated
                    nums[i] = "";
                    nums[i + 1] = "";

                    // update the expression string to match new expression
                    expression = Arrays.toString(nums);

                    // remove opening and closing brackets from string conversion
                    expression = expression.substring(1, expression.length() - 1);

                    // send to method toText
                    expression = toText(nums);

                    // update string array
                    nums = expression.split(" ");

                    System.out.println(expression);

                }
            }
        }
        return expression;
    }

// Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        Final_Project gui = new Final_Project();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
        
        

    }

}

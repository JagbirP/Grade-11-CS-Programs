package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author purej1485
 */
public class TicTacToe2 implements Runnable, ActionListener {

    // Class Variables  
    JPanel mainPanel;
    JPanel gameGrid;
    JButton[] gridButtons = new JButton[9];
    JTextField instructions;
    
    char[] board = new char[9];
    char player = 'X';

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

        //make the overall panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        //grid for buttons
        gameGrid = new JPanel();
        gameGrid.setLayout(new GridLayout(3, 3));
        
        for (int i = 0; i < gridButtons.length; i++) {
            //make the button
            gridButtons[i] = new JButton();
            gridButtons[i].addActionListener(this);
            gridButtons[i].setActionCommand("" + i);

            //add them to grid
            gameGrid.add(gridButtons[i]);
        }

        // add gamegrid to main panel center spot
        mainPanel.add(gameGrid, BorderLayout.CENTER);

        // create the instructions text
        instructions = new JTextField("Player X goes first");
        mainPanel.add(instructions, BorderLayout.PAGE_END);

        //put the main panel in the frame
        frame.add(mainPanel);
        clearBoard();
    }
    
    public void clearBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
            gridButtons[i].setText("");
        }
    }
    
    public boolean placePiece(int spot) {
        
        if (spot < 0 || spot > 8 || !isFree(spot)) {
            instructions.setText("Invalid Choice. Try Again");
            return false;
        }
        
        board[spot] = player;
        gridButtons[spot].setText("" + player);
        return true;
    }
    
    public void changeTurns() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
        instructions.setText("It is " + player + "'s go!");
    }
    
    public boolean checkforWin() {
        //check veritcal and horizontal
        for (int i = 0; i < 3; i++) {
            if (board[3 * i] == player && board[3 * i + 2] == player && board[3 * i + 2] == player) {
                return true;
            }
            if (board[i] == player && board[i + 3] == player && board[i + 6] == player) {
                return true;
            }
        }

        //diagnonals 
        if (board[0] == player && board[4] == player && board[8] == player) {
            return true;
        }
        if (board[2] == player && board[4] == player && board[6] == player) {
            return true;
        }
        //no one has won yet
        return false;
    }
    
    public boolean checkforTie() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                return false;
            }
        }
        return true;
    }
    
    public boolean isFree(int spot) {
        if (board[spot] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    // method called when a button is pressed
    public void actionPerformed(ActionEvent e) {
        // get the command from the action
        String command = e.getActionCommand();
        // get the number of the spot
        int spot = Integer.parseInt(command);
        //if we can place a piece at that spot
        if (placePiece(spot)) {
            if (checkforWin()) {
                instructions.setText("player " + player + " wins!");
            } else if (checkforTie()) {
                instructions.setText("Tie Game");
                
            } else{
                changeTurns();
            }
        }
        
    }

    // Main method to start our program
    public static void main(String[] args) {
        // Creates an instance of our program
        TicTacToe2 gui = new TicTacToe2();
        // Lets the computer know to start it in the event thread
        SwingUtilities.invokeLater(gui);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Games;

import java.util.Scanner;

/**
 *
 * @author purej1485
 */
public class TicTacToe {

    static Scanner in = new Scanner(System.in);
    static char[] board = new char[9];
    static char player = 'X';

    public static void drawBoard() {

        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("------");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("------");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);

    }

    public static void clearBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = ' ';
        }
    }

    public static void placePiece() {

        System.out.println("It is " + player + " turn");
        System.out.println("Please pick a spot: (0-8)");
        int spot = in.nextInt();

        while (spot < 0 || spot > 8 || !isFree(spot)) {
            System.out.println("Invalid Choice. Try Again");
            spot = in.nextInt();
        }

        board[spot] = player;
    }

    public static void changeTurns() {
        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }

    public static boolean checkforWin() {
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

    public static boolean checkforTie() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isFree(int spot) {
        if (board[spot] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        clearBoard();
        while (true) {
            drawBoard();
            placePiece();
            boolean win = checkforWin();
            boolean tie = checkforTie();
            if (win) {
                System.out.println("Player " + player + " wins");
                drawBoard();
                break;
            } else if (tie) {
                System.out.println("TIE GAME");
                drawBoard();
            } else {
                changeTurns();
            }

        }
    }
}

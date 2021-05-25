package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Get Players names
        System.out.println("What is your name Player 1? ");
        String p1 = input.nextLine();
        System.out.println("What is your name player 2? ");
        String p2 = input.nextLine();

//        TicTacToe Board
//        - empty space
//        x player 1
//        o player 2
//        make a 2d array
        char[][] board = new char[3][3];

//        Fill in the board with dashes/ empty spaces
//        w/ nested for loop
//        make index < 3 because there is only 3rows/columns
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                board[i][p] = '-';
            }
        }

        //        Create boolean to keep track of whose turn it is
        boolean isPlayer1 = true;

//        Keep track if the game has ended
        boolean gameEnded = false;

//    Put code(from "draw board" until "its a tie" in a while loop to continue the game if not ended
        while(!gameEnded) {
//        Draw the board
//        calling board function
        drawBoard(board);


//        Create a var to keep track of what symbol we are using
//        create if statement where char(symbol) equals space and if player1 turn
//        it equals x or else it is o which is player 2
        char symbol = ' ';
        if (isPlayer1) {
            symbol = 'x';
        } else {
            symbol = 'o';
        }

//        Print out Which player's turn it is
        if (isPlayer1) {
            System.out.println(p1 + " it is your turn (x):");
        } else {
            System.out.println(p2 + " it is your turn (o):");
        }

//        Create variables to access row and column outside while loop
        int row = 0;
        int column = 0;

//        Put all code from here into in a while loop and break after the else statement
//        where row and column are valid. This makes sure users input is valid.

        while (true) {
//        Get row and column user wants to play on
            System.out.print("Enter a row (0, 1, or 2): ");
            row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2): ");
            column = input.nextInt();

//        Check if row and column are valid with if statement
            if (row < 0 || column < 0 || row > 2 || column > 2) {
//            Row/ Column are out of bounds
                System.out.println("You are out of bounds Mister Ma'am!!!");
            } else if (board[row][column] != '-') {
//            Board position is not empty(-) has an x or o
                System.out.println("This spot is already taken, find your own!");
            } else {
//            row and column are valid
                break;
            }
        }

//          Setting the position on the board to the player's symbol
        board[row][column] = symbol;


//        Check if a player has won
//            adding gameEnded statement sends the game if any of following statements
//            are true w/o the game would never end
        if (hasWon(board) == 'x') {
//            Player1 has won
            System.out.println(p1 + " has won!!");
            gameEnded = true;
        } else if (hasWon(board) == 'o') {
//            player2 has won
            System.out.println(p2 + " has won!!");
            gameEnded = true;
        } else {
//            nobody has won
            if (hasTied(board)) {
                System.out.println("It's a tie!!!");
                gameEnded = true;
            } else {
//                Continues the game and switches player's turn
                isPlayer1 = !isPlayer1;
            }
        }
    }
//        Prints Out the final state of the board
        drawBoard(board);
    }

    //        Printing the board
//        create function for the board(outside main function)
//    recreate same nested for loop to draw board
//    first loop iterates through each row i represents row
//    second loop loops through each column at each row i
//    next system print makes sure column and rows are on own line
    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.print(board[i][p]);
            }
            System.out.println();
        }
    }

    //    Create function to check for winner
//    need to check for row, diagonal, or column
    public static char hasWon(char[][] board) {
//    Row- create for loop to iterate through each row on board
//        if statement checks to see if adjacent positions are equal to each other
//        and make sure there arent 3 dashes in a row. then return winner
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

//        Column- create for loop to iterate through each column on board
////        if statement checks to see if adjacent positions are equal to each other
////        and make sure there arent 3 dashes in a row. then return winner
        for (int p = 0; p < 3; p++) {
            if (board[0][p] == board[1][p] && board[1][p] == board[2][p] && board[0][p] != '-') {
                return board[0][p];
            }
        }

//        Diagonals
//        top left to bottom right
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
//        bottom left to top right
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return board[2][0];
        }

// If nobody wins
        return '-';
    }

//    Check if the board is full (if it is a tie) by creating boolean function
//    after looping through the for loop and never finding empty space first return
//    wont happen. It will then hit the second return which is true resulting in a tie/full board
    public static boolean hasTied(char[][] board) {
        for(int i = 0; i < 3; i++) {
            for(int p = 0; p < 3; p++) {
                if(board[i][p] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}






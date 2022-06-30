package com.tictactoe.elements;

import com.tictactoe.winconditions.WinConditions;

import static com.tictactoe.elements.CharacterMove.cpuMove;
import static com.tictactoe.elements.CharacterMove.playerMove;

/**
 * Contains code for the gameBoard and its functioning.
 * This includes codes for generating the gameboard, {@link #printGameBoard(char[][])}
 * and the while loop for the {@link #gameStart()}. The {@link #gameStart()} gives the
 * user the option to input numbers (0 to 2) that selects the cell in the game.
 * The {@link #printGameBoard(char[][])} prints the gameBoard so the player can see his
 * selection as well as the cpu's selection.
 */


public class Board {
    //Fields
    private static char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},

    };


    public static void gameStart() {
        while (true) {
            playerMove(gameBoard);
            //printGameBoard(gameBoard);
            if (WinConditions.isGameOver(gameBoard)) {
                break;
            }
            cpuMove(gameBoard);
            printGameBoard(gameBoard);
            if (WinConditions.isGameOver(gameBoard)) {
                break;
            }
        }
    }


    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char g : row) {
                System.out.print(g);
            }
            System.out.println();
        }
    }

    //getter
    public static char[][] getGameBoard() {
        return gameBoard;
    }

}




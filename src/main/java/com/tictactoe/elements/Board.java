package com.tictactoe.elements;

import com.tictactoe.winconditions.WinConditions;

import java.io.IOException;

import static com.tictactoe.elements.CharacterMove.cpuMove;
import static com.tictactoe.elements.CharacterMove.playerMove;


public class Board {
    //Fields
    private static char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},

    };


    public static void gameStart() throws IOException {
        while (true) {
            playerMove(gameBoard);
            printGameBoard(gameBoard);
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




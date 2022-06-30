package com.tictactoe.elements;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.Random;
import java.util.Scanner;

/**
 * Manages moves of the gamers (cpu and player) form start of game to the finish.
 * Uses an instance of {@link Random} to generate cpu moves.Also uses an instance of
 * {@link java.io.BufferedReader} to help player input row and column numbers to select a cell.
 */
public class CharacterMove {

    public static void playerMove(char[][] gameBoard) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean playerTurn = true;

        while (playerTurn) {
            //ask the player for row and column inputs. Then the inputs will place an x on player directed location
            System.out.println("Enter a row number 0-2.");
            int playerInputRow = getCoordinate(reader);
            System.out.println("Enter a column number 0-2");
            int playerInputColumn = getCoordinate(reader);
            //Multiply by 2 so that the rows and columns aren't on board intersections
            int i = (playerInputRow * 2);
            int j = (playerInputColumn * 2);

            gameBoard[i][j] = 'X';
            playerTurn = false;
        }
    }

    public static void cpuMove(char[][] gameBoard) {
        Random cpuRand = new Random();
        int cpuMoveRow;
        int cpuMoveColumn;
        boolean cpuTurn = true;
        while (cpuTurn) {
            cpuMoveRow = (cpuRand.nextInt(3) * 2);
            cpuMoveColumn = (cpuRand.nextInt(3) * 2);
            if (gameBoard[cpuMoveRow][cpuMoveColumn] == ' ') {
                gameBoard[cpuMoveRow][cpuMoveColumn] = 'O';
                cpuTurn = false;
            }
        }
    }

    private static int getCoordinate(BufferedReader reader) throws IOException {
        while (true) {
            try {
                String input = reader.readLine().trim();
                int value = Integer.parseInt(input);
                if (value < 0 || value > 2) {
                    throw new IllegalArgumentException();
                }
                return value;
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry! Please input a numerical value between 0-2");
            }
        }
    }


}

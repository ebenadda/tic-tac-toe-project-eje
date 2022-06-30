package com.tictactoe.elements;

import org.w3c.dom.ls.LSOutput;

import java.security.KeyStore;
import java.util.Random;
import java.util.Scanner;

public class CharacterMove {
    public static void playerMove(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        boolean playerTurn = true;
        while (playerTurn) {
            //ask the player for row and column inputs. Then the inputs will place an x on player directed location
            System.out.println("Enter a row number 0-2.");
            int playerInputRow = scan.nextInt();
            System.out.println("Enter a column number 0-2");
            int playerInputColumn = scan.nextInt();
            //Multiply by 2 so that the rows and columns aren't on board intersections
            int i = (playerInputRow * 2);
            int j = (playerInputColumn * 2);
            // within range check
            if (playerInputRow < 0 || playerInputRow > 4 || playerInputColumn < 0 || playerInputColumn > 4) {
                System.out.println("Sorry! Please input 0-2");
            } else if (gameBoard[i][j] != ' ') {
                System.out.println("zone is not free!");
            } else {
                gameBoard[i][j] = 'X';
                playerTurn=false;
            }
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
}

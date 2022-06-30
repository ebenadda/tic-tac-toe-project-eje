/**
 * checks all possible winning combinations
 * Determines if winning move has been made and displays corresponding message to the players.
 */
package com.tictactoe.winconditions;

public class WinConditions {

    public static boolean isGameOver(char[][] gameBoard) {

        //TOP ROW ACROSS
        if (gameBoard[0][0] == 'X'
                && gameBoard[0][2] == 'X'
                && gameBoard[0][4] == 'X') {
            System.out.println("Player1 WINS!  TOP ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[0][2] == 'O'
                && gameBoard[0][4] == 'O') {
            System.out.println("computer WINS!  TOP ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        //  MIDDLE ROW ACROSS
        if (gameBoard[2][0] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[2][4] == 'X') {
            System.out.println("Player1 WINS! MIDDLE ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[2][0] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[2][4] == 'O') {
            System.out.println("Computer WINS!  MIDDLE ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        // BOTTOM ROW ACROSS
        if (gameBoard[4][0] == 'X'
                && gameBoard[4][2] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player1 WINS!  BOTTOM ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[4][0] == 'O'
                && gameBoard[4][2] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS!  BOTTOM ROW ACROSS!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        //LEFT COLUMN DOWN
        if (gameBoard[0][0] == 'X'
                && gameBoard[2][0] == 'X'
                && gameBoard[4][0] == 'X') {
            System.out.println("Player1 WINS!  LEFT COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[2][0] == 'O'
                && gameBoard[4][0] == 'O') {
            System.out.println("Computer WINS!  LEFT COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        //MIDDLE COLUMN DOWN
        if (gameBoard[0][2] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][2] == 'X') {
            System.out.println("Player 1 WINS!  MIDDLE COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][2] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][2] == 'O') {
            System.out.println("Computer WINS!  MIDDLE COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        //RIGHT COLUMN DOWN
        if (gameBoard[0][4] == 'X'
                && gameBoard[2][4] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player 1 WINS!  RIGHT COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][4] == 'O'
                && gameBoard[2][4] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS!  RIGHT COLUMN DOWN!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        // DIAGONAL LEFT TO RIGHT
        if (gameBoard[0][0] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player 1 WINS!  DIAGONAL LEFT TO RIGHT!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS!  DIAGONAL LEFT TO RIGHT");
            Board.printGameBoard(gameBoard);
            return true;
        }
        // DIAGONAL RIGHT TO LEFT
        if (gameBoard[0][4] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][0] == 'X') {
            System.out.println("Player 1 WINS!  DIAGONAL RIGHT TO LEFT!");
            Board.printGameBoard(gameBoard);
            return true;
        }
        if (gameBoard[0][4] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][0] == 'O') {
            System.out.println("Computer WINS!  DIAGONAL RIGHT TO LEFT!");
            Board.printGameBoard(gameBoard);
            return true;
        }

        if (gameBoard[0][0] != ' '
                && gameBoard[0][2] != ' '
                && gameBoard[0][4] != ' '
                && gameBoard[2][0] != ' '
                && gameBoard[2][2] != ' '
                && gameBoard[2][4] != ' '
                && gameBoard[4][0] != ' '
                && gameBoard[4][2] != ' '
                && gameBoard[4][4] != ' ') {
            System.out.println("CAT'S GAME!! TRY AGAIN, YOU COULD WIN THIS TIME! :)");
        }
        return false;
    }
}

import java.util.Scanner;

public class Board {
    /**
     * @param args
     */

    //TODO Reoganize so that methods are more cohesive and coupling is reduced as much as possible

    /**
     * This method prints out the gameboard
     * It also contains positions for the cells in the game board.
     * @param args
     */

    //TODO move gameBoard cell positions to a new class or method
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},

        };
        printGameBoard(gameBoard);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your placement (1 - 9)");
        int position = scanner.nextInt();

        System.out.println(position);

        //TODO Move this out of the main method into the Board class
        // TODO determine when computer can play
        // TODO determine when human can play

        switch (position) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][2] = 'X';
                break;
            case 3:
                gameBoard[0][4] = 'X';
                break;
            case 4:
                gameBoard[2][0] = 'X';
                break;
            case 5:
                gameBoard[2][2] = 'X';
                break;
            case 6:
                gameBoard[2][4] = 'X';
                break;
            case 7:
                gameBoard[4][0] = 'X';
                break;
            case 8:
                gameBoard[4][2] = 'X';
                break;
            case 9:
                gameBoard[4][4] = 'X';
                break;
        }
    }

    /**
     * THis method prints out the gameBoard.
     * @param gameBoard
     */
    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char g : row) {
                System.out.print(g);
            }
            System.out.println();
        }
    }

    public static void putGamePiece(char[][] gameBoard, int postion, String player) {


    }

}




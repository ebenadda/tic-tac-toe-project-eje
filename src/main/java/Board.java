
import java.util.Random;
import java.util.Scanner;


public class Board {
    //fields

    int i;
    int j;

//    int cpuMoveRow;
//    int cpuMoveColumn;


    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},

        };
        printGameBoard(gameBoard);
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

    private static void playerMove(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        while (true) {
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
                System.out.println("Sorry! Please choose between 0-2");
            } else if (gameBoard[i][j] != ' ') {
                System.out.println("zone is not free!");
            } else {
                gameBoard[i][j] = 'X';
                break;
            }
        }
    }

    private static void cpuMove(char[][] gameBoard) {
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


    // trying to make freezone a boolean to be called in order to have cleaner code
    public boolean isFreeZone(char[][] gameBoard) {
        return gameBoard[i][j] == ' ';
    }

    public static boolean filledBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char g : row) {
                System.out.print(g);
            }
            System.out.println();
        }
    }

    //getters and setters will be used when moving moves to standalone class
//    public int getCpuMoveRow() {
//        return cpuMoveRow;
//    }
//
//    public void setCpuMoveRow(int cpuMoveRow) {
//        this.cpuMoveRow = cpuMoveRow;
//    }
//
//    public int getCpuMoveColumn() {
//        return cpuMoveColumn;
//    }
//
//    public void setCpuMoveColumn(int cpuMoveColumn) {
//        this.cpuMoveColumn = cpuMoveColumn;
//    }


}




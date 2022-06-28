import java.util.Scanner;

public class Board {
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

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char g : row) {
                System.out.print(g);
            }
            System.out.println();
        }
    }
}




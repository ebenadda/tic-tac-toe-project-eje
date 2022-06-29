

public class WinConditions {


    public static boolean isGameOver(char[][] gameBoard) {

        if (gameBoard[0][0] == 'X'
                && gameBoard[0][2] == 'X'
                && gameBoard[0][4] == 'X') {
            System.out.println("Player1 WINS!");
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[0][2] == 'O'
                && gameBoard[0][4] == 'O') {
            System.out.println("computer WINS!");
            return true;
        }
        if (gameBoard[1][0] == 'X'
                && gameBoard[1][2] == 'X'
                && gameBoard[1][4] == 'X') {
            System.out.println("Player1 WINS!");
            return true;
        }
        if (gameBoard[1][0] == 'O'
                && gameBoard[1][2] == 'O'
                && gameBoard[1][4] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }
        if (gameBoard[2][0] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[2][4] == 'X') {
            System.out.println("Player1 WINS!");
            return true;
        }
        if (gameBoard[2][0] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[2][4] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }
        if (gameBoard[0][0] == 'X'
                && gameBoard[1][0] == 'X'
                && gameBoard[2][0] == 'X') {
            System.out.println("Player1 WINS!");
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[1][0] == 'O'
                && gameBoard[2][0] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }
        if (gameBoard[0][2] == 'X'
                && gameBoard[1][2] == 'X'
                && gameBoard[2][2] == 'X') {
            System.out.println("Player1 WINS");
            return true;
        }
        if (gameBoard[0][2] == 'O'
                && gameBoard[1][2] == 'O'
                && gameBoard[2][2] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }
        if (gameBoard[0][4] == 'X'
                && gameBoard[1][4] == 'X'
                && gameBoard[2][4] == 'X') {
            System.out.println("Player1 WINS");
            return true;
        }
        if (gameBoard[0][4] == 'O'
                && gameBoard[1][4] == 'O'
                && gameBoard[2][4] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }
        if (gameBoard[0][0] == 'X'
                && gameBoard[1][2] == 'X'
                && gameBoard[2][4] == 'X') {
            System.out.println("Player1 WINS");
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[1][2] == 'O'
                && gameBoard[2][4] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }
        if (gameBoard[2][0] == 'X'
                && gameBoard[1][2] == 'X'
                && gameBoard[0][4] == 'X') {
            System.out.println("Player1 WINS");
            return true;
        }
        if (gameBoard[2][0] == 'O'
                && gameBoard[1][2] == 'O'
                && gameBoard[0][4] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }
        if (gameBoard[0][0] != '_'
                && gameBoard[0][2] != '_'
                && gameBoard[0][4] != '_'
                && gameBoard[1][0] != '_'
                && gameBoard[1][2] != '_'
                && gameBoard[1][4] != '_'
                && gameBoard[2][0] != ' '
                && gameBoard[2][2] != ' '
                && gameBoard[0][4] != ' ') {
            System.out.println("CAT'S GAME!!");
        }
        return false;
    }
}

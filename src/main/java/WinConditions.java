
public class WinConditions {

    public static boolean isGameOver(char[][] gameBoard) {

        //TOP ROW ACROSS
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

        //  MIDDLE ROW ACROSS
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
        // BOTTOM ROW ACROSS
        if (gameBoard[4][0] == 'X'
                && gameBoard[4][2] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player1 WINS!");
            return true;
        }
        if (gameBoard[4][0] == 'O'
                && gameBoard[4][2] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }

        //LEFT COLUMN DOWN
        if (gameBoard[0][0] == 'X'
                && gameBoard[2][0] == 'X'
                && gameBoard[4][0] == 'X') {
            System.out.println("Player1 WINS");
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[2][0] == 'O'
                && gameBoard[4][0] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }

        //MIDDLE COLUMN DOWN
        if (gameBoard[0][2] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][2] == 'X') {
            System.out.println("Player 1 WINS!");
            return true;
        }
        if (gameBoard[0][2] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][2] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }

        //RIGHT COLUMN DOWN
        if (gameBoard[0][4] == 'X'
                && gameBoard[2][4] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player 1 WINS!");
            return true;
        }
        if (gameBoard[0][4] == 'O'
                && gameBoard[2][4] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS!");
            return true;
        }

        // DIAGONAL LEFT TO RIGHT
        if (gameBoard[0][0] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][4] == 'X') {
            System.out.println("Player 1 WINS!");
            return true;
        }
        if (gameBoard[0][0] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][4] == 'O') {
            System.out.println("Computer WINS");
            return true;
        }
        // DIAGONAL RIGHT TO LEFT
        if (gameBoard[0][4] == 'X'
                && gameBoard[2][2] == 'X'
                && gameBoard[4][0] == 'X') {
            System.out.println("Player 1 WINS!");
            return true;
        }
        if (gameBoard[0][4] == 'O'
                && gameBoard[2][2] == 'O'
                && gameBoard[4][0] == 'O') {
            System.out.println("Computer WINS!");
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
            System.out.println("CAT'S GAME!!");
        }
        return false;
    }
}

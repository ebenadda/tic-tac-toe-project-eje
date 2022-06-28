import java.util.Scanner;


//NEED TO CREATE PACKAGES TO IMPORT FROM OTHER CLASSES
public class Strategy {
    //decides where to mark the new position on the board

    static Scanner input = new Scanner(System.in);


    public static void playerMove(char[][] gameBoard) {
        System.out.printf(PLAY_STATE, player1);;

        int move = input.nextInt();
        boolean result = isValidMove(move, gameBoard);

        while(!result) {
            System.out.printf(ILLEGAL_MOVE);;
            move = input.nextInt();
            result = isValidMove(move, gameBoard);
        }


    }

}

package com.tictactoe.client;

import com.tictactoe.elements.Board;

/**
 * This is the entry point for the <Strong>"TicTacToe"</Strong> game.
 */
public class TicTacToeClient {
    public static void main(String[] args) {
        System.out.println("\nTIC-TAC-TOE");
        System.out.println("Made by:\n" +
                "Ebenezer Addae\n" +
                "Eric Flores\n" +
                "Jay Flowers\n\n");

        Board.gameStart();
    }
}

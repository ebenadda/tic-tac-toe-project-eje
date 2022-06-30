package com.tictactoe.client;

import com.tictactoe.elements.Board;

import java.io.IOException;

/**
 * This is the entry point for the <Strong>"TicTacToe"</Strong> game.
 */

public class TicTacToeClient {
    public static void main(String[] args) throws IOException {
        System.out.println("\nTIC-TAC-TOE");
        System.out.println("Made by:\n" +
                "Ebenezer Addae\n" +
                "Eric Flores\n" +
                "Jay Flowers\n\n");

        Board.gameStart();
    }
}

package com.tictactoe.client;

import com.tictactoe.elements.Board;

import java.io.IOException;


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

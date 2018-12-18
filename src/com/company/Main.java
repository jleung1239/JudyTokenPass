package com.company;

public class Main {

    public static void main(String[] args) {
	// create a testGame using the constructor
        TokenPass testGame = new TokenPass(10);
        //print the board
        int [] testBoard = testGame.getBoard();
        System.out.println("Constructed a testBoard:");
        for (int i = 0 ; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();
        //now test distributecurrentplayertokens
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player " +testGame.getCurrentPlayer()+": ");
        for (int i = 0 ; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i]+ " ");
        }
    }
}

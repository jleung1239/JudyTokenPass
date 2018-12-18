package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        this.board = new int[playerCount];
        this.currentPlayer = (int) (Math.random() * (playerCount));
        for (int i = 0; i < board.length ; i++){
            board[i] = (int)( Math.random() * 10);
        }

    }

    public void distributeCurrentPlayerTokens()
    {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int i = currentPlayer;
        while (tokens > 0){
            if (i == board.length-1){
                i = 0;
            }
            else
            {
                i++;
            }
            board[i] += 1;
            tokens--;
        }
    }

    public int[] getBoard()
    {
        return board;
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }

}

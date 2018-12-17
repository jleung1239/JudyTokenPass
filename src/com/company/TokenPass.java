package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        int [] board = new int[playerCount];
        int currentPlayer = (int) (Math.random() * (playerCount - 1));
        for (int i = 0; i < board.length ; i++){
            board[i] = (int)( Math.random() * 10);
        }

    }

    public void distributeCurrentPlayerTokens() {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int i = currentPlayer;
        while (tokens > 0){
            if (i == board.length){
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

}

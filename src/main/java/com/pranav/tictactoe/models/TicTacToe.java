package com.pranav.tictactoe.models;

enum GameStatus {
    IN_PROGRESS,
    FINISHED
}
public class TicTacToe {
    private String[][] board;
    private String currentPlayer;
    private String winner;
    private boolean isGameOver;
    private int n;

    public TicTacToe(int n) {
        this.board = new String[n][n];
        this.currentPlayer = "X";
        this.winner = null;
        this.isGameOver = false;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
}

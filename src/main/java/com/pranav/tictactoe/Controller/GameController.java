package com.pranav.tictactoe.Controller;

import com.pranav.tictactoe.exceptions.InvalidException;
import com.pranav.tictactoe.models.*;
import com.pranav.tictactoe.stratergies.WinningAlgorithm;

import java.util.*;
import java.util.ArrayList;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        //TODO
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}

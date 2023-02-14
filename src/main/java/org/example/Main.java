package org.example;

import org.example.Service.GameService;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.initializeGame();
    }
}
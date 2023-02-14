package org.example.Service;

import org.example.Model.Card;
import org.example.Model.Player;

import java.util.List;

public class GameService {

    public void initializeGame(){
        PlayerService playerService = new PlayerService();
        CardService cardService = new CardService();
        System.out.println("Loading players...");
        List<Player> players = playerService.initializePlayers();
        //players.forEach(it -> System.out.println("Player: " + it.getId()));
        System.out.println("Shuffling deck...");
        List<Card> deck = cardService.createDeck();
//        System.out.println("[DEBUG] Cards in deck: " + deck.size());
        //deck.forEach(it -> System.out.println(it.toString(it)));
        System.out.println("Dealing cards...");
        deck = cardService.dealCards(players, deck);
        //System.out.println("[DEBUG] Cards left in deck: " + deck.size());
    }

}

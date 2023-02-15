package org.example.Service;

import org.example.Model.Card;
import org.example.Model.Player;
import org.example.Model.Team;

import java.util.Arrays;
import java.util.List;

public class GameService {

    public void initializeGame(){
        PlayerService playerService = new PlayerService();
        CardService cardService = new CardService();
        System.out.println("Loading players...");
        List<Player> players = playerService.initializePlayers();
        Team team1 = new Team(Arrays.asList(players.get(0), players.get(1)), "team1");
        Team team2 = new Team(Arrays.asList(players.get(2), players.get(3)), "team2");
        System.out.println("Shuffling deck...");
        List<Card> deck = cardService.createDeck();
//        System.out.println("[DEBUG] Cards in deck: " + deck.size());
        //deck.forEach(it -> System.out.println(it.toString(it)));
        System.out.println("Dealing cards...");
        deck = cardService.dealCards(players, deck);

        players.forEach(Player::printCardsInHand);
        //System.out.println("[DEBUG] Cards left in deck: " + deck.size());
    }

}

package org.example.Service;

import org.example.Model.Card;
import org.example.Model.CardRank;
import org.example.Model.Player;
import org.example.Model.Suits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardService {

    public List<Card> createDeck(){
        List<Card> deckOfCards = new ArrayList<>();
        List<CardRank> cardRanksWithSuits = new ArrayList<>(List.of(CardRank.values()));
        removeJokersAndOffJack(cardRanksWithSuits);
        for (Suits suit : Suits.values()) {
            for (CardRank rank : cardRanksWithSuits) {
                deckOfCards.add(new Card(suit, rank, CardRank.getPointValue(rank)));
            }
        }
        addJokersToDeck(deckOfCards);
        return shuffle(deckOfCards);
    }

    public List<Card> dealCards(List<Player> players, List<Card> cards){
        for(Player player : players){
            player.setCardsInHand(cards.stream().limit(9).collect(Collectors.toList()));
            cards.subList(0, 9).clear(); //remove used cards from list
//            System.out.println("[DEBUG] Player " + player.getId() + " cards:");
//            player.getCardsInHand().forEach(it -> System.out.println(it.toString(it)));
//            System.out.println("[DEBUG] Cards remaining: " + cards.size());
        }
        return cards;
    }

    public List<Card> shuffle(List<Card> cards){
        Collections.shuffle(cards);
        return cards;
    }

    private void removeJokersAndOffJack(List<CardRank> cardRanks){
        cardRanks.remove(CardRank.LOW_JOKER);
        cardRanks.remove(CardRank.HIGH_JOKER);
        cardRanks.remove(CardRank.OFF_JACK);
    }

    private void addJokersToDeck(List<Card> deck){
        deck.add(new Card(null, CardRank.LOW_JOKER, CardRank.getPointValue(CardRank.LOW_JOKER)));
        deck.add(new Card(null, CardRank.HIGH_JOKER, CardRank.getPointValue(CardRank.HIGH_JOKER)));
    }

}

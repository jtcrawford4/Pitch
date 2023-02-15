package org.example.Model;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Player {
    private final int id;
    private List<Card> cardsInHand;

    public Player(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public List<Card> getCardsInHand() {
        return cardsInHand;
    }
    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
    public void printCardsInHand(){
        if(!CollectionUtils.isEmpty(cardsInHand)){
            System.out.println("Player " + getId() + " cards:");
            cardsInHand.forEach(it -> {
                String cardSymbol = Suits.getSuitSymbol(it.getSuit());
                String cardValue = CardRank.getStringValue(it.getRank());
                String pointValue = String.valueOf(it.getPointValue());
                System.out.println(cardValue + cardSymbol + " (" + pointValue + ")");
            });
        }else{
            System.out.println("No cards in player's hand");
        }
    }
}

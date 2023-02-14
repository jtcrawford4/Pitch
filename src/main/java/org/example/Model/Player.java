package org.example.Model;

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

}

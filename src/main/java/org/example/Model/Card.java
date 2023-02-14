package org.example.Model;

import java.util.StringJoiner;

public class Card {
    private Suits suit;
    private CardRank rank;
    private int pointValue;

    public Card (Suits suit, CardRank rank, int pointValue){
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }
    public Suits getSuit() {
        return suit;
    }
    public void setSuit(Suits suit) {
        this.suit = suit;
    }
    public CardRank getRank() {
        return rank;
    }
    public void setRank(CardRank rank) {
        this.rank = rank;
    }
    public int getPointValue() {
        return pointValue;
    }
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    public String toString(Card card){
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("SUIT: " + (card.getSuit() != null ? card.getSuit().toString() : "NO SUIT"));
        joiner.add(" Value: " + card.getRank().toString());
        joiner.add(" Points: " + String.valueOf(card.getPointValue()));
        return joiner.toString();
    }

}

package org.example.Model;

public enum CardRank {
    //TWO(2),
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    LOW_JOKER,
    HIGH_JOKER,
    OFF_JACK,
    JACK,
    QUEEN,
    KING,
    ACE;

    //CardRank(int i) {
    //}
    public static int getPointValue(CardRank rank){
        switch(rank){
            case THREE:
                return 3;
            case ACE:
            case JACK:
            case OFF_JACK:
            case HIGH_JOKER:
            case LOW_JOKER:
            case TEN:
            case TWO:
                return 1;
            default:
                return 0;
        }
    }

}

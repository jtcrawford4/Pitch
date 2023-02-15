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

    public static String getStringValue(CardRank rank){
        switch(rank){
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case TEN:
                return "10";
            case LOW_JOKER:
                return "LJ";
            case HIGH_JOKER:
                return "HJ";
            case JACK:
                return "J";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            case ACE:
                return "A";
            default:
                return "XX";
        }
    }

}

package org.example.Model;

public enum Suits {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;

    public static String getSuitSymbol(Suits suit){
        if(suit == null){return "_";}
        switch(suit){
            case CLUBS:
                return "\u2663";
            case HEARTS:
                return "\u2665";
            case SPADES:
                return "\u2660";
            case DIAMONDS:
                return "\u2666";
            default:
                return "_";
        }
    }

}

package qa.emp;

import java.util.HashMap;

public class Deck {
    public static int hello = 0;
    private String suit;
    private String rank;

    public String getSuit() {
        return rank + " of " + suit;
    }

    public Deck(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    static class collectorClass{
        int y = 5;
    }

}

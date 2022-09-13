package qa.emp;

import java.util.HashMap;

public class Deck {

    private String suit;
    private String rank;

    public String getSuit() {
        return rank + " of " + suit;
    }

    public Deck(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

}

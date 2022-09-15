package qa.emp;

import java.util.ArrayList;

public class CardTest {
    Suit suit;
    Rank rank;
    public CardTest(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return this.suit.toString() + " " + this.rank.toString();
    }

    public static void main(String[] args) {
        for (Suit suit1 : Suit.values()) {
            for (Rank rank1: Rank.values()) {
                System.out.println(new CardTest(suit1, rank1).getSuit());
            }
        }
    }


}

import java.util.Stack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class decklist {
    public static void main(String[] args) {

        ArrayList<Card> shuffler = new ArrayList<Card>();
        String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
                "King " };

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card();
                card.suit = suits[i];
                card.rank = ranks[j];
                shuffler.add(card);
            }
        }

        Collections.shuffle(shuffler);

        Stack<Card> deck = new Stack<Card>();
        for (Card card : shuffler) {
            deck.push(card);
        }

        while (!deck.isEmpty()) {
            Card card = deck.pop();
            System.out.println(card.rank + " of " + card.suit);
        }
    }
}

class Card {
    String suit;
    String rank;
}

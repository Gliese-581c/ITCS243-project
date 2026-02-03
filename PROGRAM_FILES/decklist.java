import java.util.Stack;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Card {
    String suit;
    String rank;
}

public class decklist {
    public static void main(String[] args) {
        deckParts();
    }

    public static void deckParts() {

        // initializes the deckbuilding materials
        ArrayList<Card> shuffler = new ArrayList<Card>();
        Stack<Card> deck = new Stack<Card>();
        String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
                "King " };

        // builds 52 new card objects and adds each to the shuffler
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card();
                card.suit = suits[i];
                card.rank = ranks[j];
                shuffler.add(card);
            }
        }
        
            //calls the deckbuilder method
        deckbuilder(shuffler, deck);

    }

    public static void deckbuilder(ArrayList<Card> shuffler, Stack<Card> deck) {

        Collections.shuffle(shuffler);

        // adds cards into deck stack
        for (Card card : shuffler) {
            deck.push(card);
        }

        /*
         // Print statement I used for testing
         while (!deck.isEmpty()) {
         Card card = deck.pop();
         System.out.println(card.rank + " of " + card.suit);
         }
         */

    }
}



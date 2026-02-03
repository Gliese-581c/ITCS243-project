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
        ArrayList<Card> shuffler =arrayBuilder();
        shuffler = cardBuilder(shuffler);
        Stack<Card> deck = new Stack<Card>();
        deck = deckbuilder(shuffler, deck);
        
         // Print statement I used for testing
         while (!deck.isEmpty()) {
         Card card = deck.pop();
         System.out.println(card.rank + " of " + card.suit);
         }
        
    }

    public static ArrayList<Card> arrayBuilder() {
        // initializes the deckbuilding arraylist
        ArrayList<Card> shuffler = new ArrayList<Card>();
        return shuffler;
    }

    public static ArrayList<Card> cardBuilder(ArrayList<Card> shuffler) {
        // builds 52 new card objects and adds them to the arraylist
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
        return shuffler;
    }

    //converts a stack back into an arraylist, to be passed back into the deckbuilder
    public static ArrayList<Card> deckrebuilder(Stack<Card> deck) {
        ArrayList<Card> shuffler = new ArrayList<Card>();
        while (!deck.isEmpty()) {
            Card card = deck.pop();
            shuffler.add(card);
        }
        return shuffler;
    }

    public static Stack<Card> deckbuilder(ArrayList<Card> shuffler, Stack<Card> deck) {

        Collections.shuffle(shuffler);

        // adds cards into deck stack
        for (Card card : shuffler) {
            deck.push(card);
        }
        return deck;
    }
}



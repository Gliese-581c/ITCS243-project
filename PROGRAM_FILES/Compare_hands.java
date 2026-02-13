import java.util.ArrayList;

public class Compare_hands {
    public static void main(String[] args) {
        ArrayList<card> hand1 = new ArrayList<card>();
        for (int i = 0; i < 5; i++) {
            hand1.add(new card());
        }
        System.out.println("hand 1: " + hand1);

    }

    public void define_hands() {
        // royal flush

        // straight flush

        // four of a kind

        // three of a kind

        // full house

        // flush

        // straight

        // two pair

        // one pair

        // high card
    }
}

class Card {
    String suit;
    String rank;
}

class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();
    String name;
}
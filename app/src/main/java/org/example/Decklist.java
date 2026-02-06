package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Card {
    String suit;
    String rank;
    String[] detailsTop;
    String[] detailsBottom;
}

public class Decklist {
    public static void main(String[] args) {
        ArrayList<Card> shuffler = arrayBuilder();
        shuffler = cardBuilder(shuffler);
        Stack<Card> deck = new Stack<Card>();
        deck = deckbuilder(shuffler, deck);

        // Print statement I used for testing
        while (!deck.isEmpty()) {
            Card card = deck.pop();
            System.out.println(card.rank + " of " + card.suit);
        }

        // It ignores shuffler, replace it with 'hand' when that's ready
        displayHand(shuffler);
    }

    public static ArrayList<Card> arrayBuilder() {
        // initializes the deckbuilding arraylist
        ArrayList<Card> shuffler = new ArrayList<Card>();
        return shuffler;
    }

    public static ArrayList<Card> cardBuilder(ArrayList<Card> shuffler) {
        // builds 52 new card objects and adds them to the arraylist
        // String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] suits = { "♥", "♠", "♦", "♣" };
        String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K " };
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card();
                card.suit = suits[i];
                card.rank = ranks[j];
                if (ranks[j].equals("10")) {
                    card.detailsTop = new String[] { "|", ranks[j], " ", suits[i], "|", " " };
                    card.detailsBottom = new String[] { "|", suits[i], " ", ranks[j], "|", " " };
                } else {
                card.detailsTop = new String[] { "|", ranks[j], "  ", suits[i], "|", " " };
                card.detailsBottom = new String[] { "|", suits[i], "  ", ranks[j], "|", " " };
                }
                shuffler.add(card);
            }
        }
        return shuffler;
    }

    // converts a stack back into an arraylist, to be passed back into the deckbuilder
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

    public static void displayHand(ArrayList<Card> hand) {
        // Displays the hand of cards in a 6x6 grid format
        String cardTop = "┌────┐ ";
        String cardMiddle = "│    │ ";
        String cardBottom = "└────┘ ";

        
        // Display five randoms for now ################
        hand.clear();
        ArrayList<Card> tempshuffler = arrayBuilder();
        tempshuffler = cardBuilder(tempshuffler);
        Stack<Card> tempdeck = new Stack<Card>();
        tempdeck = deckbuilder(tempshuffler, tempdeck);
        for (int i = 0; i < 5; i++) {
            Card card = tempdeck.pop();
            hand.add(card);
        }
        // #############################################


        // It goes line by line like a printer
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.print(cardTop);
        }
        System.out.println();

        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.print(card.detailsTop[0] + card.detailsTop[1] + card.detailsTop[2]
                    + card.detailsTop[3] + card.detailsTop[4] + card.detailsTop[5]);
        }
        System.out.println();

        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.print(cardMiddle);
        }
        System.out.println();

        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.print(card.detailsBottom[0] + card.detailsBottom[1] + card.detailsBottom[2]
                    + card.detailsBottom[3] + card.detailsBottom[4] + card.detailsBottom[5]);
        }
        System.out.println();

        for (int i = 0; i < hand.size(); i++) {
            System.out.print(cardBottom);
        }
        System.out.println();
    }
}
package com.masterclass.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        // Arrays.fill method which has a similar implementation on Collections class too
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        // Collections.fill
        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("Size of cards: ---> " + cards.size());

        // Collections.nCopies
        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClub = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClub);
        Card.printDeck(kingsOfClubs, "Aces of Hearts", 1);

        // Collections.addAll
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Cards Collection with Aces added", 1);

        // Collections.copy -> (dest, source) source.size must be less than equal to dest.size
        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Cards Collection with king copied", 1);

    }
}

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

        // Collections.shuffle method
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        // Collections.reverse method
        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Shuffled deck", 4);

        // Collections.sort is same as list.sort as internally implements the same
        var sortingAlgo = Comparator.comparing(Card::rank).thenComparing(Card::rank);
        Collections.sort(deck,sortingAlgo);
        Card.printDeck(deck, "Sorted Deck by rank and suit", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted Deck reversed by rank and suit", 4);

        // Collectins.subList method
        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens, "tens in deck", 1);

        // Collections.indexOfSubList
        int indexOfTens = Collections.indexOfSubList(deck, tens);
        System.out.println("index of tens in deck: "+ indexOfTens);
        System.out.println("deck contains tens: "+ deck.containsAll(tens));

        // Collections.disjoint
        boolean disjoint = Collections.disjoint(deck,tens);
        System.out.println("Tens is disjoint with deck: " +disjoint);

        boolean disjoint2 = Collections.disjoint(kings,tens);
        System.out.println("Tens is disjoint with deck: " +disjoint2);
    }
}

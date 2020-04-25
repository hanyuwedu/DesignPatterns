package behavioral.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
//        deckTestIterable();

//        selectTestIterable();
//        selectTestIterator();

//        countTestIterable();
//        countTestIterator();

//        mergeTestIterable();
        mergeTestIterator();
    }


    private static void deckTest() {
        Deck deck1 = new Deck(1);
        deck1.show();

        Deck deck2 = new Deck(2);
        deck2.show();
    }

    private static void selectTestIterable() {
        Deck deck = new Deck(1);
        Set<Card> fourCards = Houdini.select(4, deck);
        for (Card card : fourCards) {
            System.out.print(card.toString());
        }
        System.out.println();
        System.out.println();

        Set<Card> sixCards = Houdini.select(6, deck);
        for (Card card : sixCards) {
            System.out.print(card.toString());
        }
        System.out.println();
        System.out.println();
    }

    private static void selectTestIterator() {
        Deck deck = new Deck(1);
        Iterator<Card> iterator = new DeckIterator(deck);
        Set<Card> fourCards = Dynamo.select(4, iterator);
        for (Card card : fourCards) {
            System.out.print(card.toString());
        }
        System.out.println();
        System.out.println();

        Set<Card> sixCards = Dynamo.select(6, iterator);
        for (Card card : sixCards) {
            System.out.print(card.toString());
        }
        System.out.println();
        System.out.println();
    }

    private static void countTestIterable() {
        Deck deck = new Deck(1);
        Set<Card> fourCards = Houdini.select(4, deck);
        for (Card card : fourCards) {
            System.out.print(card.toString());
        }
        System.out.println();

        System.out.println(Houdini.countSuite(Suite.HEART, fourCards));
        System.out.println(Houdini.countSuite(Suite.CLUB, deck));
    }

    private static void countTestIterator() {
        Deck deck = new Deck(1);
        Iterator<Card> iterator = new DeckIterator(deck);

        Set<Card> fourCards = Dynamo.select(4, iterator);
        for (Card card : fourCards) {
            System.out.print(card.toString());
        }
        System.out.println();

        System.out.println(Dynamo.countSuite(Suite.HEART, fourCards.iterator()));
        System.out.println(Dynamo.countSuite(Suite.CLUB, new DeckIterator(deck)));  // Remeber to use a new Iterator
    }


    private static void mergeTestIterable() {
        Deck deck = new Deck(1);
        Set<Card> fourCards = Houdini.select(4, deck);
        Set<Card> sixCards = Houdini.select(6, deck);

        Stack<Card> mergedCards = Houdini.merge(fourCards, sixCards);
        System.out.println("There are " + mergedCards.size() + " cards in the merged deck:");

        for (Card card : mergedCards) {
            System.out.print(card.toString());
            System.out.print("  ");
        }
    }

    private static void mergeTestIterator() {
        Deck deck = new Deck(1);

        Set<Card> fourCards = Dynamo.select(4, new DeckIterator(deck));
        Set<Card> sixCards = Dynamo.select(6, new DeckIterator(deck));

        Stack<Card> mergedCards = Dynamo.merge(fourCards.iterator(), sixCards.iterator());
        System.out.println("There are " + mergedCards.size() + " cards in the merged deck:");

        for (Card card : mergedCards) {
            System.out.print(card.toString());
            System.out.print("  ");
        }
    }
}

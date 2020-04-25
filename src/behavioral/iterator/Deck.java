package behavioral.iterator;

import java.util.Iterator;
import java.util.Stack;

public class Deck implements Iterable<Card> {
    Stack<Card> cards;

    public Deck(int packs) {
        this.cards = new Stack<>();
        for (int p = 1; p <= packs; p++) {
            for (Point point : Point.values()) {
                for (Suite suite : Suite.values()) {
                    Card card = new Card(suite, point);
                    this.cards.push(card);
                }
            }
        }
    }

    public Stack<Card> getCards() {
        return this.cards;
    }

    public void show() {
        System.out.println("There are " + this.cards.size() + " cards left in the deck:");
        for (Card card : cards) {
            System.out.print(card.toString());
            System.out.print("   ");
        }
        System.out.println();
    }

    @Override
    public Iterator<Card> iterator() {
        return cards.iterator();
    }
}

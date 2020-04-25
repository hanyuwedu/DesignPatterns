package behavioral.iterator;

import java.util.*;

/**
 * Create by Iterable
 */
public class Houdini {
    public static int countSuite(Suite suite, Iterable<Card> cards) {
        int count = 0;
        Iterator<Card> deckIterator = cards.iterator();
        while (deckIterator.hasNext()) {
            Card card = deckIterator.next();
            if (card.getSuite().equals(suite)) {
                count++;
            }
        }

        return count;
    }

    public static Set<Card> select(int count, Iterable<Card> cards) {
        Set<Card> selected = new HashSet<>();   // Magicians cannot use duplicate cards
        Iterator<Card> iterator = cards.iterator();

        while(selected.size() < count && iterator.hasNext()) {
            selected.add(iterator.next());
        }

        return selected;
    }

    public static Stack<Card> merge(Iterable<Card> cards_0, Iterable<Card> cards_1) {
        Iterator<Card> iterator_0 = cards_0.iterator();
        Iterator<Card> iterator_1 = cards_1.iterator();
        Stack<Card> cardsMerged = new Stack<>();

        while (iterator_0.hasNext()) {
            cardsMerged.add(iterator_0.next());
        }

        while (iterator_1.hasNext()) {
            cardsMerged.add(iterator_1.next());
        }

        return cardsMerged;
    }
}

package behavioral.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/**
 * Create by Iterator
 */
public class Dynamo {
    public static int countSuite(Suite suite, Iterator<Card> deckIterator) {
        int count = 0;
        while (deckIterator.hasNext()) {
            Card card = deckIterator.next();
            if (card.getSuite().equals(suite)) {
                count++;
            }
        }

        return count;
    }

    public static Set<Card> select(int count, Iterator<Card> deckIterator) {
        Set<Card> selected = new HashSet<>();   // Magicians cannot use duplicate cards

        while(selected.size() < count && deckIterator.hasNext()) {
            selected.add(deckIterator.next());
        }

        return selected;
    }

    public static Stack<Card> merge(Iterator<Card> iterator_0, Iterator<Card> iterator_1) {
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

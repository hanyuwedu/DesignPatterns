package behavioral.iterator;

import java.util.*;

public class DeckIterator implements Iterator<Card> {
    List<Card> cards;
    int index = 0;

    public DeckIterator(Deck deck) {
        this.cards = new ArrayList<>();
        cards.addAll(deck.getCards());
        Collections.shuffle(cards);
    }

    @Override
    public boolean hasNext() {
        return index < cards.size();
    }

    @Override
    public Card next() {
        return cards.get(index++);
    }
}

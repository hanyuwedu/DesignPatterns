package structural.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<Title> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Title next() {
        return null;
    }
}

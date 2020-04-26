package structural.composite;

import java.util.Iterator;
import java.util.Stack;

public class TitlePreorderIterator implements Iterator<Title> {
    Stack<Title> stack;

    public TitlePreorderIterator(Title title) {
        this.stack = new Stack<>();
        this.stack.push(title);
    }

    @Override
    public boolean hasNext() {
        return !this.stack.isEmpty();
    }

    @Override
    public Title next() {
        Title current = stack.pop();
        if (current.getReportsList() != null && !current.getReportsList().isEmpty()) {
            for (Title report : current.getReportsList()) {
                stack.add(report);
            }
        }

        return current;
    }
}

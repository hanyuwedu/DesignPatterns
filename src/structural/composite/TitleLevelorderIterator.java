package structural.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TitleLevelorderIterator implements Iterator<Title> {
    Queue<Title> queue;

    public TitleLevelorderIterator(Title title) {
        this.queue = new LinkedList<>();
        queue.add(title);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Title next() {
        Title current = queue.remove();
        if (current.getReportsList() != null && !current.getReportsList().isEmpty()) {
            for (Title report : current.getReportsList()) {
                queue.add(report);
            }
        }

        return current;     // 我还没有意识到level order和preorder这么类似，仅仅有数据结构的不同而已！
    }
}

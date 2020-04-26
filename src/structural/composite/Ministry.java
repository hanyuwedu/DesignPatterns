package structural.composite;

import java.util.Iterator;

public class Ministry extends Title {
    public Ministry(String name, String responsibility) {
        super(name, responsibility);
    }

    // 不支持addreport()，使用Title中的default exception

    @Override
    public int getReports() {
        return 0;
    }

    @Override
    public Iterator<Title> iterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println(super.name + " is in charge of " + super.responsibility + " It has no reports");
    }
}

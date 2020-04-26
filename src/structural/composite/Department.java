package structural.composite;

import java.util.Iterator;
import java.util.List;

public class Department extends Title {
    public Department(String name, String responsibility) {
        super(name, responsibility);
    }

    @Override
    public void addReport(Title title) {  // 可以在abstract的接口上细化类型
        if (title instanceof Ministry) {
            super.reports.add(title);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int getReports() {
        Iterator<Title> iterator = this.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Title title = iterator.next();
            if (!title.equals(this)) {
                count++;
            }
        }
        return count;
    }

    @Override
    protected List<Title> getReportsList() {
        return super.reports;
    }

    @Override
    public Iterator<Title> iterator() {
        return new TitlePreorderIterator(this);
    }

    @Override
    public void print() {
        System.out.println(super.name + " is in charge of " + super.responsibility + " He has " + this.getReports() + " reports: ");
        Iterator<Title> iterator = this.iterator();
        while (iterator.hasNext()) {
            Title title = iterator.next();
            if (title.equals(this)) {
                continue;
            }
            System.out.print(title.getName());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

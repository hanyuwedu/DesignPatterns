package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Title implements Iterable<Title> {
    protected String name;
    protected List<Title> reports;
    protected String responsibility;

    protected Title(String name, String responsibility) {
        this.name = name;
        this.reports = new ArrayList<>();
        this.responsibility = responsibility;
    }

    public String getName() {
        return this.name;
    }

    public String getResponsibility() {
        return this.responsibility;
    }

    public void addReport(Title title) {
        throw new UnsupportedOperationException();
    }

    protected int getReports() {
        throw new UnsupportedOperationException();
    }

    protected List<Title> getReportsList() {
        return null;
    }

    @Override
    public Iterator<Title> iterator() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}

package it.ioprogrammatore.model;

import it.ioprogrammatore.model.abstracts.Media;

public class Magazine extends Media {

    private int issue;

    public Magazine() {
    }

    public Magazine(int issue) {
        this.issue = issue;
    }

    public Magazine(String title, String publisher, int issue) {
        super(title, publisher);
        this.issue = issue;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public Magazine issue(int issue) {
        this.issue = issue;
        return this;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issue=" + issue +
                '}';
    }
}

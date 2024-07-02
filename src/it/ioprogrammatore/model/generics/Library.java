package it.ioprogrammatore.model.generics;

import it.ioprogrammatore.model.abstracts.Media;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    // With wildcard
    public void printTitles(List<? extends Media> mediaList) {
        for (Media media : mediaList) {
            System.out.println("Title: " + media.getTitle());
        }
    }

    // With basic generics
    public <P extends Media> void printMediaDetails(List<P> mediaList) {
        for (P media : mediaList) {
            System.out.println(media);
        }
    }

    public <U extends Media> U findItemByTitle(String title, List<U> mediaList) {
        for (U item : mediaList) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public List<T> getItems() {
        return items;
    }
}

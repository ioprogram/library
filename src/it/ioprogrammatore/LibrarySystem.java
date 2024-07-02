package it.ioprogrammatore;

import it.ioprogrammatore.model.Book;
import it.ioprogrammatore.model.Magazine;
import it.ioprogrammatore.model.abstracts.Media;
import it.ioprogrammatore.model.generics.Library;

import java.util.Arrays;
import java.util.List;

public class LibrarySystem {

    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.addItem(new Book("La neve in fondo al mare", "Einaudi Editore", "Matteo Bussola"));
        bookLibrary.addItem(new Book("Il canto dei cuori ribelli", "Libreria pienogiorno", "Thrity Umrigar"));
        bookLibrary.addItem(new Book("Succede sempre qualcosa di meraviglioso", "Mondadori", "Gianluca Gotto"));

        Library<Magazine> magazineLibrary = new Library<>();
        magazineLibrary.addItem(new Magazine("PC Magazine", "Acacia Edizioni", 10));
        magazineLibrary.addItem(new Magazine("Topolino", "Panini editore", 12586));

        System.out.println("Books in the library:");
        bookLibrary.printItems();

        System.out.println("\nMagazines in the library:");
        magazineLibrary.printItems();

        // Using wildcards to print titles
        List<Media> mediaList = Arrays.asList(
                new Book("Profondo come il mare leggero come il cielo", "Mondadori", "Gianluca Gotto"),
                new Magazine("Hacker Journal", "Sprea S.P.A.", 3)
        );

        System.out.println("\nPrinting titles using wildcard:");
        bookLibrary.printTitles(mediaList);

        // Using wildcards to print media details
        System.out.println("\nPrinting media details using wildcard:");
        bookLibrary.printMediaDetails(mediaList);

        // Finding an item by title
        System.out.println("\nFinding item by title:");
        Book foundBook = bookLibrary.findItemByTitle("Il canto dei cuori ribelli", bookLibrary.getItems());
        System.out.println("Found item: " + foundBook);
    }

}

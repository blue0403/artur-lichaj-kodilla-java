package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Collection of books");
        Book book1 = new Book("The Green Mile", "Stephen King",
                LocalDate.of(1996,11,1));
        Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling",
                LocalDate.of(2017, 10, 16));
        Book book3 = new Book("The Hobbit", "J. R. R. Tolkien",
                LocalDate.of(2000, 3, 20));
        Book book4 = new Book("Inferno", "Dan Brown", LocalDate.of(2013, 12 ,23));
        Book book5 = new Book("Pharaoh", "Boleslaw Prus", LocalDate.of(2016, 4, 17));
        Book book6 = new Book("Secret Window, Secret Garden", "Stephen King",
                LocalDate.of(2014, 1, 14));
        Book book7 = new Book("The Shack", "W. P. Young", LocalDate.of(2006, 5, 27));
        Book book8 = new Book("A World Apart", "Gustaw Herling-Grudzinski",
                LocalDate.of(1951, 9, 1));

        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);
        library.getBooks().add(book8);

        //Then
        Assert.assertEquals(8, library.getBooks().size());
    }
}

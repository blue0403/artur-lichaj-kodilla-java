package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianWithEvenNumber() {
        //Given
        Book greenMile = new Book("Stephen King", "The Green Mile",
                1996, "SK/GM/1996");
        Book harryPotter = new Book("Joanne Kathleen Rowling", "Harry Potter and the Sorcerer's Stone",
                2017, "JKR/HPSS/2017");
        Book hobbit = new Book("John Ronald Reuel Tolkien", "The Hobbit",
                2000, "JRRT/H/2000");
        Book inferno = new Book("Dan Brown", "Inferno", 2013, "DB/I/2013");
        Book pharaoh = new Book("Boleslaw Prus", "Pharaoh", 2016, "BP/P/2016");
        Book secretWindow = new Book("Stephen King", "Secret Window, Secret Garden",
                2014, "SK/SWSG/2014");

        HashSet<Book> library = new HashSet<>();
        library.add(greenMile);
        library.add(harryPotter);
        library.add(hobbit);
        library.add(inferno);
        library.add(pharaoh);
        library.add(secretWindow);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(library);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(2014, publicationYearMedian, 0);
    }

    @Test
    public void testPublicationYearMedianWithOddNumber() {
        //Given
        Book greenMile = new Book("Stephen King", "The Green Mile",
                1996, "SK/GM/1996");
        Book harryPotter = new Book("Joanne Kathleen Rowling", "Harry Potter and the Sorcerer's Stone",
                2017, "JKR/HPSS/2017");
        Book hobbit = new Book("John Ronald Reuel Tolkien", "The Hobbit",
                2000, "JRRT/H/2000");
        Book inferno = new Book("Dan Brown", "Inferno", 2013, "DB/I/2013");
        Book pharaoh = new Book("Boleslaw Prus", "Pharaoh", 2016, "BP/P/2016");
        Book secretWindow = new Book("Stephen King", "Secret Window, Secret Garden",
                2014, "SK/SWSG/2014");
        Book shack = new Book("William Paul Young", "The Shack", 2006, "WPY/S/2006");

        HashSet<Book> library = new HashSet<>();
        library.add(greenMile);
        library.add(harryPotter);
        library.add(hobbit);
        library.add(inferno);
        library.add(pharaoh);
        library.add(secretWindow);
        library.add(shack);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(library);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(2013, publicationYearMedian, 0);
    }
}

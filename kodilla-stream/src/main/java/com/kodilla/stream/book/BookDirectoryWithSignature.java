package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectoryWithSignature {
    private final List<BookWithSignature> theBookList = new ArrayList<>();

    public BookDirectoryWithSignature() {
        theBookList.add(new BookWithSignature("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        theBookList.add(new BookWithSignature("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        theBookList.add(new BookWithSignature("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        theBookList.add(new BookWithSignature("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        theBookList.add(new BookWithSignature("Ryan Talley", "Gangsters and kings", 2007, "0005"));
        theBookList.add(new BookWithSignature("Madelynn Carson", "Unity without duty", 2007, "0006"));
        theBookList.add(new BookWithSignature("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007"));
    }

    public List<BookWithSignature> getList() {
        return new ArrayList<>(theBookList);
    }
}

package io.github.nbobhate.patterns.structural.proxy;

public class LibraryImpl implements Library {

    @Override
    public Book getBook(String title) {
        return new Book();
    }

    @Override
    public void returnBook(Book book) {

    }
}

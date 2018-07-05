package io.github.nbobhate.patterns.structural.proxy;

public interface Library {

    public Book getBook(String title);

    public void returnBook(Book book);
}

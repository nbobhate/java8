package io.github.nbobhate.patterns.structural.proxy;

public class LibraryProxy {

    private Library library;

    public LibraryProxy() {
        library = new LibraryImpl();
    }

    public Book searchForBook(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return library.getBook(title);
    }

    public void returnBookToLibrary(Book book) {
        if (book == null) {
            throw new IllegalArgumentException();
        }

        library.returnBook(book);
    }
}

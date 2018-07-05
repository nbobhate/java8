package io.github.nbobhate.patterns.structural.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test(expected = IllegalArgumentException.class)
    public void testFailGetEmptyTitle() {
        LibraryProxy libraryProxy = new LibraryProxy();
        libraryProxy.searchForBook("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailGetNullTitle() {
        LibraryProxy libraryProxy = new LibraryProxy();
        libraryProxy.searchForBook(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailReturnNullBook() {
        LibraryProxy libraryProxy = new LibraryProxy();
        libraryProxy.returnBookToLibrary(null);
    }
}

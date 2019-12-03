package com.svs.isbntools;

/**
 * Demo of testing code that has dependencies
 *
 * @author baike
 */
class StockManager {

    private ExternalISBNDataService service;

    void setService(ExternalISBNDataService service) {
        this.service = service;
    }

    String getLocatorCode(String isbn) {
        Book book = service.lookup(isbn);

        return isbn.substring(isbn.length() - 4) +
                book.getAuthor().substring(0, 1) +
                book.getTitle().split(" ").length;
    }
}

package com.svs.isbntools;

/**
 * Demo of testing code that has dependencies
 *
 * @author baike
 */
class StockManager {

    private ExternalISBNDataService databaseService;

    private ExternalISBNDataService webService;

    void setDatabaseService(ExternalISBNDataService databaseService) {
        this.databaseService = databaseService;
    }

    void setWebService(ExternalISBNDataService webService) {
        this.webService = webService;
    }

    String getLocatorCode(String isbn) {
        Book book = databaseService.lookup(isbn);
        if (book == null) book = webService.lookup(isbn);

        return isbn.substring(isbn.length() - 4) +
                book.getAuthor().substring(0, 1) +
                book.getTitle().split(" ").length;
    }
}

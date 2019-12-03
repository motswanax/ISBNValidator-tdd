package com.svs.isbntools;

/**
 * Represents an external service
 *
 * @author baike
 */
interface ExternalISBNDataService {
    Book lookup(String  isbn);
}

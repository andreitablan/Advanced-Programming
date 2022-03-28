package Exceptions;

/**
 * this class handles exceptions
 */
public class InvalidCatalogException extends Exception {
    /**
     * this basic constructor throws an error message
     * @param eg
     */
    public InvalidCatalogException(Exception eg) {
        super("Invalid catalog file.", eg);
    }
}
package Exceptions;

/**
 * this class handles Custom Exceptions
 */
public class CustomException extends Exception {

    /**
     * This basic constructor throws a messages.
     * @param message
     */
    public CustomException(String message) {
        super(message);
    }
}

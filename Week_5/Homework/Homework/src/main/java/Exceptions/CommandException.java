package Exceptions;

/**
 * this Class handles the exceptions for Command class
 */
public class CommandException extends Exception {
    String message;

    /**
     * this basic constructor sets the message
     * @param message
     */
    public CommandException(String message) {
        this.message = message;
    }

    /**
     * Getter for the message
     * @return
     */
    @Override
    public String getMessage() {
        return message;
    }

}

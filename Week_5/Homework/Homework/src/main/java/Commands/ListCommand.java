package Commands;

import Catalogs.Catalog;
import Exceptions.*;
import Items.*;

/**
 * This class is used to list a command
 */
public class ListCommand extends Command {
    /**
     * This is the basic constructor for this class
     * @param catalog
     */
    public ListCommand(Catalog catalog) {
        super(catalog);
    }

    /**
     * this method overwrites the execute method in Command class
     * @param arguments
     * @throws CommandException
     */
    @Override
    public void execute(String arguments) throws CommandException {
        /**
         * It should be a test to see if the command exists.
         */
            throw new CommandException("Invalid command");
    }
}

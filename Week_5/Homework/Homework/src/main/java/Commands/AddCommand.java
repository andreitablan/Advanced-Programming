package Commands;

import Catalogs.Catalog;
import Exceptions.CustomException;
import Exceptions.CommandException;
import Items.*;

import java.util.Arrays;

/**
 * This is a class that adds a command into the catalog
 */
public class AddCommand extends Command {

    /**
     * The basic constructor for this class
     * @param catalog
     */
    public AddCommand(Catalog catalog) {
        super(catalog);
    }

    /**
     * This method execute
     * @param arguments
     * @throws CommandException
     * @throws CustomException
     */
    @Override
    public void execute(String arguments) throws CommandException, CustomException {
        /**
         * It should add the command to a list of commands
         */
            throw new CommandException("Invalid expresion");
    }
}
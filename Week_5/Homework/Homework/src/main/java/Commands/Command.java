package Commands;
import Catalogs.Catalog;
import Exceptions.CommandException;
import Exceptions.CustomException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This is the abstract class which represent a command, it can be inherited
 */
public abstract class Command {
    Catalog catalog;
    List<String> argumentList;

    /**
     * This is the constructor for this class
     * @param catalog
     */
    public Command(Catalog catalog) {
        this.catalog = catalog;
        argumentList = new LinkedList<>();
    }

    /**
     * Getter for the catalog used
     * @return
     */
    public Catalog getCatalog() {
        return catalog;
    }

    /**
     * Setter for the catalog we use
     * @param catalog
     */
    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    /**
     * Getter for the list of arguments
     * @return
     */
    public List<String> getArgumentList() {
        return argumentList;
    }

    /**
     * Setter for the list of arguments
     * @param argumentList
     */
    public void setArgumentList(List<String> argumentList) {
        this.argumentList = argumentList;
    }

    /**
     * This function should execute a new command, it is only a declaration
     * @param arguments
     * @throws CommandException
     * @throws CustomException
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws CommandException
     */
    public abstract void execute(String arguments) throws CommandException, CustomException, IOException, ClassNotFoundException, CommandException;

}

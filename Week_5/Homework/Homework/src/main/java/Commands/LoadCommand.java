package Commands;

import Catalogs.Catalog;
import Exceptions.CustomException;
import Exceptions.CommandException;
import java.io.*;

/**
 * This class should load an existent command
 */
public class LoadCommand extends Command{
    /**
     * This is the basic constructor for this class
     * @param catalog
     */
    public LoadCommand(Catalog catalog) {
        super(catalog);
    }

    /**
     * We overwrite the execute method in the Command class.
     * @param arguments
     * @throws CommandException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void execute(String arguments) throws CommandException, IOException, ClassNotFoundException {
        if (argumentList.size() == 1) {
            /*
            FileInputStream fileOutputStream = new FileInputStream(argumentList.get(1));
            ObjectInputStream objectOutputStream = new ObjectInputStream(fileOutputStream);
            catalog = (Catalog) objectOutputStream.readObject();
            objectOutputStream.close();
            fileOutputStream.close();
            */
        }
        else {
            throw new CommandException("Invalid command");
        }
    }
}

package management;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * This is the singleton class for managing EntityFactory
 */
public class ManagementEntityManagerFactory {

    public static final boolean open = true;
    private static final ManagementEntityManagerFactory singleton = new ManagementEntityManagerFactory();
    protected EntityManagerFactory entityManagerFactory;

    private ManagementEntityManagerFactory() {
    }

    public static ManagementEntityManagerFactory getInstance() {

        return singleton;
    }

    /**
     * This is the function we use to create the EntityManageFactory
     */
    protected void createEntityManagerFactory() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        if (open) System.out.println("Persistence already started at " + new java.util.Date());
    }

    /**
     * This is the public method we use to see is the singleton is already defined
     *
     * @return
     */
    public EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) createEntityManagerFactory();
        return entityManagerFactory;
    }

    /**
     * This method will close the EntityManageFactory
     */
    public void closeEntityManagerFactory() {

        if (entityManagerFactory != null) {
            entityManagerFactory.close();
            entityManagerFactory = null;
            if (open) System.out.println("Persistence finished at" + new java.util.Date());
        }
    }
}

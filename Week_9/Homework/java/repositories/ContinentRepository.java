package repositories;

import entity.Continent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import management.ManagementEntityManagerFactory;

import java.util.List;

/**
 * This is the ContinentRepository class we use to interrogate the database.
 */
public class ContinentRepository extends DataRepository<Continent, Integer> {

    ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
    EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public ContinentRepository() {
    }

    /**
     * This is the method we mush have which finds a list of continents with the same name(does not exist in the real world, but we may invent some)
     *
     * @param name
     * @return
     */
    public List<Continent> findByName(String name) {
        return entityManager.createNamedQuery("Continent.findByName").setParameter("nume", name).getResultList();
    }
}
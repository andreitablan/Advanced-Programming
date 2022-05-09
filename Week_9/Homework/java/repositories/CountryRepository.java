package repositories;

import entity.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import management.ManagementEntityManagerFactory;

import java.util.List;

/**
 * This is the CountryRepository class we use to interrogate the database.
 */
public class CountryRepository extends DataRepository<Country, Long> {

    ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
    EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public CountryRepository() {
    }

    /**
     * This is the method we mush have which finds a list of countries with the same name.
     *
     * @param name
     * @return
     */
    public List<Country> findByName(String name) {
        return entityManager.createNamedQuery("Country.findByName").setParameter("nume", name).getResultList();
    }
}
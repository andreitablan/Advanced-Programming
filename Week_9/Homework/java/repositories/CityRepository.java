package repositories;

import entity.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import management.ManagementEntityManagerFactory;

import java.util.List;

/**
 * This is the CityRepository class we use to interrogate the database.
 */
public class CityRepository extends DataRepository<City, Long> {

    ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
    EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public CityRepository() {
    }

    /**
     * This is the method we mush have which finds a list of cities with the same name
     *
     * @param name
     * @return
     */
    public List<City> findByName(String name) {
        return entityManager.createNamedQuery("City.findByName").setParameter("nume", name).getResultList();
    }
}

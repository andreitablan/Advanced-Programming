package repositories;

import entity.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import management.ManagementEntityManagerFactory;

import java.util.List;

/**
 * This is the CityRepository class we use to interrogate the database.
 */
public class CityRepository {

    ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
    EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public CityRepository() {
    }

    /**
     * This is the method we must have which inserts an entity in the database.
     *
     * @param entity
     */
    public void create(City entity) {
        entityManager.persist(entity);
    }

    /**
     * This is the method we must have which finds a city by the id
     *
     * @param id
     * @return
     */
    public City findById(Long id) {

        return entityManager.createQuery("SELECT city FROM City city WHERE city.id=:id", City.class).setParameter("id", id).getSingleResult();
    }

    /**
     * This is the method we mush have which finds a list of cities with the same name
     *
     * @param name
     * @return
     */
    public List<City> findByName(String name) {
        return entityManager.createQuery("SELECT city FROM City city WHERE city.name=:nume", City.class).setParameter("nume", name).getResultList();
    }
}

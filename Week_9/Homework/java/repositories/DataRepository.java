package repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import management.ManagementEntityManagerFactory;
import org.dom4j.tree.AbstractEntity;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * This is the generic AbstractRepository in which I implemented the methods for findById and create(persist)
 *
 * @param <Type>
 * @param <ID>
 */
public abstract class DataRepository<Type extends AbstractEntity, ID extends Serializable> {
    ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
    EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    private Class<Type> type;

    /**
     * This is the findById method for cities, countries and continents
     *
     * @param id
     * @return
     */
    public Type findById(ID id) {
        this.type = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        return entityManager.find(type, id);
    }

    /**
     * This is the persist method for cities, countries and continents
     *
     * @param entity
     */
    public void persist(Type entity) {
        try {
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
            System.out.println("We inserted a entity at " + new java.util.Date());
        } catch (Exception e) {
        }
    }
}
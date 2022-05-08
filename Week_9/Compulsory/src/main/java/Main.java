import entity.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import management.ManagementEntityManagerFactory;
import repositories.CityRepository;

import java.util.List;

/**
 * This is the main class.
 */
public class Main {
    public static void main(String[] args) {

        ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
        EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            City Iasi = new City();
            Iasi.setId(1002L);
            Iasi.setCapital(0L);
            Iasi.setCountry("Romania");
            Iasi.setName("Iasi");
            Iasi.setLatitude(47.17);
            Iasi.setLongitude(27.57);

            CityRepository cityRepository = new CityRepository();
            cityRepository.create(Iasi);
            System.out.println(cityRepository.findById(10L).getName());
            List<City> myCitiesList = cityRepository.findByName("Bucharest");
            for (int index = 0; index < myCitiesList.size(); index++)
                System.out.println(myCitiesList.get(index).getCountry());
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            singleton.closeEntityManagerFactory();
        }
    }
}
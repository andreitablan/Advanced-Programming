import entity.City;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import management.ManagementEntityManagerFactory;
import repositories.CityRepository;
import tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * This is the main class.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ManagementEntityManagerFactory singleton = ManagementEntityManagerFactory.getInstance();
        EntityManagerFactory entityManagerFactory = singleton.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            City city = new City();
            city.setId(1002L);
            city.setCapital(0L);
            city.setCountry("Romania");
            city.setName("Iasi");
            city.setLatitude(47.17);
            city.setLongitude(27.57);

            CityRepository cityRepository = new CityRepository();

            cityRepository.persist(city);

            System.out.println(cityRepository.findById(10L));

            List<City> myCitiesList = cityRepository.findByName("Iasi");
            for (int index = 0; index < myCitiesList.size(); index++)
                System.out.println(myCitiesList.get(index).getCountry());

            CSVReader myReader = new CSVReader();

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
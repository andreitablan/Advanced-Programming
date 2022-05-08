package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This is the City Entity which represents the database
 */
@Entity
@Table(name = "CITIES")
@NamedQueries({
        @NamedQuery(name = "City.findByName",
                query = "SELECT city1 FROM City city1 WHERE city1.name=:n
public class City {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "COUNTRY", length = 100)
    private String country;

    @Column(name = "NAME", length = 100)
    private String name;

    @Column(name = "CAPITAL")
    private Long capital;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}

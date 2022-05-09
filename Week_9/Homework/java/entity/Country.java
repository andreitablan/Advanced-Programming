package entity;

import jakarta.persistence.*;
import org.dom4j.tree.AbstractEntity;

import java.io.Serializable;
import java.util.Set;

/**
 * This is the Country Entity which represents the database
 */
@Entity
@Table(name = "COUNTRIES")
@NamedQueries({@NamedQuery(name = "Country.findByName", query = "SELECT country1 FROM Country country1 WHERE country1.name=:nume")})
public class Country extends AbstractEntity implements Serializable {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "CODE", nullable = false, length = 20)
    private String code;

    @Column(name = "CONTINENT", nullable = false, length = 100)
    private String continent;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "COUNTRY_ID")
    private Set<City> cities;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CITY_ID", nullable = false)
    private Continent continent1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

}
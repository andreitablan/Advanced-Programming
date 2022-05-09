package entity;

import jakarta.persistence.*;
import org.dom4j.tree.AbstractEntity;

import java.io.Serializable;
import java.util.Set;

/**
 * This is the Continent Entity which represents the database
 */
@Entity
@Table(name = "CONTINENTS")
@NamedQueries({@NamedQuery(name = "Continent.findByName", query = "SELECT continent1 FROM Continent continent1 WHERE continent1.name=:nume")})
public class Continent extends AbstractEntity implements Serializable {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTINENT_ID")
    private Set<Country> countries;


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

}
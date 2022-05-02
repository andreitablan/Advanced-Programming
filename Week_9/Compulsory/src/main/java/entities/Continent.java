package entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "continents")
@NamedQueries({
        @NamedQuery(name = "Continent.findAll",
                query = "select e from Continent e order by e.name"),
})
public class Continent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    //constructors, getters, setters, toString
    public Continent (){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

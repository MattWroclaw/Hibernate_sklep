package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "Producent")
public class Producent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producenta")
    private Long id;
    @Column
    private String nazwa;
    @OneToMany(mappedBy = "producent")
    private List<Produkt> produkty;

    public Producent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Producent(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +

                '}';
    }
}

package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "Kategoria_produkt")
public class KategoriaProduktu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategorii")
    private Long id;
    @Column
    private String nazwa;
    @OneToMany(mappedBy = "kategoriaProduktu")
    private List<Produkt> produkty;

    public KategoriaProduktu() {
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

    public KategoriaProduktu(String nazwa) {
        this.nazwa = nazwa;
    }
}

package OrganisatieAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "modusoperandi")
public class ModusOperandi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "omschrijving")
    private String omschrijving;

    @ManyToMany
    @JoinColumn(name ="aangifte_id")
    private List<Aangifte> aangiftes;

    public ModusOperandi() {

    }

    public ModusOperandi(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public long getId() {
        return id;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "ModusOperandi [id=" + id + ", omschrijving=" + omschrijving + "]";
    }
}

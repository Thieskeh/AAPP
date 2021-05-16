package OrganisatieAPI.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "conceptaangifte")
public class ConceptAangifte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "modusoperandi")
    private int modusOperandi;

    @Column(name = "aangeverId")
    private int aangeverId;

    @Column(name = "omschrijving")
    private String omschrijving;

    public ConceptAangifte() {

    }

    public ConceptAangifte(Date date, int modusOperandi, int aangeverId, String omschrijving) {
        this.date = date;
        this.modusOperandi = modusOperandi;
        this.aangeverId = aangeverId;
        this.omschrijving = omschrijving;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getModusOperandi() {
        return modusOperandi;
    }

    public void setModusOperandi(int modusOperandi) {
        this.modusOperandi = modusOperandi;
    }

    public int getAangeverId() {
        return aangeverId;
    }

    public void setAangeverId(int aangeverId) {
        this.aangeverId = aangeverId;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "ConceptAangifte [id" + id + ", date="+ date + " modusOperandi="+modusOperandi+" aangeverId="+aangeverId+" omschrijving="+omschrijving+ "]";
    }
}
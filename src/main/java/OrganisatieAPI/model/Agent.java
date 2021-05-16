package OrganisatieAPI.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "posting")
    private String posting;

    @Column(name = "rank")
    private String rank;

    @ManyToMany
    @JoinColumn(name ="aangifte_id")
    private List<Aangifte> aangiftes;

    public Agent() {

    }

    public Agent(String firstname, String lastname, String posting, String rank) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.posting = posting;
        this.rank = rank;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosting() {
        return posting;
    }

    public void setPosting(String posting) {
        this.posting = posting;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Agent [id" + id + ", firstname="+ firstname + " lastname="+lastname+" posting="+posting+" rank="+rank+"]";
    }
}
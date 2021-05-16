package OrganisatieAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Aangifte")
public class Aangifte {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "date")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "modusoperandi_Id", referencedColumnName = "id")
	private ModusOperandi modusOperandi;

	@ManyToOne
	@JoinColumn(name = "aangever_Id", referencedColumnName = "id")
	private Aangever aangever;

	@Column(name = "omschrijving")
	private String omschrijving;

	@ManyToOne
	@JoinColumn(name = "agent_Id", referencedColumnName = "id")
	private Agent agent;

	public Aangifte() {
	}
	public Aangifte(Date date, ModusOperandi modusOperandi, Aangever aangever, String omschrijving, Agent agent) {
		this.date = date;
		this.modusOperandi = modusOperandi;
		this.aangever = aangever;
		this.omschrijving = omschrijving;
		this.agent = agent;
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

	public ModusOperandi getModusOperandi() {
		return modusOperandi;
	}

	public void setModusOperandi(ModusOperandi modusOperandi) {
		this.modusOperandi = modusOperandi;
	}

	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public Aangever getAangever() {
		return aangever;
	}
	public void setAangever(Aangever aangever) {
		this.aangever = aangever;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	@Override
	public String toString() {
		return "Aangifte [id" + id + ", date="+ date + " modusOperandi="+modusOperandi+" aangever="+aangever+" omschrijving="+omschrijving+ " agent" + agent  +"]";
	}
}
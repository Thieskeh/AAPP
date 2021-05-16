package OrganisatieAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aangever")
public class Aangever {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "shopname")
    private String shopname;

    @Column(name = "postalcode")
    private String postalcode;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "residence")
    private String residence;

    @Column(name = "employee")
    private String employee;

    @ManyToMany
    @JoinColumn(name ="aangifte_id")
    private List<Aangifte> aangiftes;


    public Aangever() {

    }

    public Aangever(String shopname, String postalcode, String street, String number, String residence, String employee) {
        this.shopname = shopname;
        this.postalcode = postalcode;
        this.street = street;
        this.number = number;
        this.residence = residence;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Aangever [id" + id + ", shopname="+ shopname + " postalcode="+postalcode+" street="+street+" number="+number+ " residence="+residence+" employee="+employee  +"]";
    }
}
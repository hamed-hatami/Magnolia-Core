package ir.magnolia.core.model.entity;

import javax.persistence.*;

/**
 * Created by a c e r on 17/10/2016.
 */
@Entity
@Table(name = "tb_friend")
public class Friend extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "register_date")
    private String registerDate;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "latin_firstname")
    private String latinFirstName;
    @Column(name = "latin_lastname")
    private String latinLastName;
    @Column(name = "national_code")
    private String nationalCode;
    @Column(name = "birth_date")
    private String birthDate;

    public Friend() {
    }

    public Friend(String registerDate, String firstName, String lastName, String latinFirstName, String latinLastName, String nationalCode, String birthDate) {
        this.registerDate = registerDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.latinFirstName = latinFirstName;
        this.latinLastName = latinLastName;
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getRegisterDate() {
        return registerDate;
    }

    @Override
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLatinFirstName() {
        return latinFirstName;
    }

    public void setLatinFirstName(String latinFirstName) {
        this.latinFirstName = latinFirstName;
    }

    public String getLatinLastName() {
        return latinLastName;
    }

    public void setLatinLastName(String latinLastName) {
        this.latinLastName = latinLastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

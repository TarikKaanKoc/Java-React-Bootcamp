package Entities;

import Abstract.IEntity;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements IEntity {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String  nationalityId;

    public Customer(){

    }
    public Customer(String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setNationalityId(nationalityId);
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String  getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}

package Entities;

import Abstract.Entity;

public class Gamer implements Entity {

    private int Id;
    private String nationalId;
    private String firstName;
    private String lastName;
    private int  yearOfbirth;

    public Gamer(){

    }
    public Gamer(int id, String nationalId, String firstName, String lastName, int yearOfbirth) {
        setId(id);
        this.setNationalId(nationalId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setYearOfbirth(yearOfbirth);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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

    public int getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }
}

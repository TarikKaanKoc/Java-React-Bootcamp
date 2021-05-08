package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

    private int id;
    private String firstName;
    private String lastName;
    private String userMail;
    private String userPassword;
    private boolean isVerified = false;
    private String verifyCode = "";

    public User(){

    }

    public User(int id, String firstName, String lastName, String userMail, String userPassword) {

        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setUserMail(userMail);
        this.setUserPassword(userPassword);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}

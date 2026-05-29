package jp.co.aforce.beans;

public class Users implements java.io.Serializable {

    private String memberId;
    private String lastName;
    private String password;

    public String getMemberId() {
        return memberId;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
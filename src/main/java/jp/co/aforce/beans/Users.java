package jp.co.aforce.beans;

public class Users implements java.io.Serializable {

    private String memberId;
    private String lastName;
    private String password;
    private String firstName;
    private String address;
    private String mailAddress;

    public String getMemberId() {
        return memberId;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }
    
    public String getMailAddress() {
        return mailAddress;
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
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
}
}
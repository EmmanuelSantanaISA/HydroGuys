package pojo;
// Generated Apr 21, 2016 7:11:11 PM by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    private Integer userId;
    private String userName;
    private Date registerDate;
    private String firstName;
    private String lastName;
    private Integer userTypeId;
    private String phone;
    private String age;

    public User() {
    }

    public User(String userName, Date registerDate, String firstName, String lastName, Integer userTypeId, String phone, String age) {
        this.userName = userName;
        this.registerDate = registerDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userTypeId = userTypeId;
        this.phone = phone;
        this.age = age;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

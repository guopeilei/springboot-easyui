package com.domain.entity;

/**
 * 用户信息
 */
public class Employee {
    private int employeeid;
    private String employeename;
    private String age;
    private String employeedesc;
    private String image;
    private String address;
    private int phone;
    private String mail;
    //表示当前用户的状态，1表示用户状态是正常的，0表示用户已经被删除，用户信息已经废弃
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeedesc() {
        return employeedesc;
    }

    public void setEmployeedesc(String employeedesc) {
        this.employeedesc = employeedesc;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

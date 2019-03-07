package com.killoran.Week1;


public class BusinessContact extends Contact {
    private String phoneNum;

    public BusinessContact(String name, String email, String phoneNum) {
        super(name, email);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Email: " + getEmail() +
                " phoneNum:" + phoneNum;
    }
}
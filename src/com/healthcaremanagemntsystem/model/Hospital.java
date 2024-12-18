package com.healthcaremanagemntsystem.model;

public class Hospital {
    private int hospitalId;
    private String hName;
    private String contactNo;
    private String hAddress;
    private String emailId;

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hName='" + hName + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", hAddress='" + hAddress + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

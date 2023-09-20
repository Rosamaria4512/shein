package com.co.shein.models;

public class DatesContact {
    private String email_receptor;
    private String dates_user;
    private String messagge;

    public DatesContact(String email_receptor, String dates_user, String messagge) {
        this.email_receptor = email_receptor;
        this.dates_user = dates_user;
        this.messagge = messagge;
    }

    public String getEmail_receptor() {
        return email_receptor;
    }

    public void setEmail_receptor(String email_receptor) {
        this.email_receptor = email_receptor;
    }

    public String getDates_user() {
        return dates_user;
    }

    public void setDates_user(String dates_user) {
        this.dates_user = dates_user;
    }

    public String getMessagge() {
        return messagge;
    }

    public void setMessagge(String messagge) {
        this.messagge = messagge;
    }
}

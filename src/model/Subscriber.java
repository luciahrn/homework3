package model;

import model.SubscriberAddress;

public record Subscriber(String firstname,String lastname,SubscriberAddress fullAddress,String email,Integer age) {

    public Subscriber(String firstname, String lastname, SubscriberAddress fullAddress, String email) {
        this(firstname, lastname, fullAddress, email, null);
    }

    public boolean isUnderage() { //if age is null, subscriber is not underage
        if (this.age!=null && this.age<18) {
            return true;
        }
        return false;
    }



}

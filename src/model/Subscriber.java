package model;

import model.SubscriberAddress;

public record Subscriber(String firstname,String lastname,SubscriberAddress fullAddress,String email,Integer age) {

    public Subscriber(String firstname, String lastname, SubscriberAddress fullAddress, String email) {
        this(firstname, lastname, fullAddress, email, null);
    }

    public boolean isUnderage() { //ak je vek nezadany nie je null
        if (this.age!=null && this.age<18) {
            return true;
        }
        return false;
    }



}

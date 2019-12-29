package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectProduct {
    private int price;
    private String name;

    List<IUserObserver> users;

    SubjectProduct(String name, int price){
        users = new ArrayList<>();
        setPrice(price);
        price = this.price;
    }

    private void Notify(){
        for(IUserObserver user:users){
            user.TakeNotify(this);
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < this.price) Notify();
        this.price = price;
    }
}

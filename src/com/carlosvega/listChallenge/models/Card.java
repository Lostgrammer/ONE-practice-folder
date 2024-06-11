package com.carlosvega.listChallenge.models;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private double balance;//saldo de tarjeta
    private List <Purchase> purchaseList = new ArrayList<>();

    //constructor
    public Card(double balance) {
        this.balance = balance;
    } //first value of card balance

    //getters and setters
    public double getBalance() {
        return balance;
    }
    public void setBalance(double productValue) {
        this.balance = this.balance - productValue;
        System.out.println(balance);
    }

    //metodos
    public List<Purchase> addPurchase(Purchase purchase){
        purchaseList.add(purchase);
        return purchaseList;
    }
}

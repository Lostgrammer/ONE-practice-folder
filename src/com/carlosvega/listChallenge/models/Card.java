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
    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    //metodos
    public List<Purchase> addPurchase(Purchase purchase){
        this.purchaseList.add(purchase);
        return purchaseList;
    }
    //metodo para ordenar lista
    public void showSortList(){
        for(Purchase item : getPurchaseList()){
            System.out.println(item.getDescription() + " - " + item.getValue());
        }
    }

}

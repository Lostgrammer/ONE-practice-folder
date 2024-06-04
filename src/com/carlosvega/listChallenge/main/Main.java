package com.carlosvega.listChallenge.main;

import com.carlosvega.listChallenge.models.Card;
import com.carlosvega.listChallenge.models.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner input  = new Scanner(System.in);
        Card myCard = new Card();
        double accumulatedValue = 0;
        String temporalDescription = "";
        double temporalValue = 0;
        List<Purchase> purchaseList = new ArrayList<>();

        //print welcome
        System.out.println("Bienvenido a la tienda");
        System.out.println("Ingrese el monto de su tarjeta por seguridad");
        myCard.setLimit(input.nextDouble());
        while (myCard.getLimit() > accumulatedValue){
            System.out.println("Ingrese la descripcion del producto:");
            temporalDescription = input.nextLine();
            System.out.println("Ingrese el precio del producto");
            temporalValue = input.nextDouble();
            accumulatedValue +=temporalValue;
            purchaseList.add(new Purchase(temporalDescription, temporalValue));
            //if si desea seguir comprando
            //else
            //break;
        }



    }
}

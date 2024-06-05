package com.carlosvega.listChallenge.main;

import com.carlosvega.listChallenge.models.Card;
import com.carlosvega.listChallenge.models.Purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        Card myCard = new Card();
        double accumulatedValue = 0;
        double temporalValue = 0;
        String temporalDescription = "";
        String response = "";
        List<Purchase> purchaseList = new ArrayList<>();
        double remainingBalance;

        //print welcome
        System.out.println("Bienvenido a la tienda");
        System.out.println("Ingrese el monto de su tarjeta por seguridad");
        myCard.setBalance(input.nextDouble());
        input.nextLine();
        remainingBalance = myCard.getBalance();

        while (myCard.getBalance() >= accumulatedValue){
            System.out.println("Ingrese la descripcion del producto:");
            temporalDescription = input.nextLine();
            System.out.println("Ingrese el precio del producto");
            temporalValue = input.nextDouble();
            input.nextLine();

            //verifying temporalValue
            if (myCard.getBalance() < temporalValue) {
                System.out.println("Saldo insuficiente, no se pudo realizar la compra");
                break;
            }
            //updating card amount
            accumulatedValue += temporalValue;
            remainingBalance -= temporalValue;

            purchaseList.add(new Purchase(temporalDescription, temporalValue));

            //if si desea seguir comprando
            System.out.println("Desea seguir comprando? Envie 'si' para continuar o 'no para finalizar la compra'");
            response = input.nextLine().toLowerCase();
            if (response.equals("no")) {
                //boleta
                System.out.println("*************************** " +
                        "\nCOMPRAS REALIZADAS");
                for(Purchase item : purchaseList){
                    System.out.println(item.getDescription() + " - " + item.getValue());
                }
                System.out.println("***************************");
                System.out.println("Saldo de la tarjeta: " + remainingBalance);
                break;
            }else {
                //verificar si el acumulado es mayor que el saldo
                if (accumulatedValue >= myCard.getBalance()){
                    System.out.println("Lo sentimos, no cuenta con saldo suficiente para seguir comprando, le entregamos su boleta");
                    //boleta
                    System.out.println("***************************" +
                            "\nCOMPRAS REALIZADAS");
                    for(Purchase item : purchaseList){
                        System.out.println(item.getDescription() + " - " + item.getValue());
                    }
                    System.out.println("***************************");
                    System.out.println("Saldo de la tarjeta: " + remainingBalance);
                }
            }
        }

    }
}

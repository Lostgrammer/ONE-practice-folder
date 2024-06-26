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
        double accumulatedValue = 0;
        double productValue = 0;
        String temporalDescription = "";
        String response = "";

        //print welcome
        System.out.println("Bienvenido a la tienda");
        System.out.println("Ingrese el monto de su tarjeta por seguridad");
        Card myCard = new Card(input.nextDouble());
        input.nextLine();

        //condicion para que se realice el proceso
        while (myCard.getBalance() >= accumulatedValue){
            System.out.println("Ingrese la descripcion del producto:");
            temporalDescription = input.nextLine();
            System.out.println("Ingrese el precio del producto");
            productValue = input.nextDouble();
            input.nextLine();

            //verifying temporalValue
            if (myCard.getBalance() < productValue) {
                System.out.println("Saldo insuficiente, no se pudo realizar la compra");
                break;
            }

            //updating card balance
            accumulatedValue += productValue;
            myCard.setBalance(productValue); //ingresar el valor como parametro que se restara a la tarjeta para determinar su nuevo valor

            //generar la lista dentro de la  clase Card
            System.out.println(myCard.addPurchase(new Purchase(temporalDescription, productValue)));

            //condicional seguir comprando
            System.out.println("Desea seguir comprando? Envie 'si' para continuar o 'no para finalizar la compra'");
            response = input.nextLine().toLowerCase();
            if (response.equals("no")) {
                break;
            }else {
                //verificar si el acumulado es mayor que el saldo
                if (accumulatedValue >= myCard.getBalance()){
                    System.out.println("Lo sentimos, no cuenta con saldo suficiente para seguir comprando, le entregamos su boleta");
                    break;
                }
            }
        }
        //if para comprobar que se hizo al menos una compra
        if (myCard.getPurchaseList().size() > 0){

            //imprimir boleta
            System.out.println("***************************" +
                    "\nCOMPRAS REALIZADAS");
            //hacerla en la clase tarjeta
            //myCard.showList();
            System.out.println("*************************** \n" +
                    "Saldo de la tarjeta: " + myCard.getBalance());


            //metodo para ordenar en forma ascendente

//                for (int i = 0; i < purchaseList.size(); i++) {
//                    for (int j = 1; j < purchaseList.size(); j++) {
//                        if (purchaseList.get(i).getValue() > purchaseList.get(j).getValue()){
//                            lesserValuePurchaseItem = purchaseList.get(j).getValue();
//                        }else if(purchaseList.get(i).getValue() < purchaseList.get(j).getValue()){
//                            lesserValuePurchaseItem = purchaseList.get(i).getValue();
//                        }
//                        System.out.println(purchaseList.get(i).getDescription());
//                    }
//                }
//                for (int i = 0; i < purchaseList.size(); i++) {
//                    if (purchaseList.get(i).getValue()
//                }
        }

    }
}

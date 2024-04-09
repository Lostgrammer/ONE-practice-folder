package introduction;

import java.util.Scanner;

public class BankApp {
    /*
     * objetivos de la app bancaria
     * - tiene que tener 5 opciones:
     * 1. consultar saldo
     * 2. retirar dinero
     *       si el retiro es mayor al saldo avisar al cliente
     * 3. depositar dinero
     * 4. salir
     * variables
     *   double:saldo = 1599.00;
     *   String:nombre cliente = "Tony Stack";
     *   int:opcionElegida = 0;
     *   double:input dineroRetirar = 0, dineroDepositar=0;
     *   double: newBalance;
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = """
                Que operacion quiere realizar?"
                1. Consultar su saldo
                2. Retirar
                3. Depositar
                9. Salir
                """;
        String username = "";
        double balance = 1599.00;
        int chosenOption = 0;
        int withdrawnMoney = 0;
        double depositedMoney = 0;
        int limitNumber = 0;

        //init app
        username = "Tony Stark";
        System.out.println("Bienvenido Sr(" + username + ")");
        do {
            System.out.println(menu);
            chosenOption = input.nextInt();
            if (chosenOption == 1){
                System.out.println("=========================\n" +
                                "Su saldo actual es de $" + balance + "\n" +
                                "=========================");
            } else if (chosenOption == 2) {
                System.out.println("Indique su monto a retirar:");
                withdrawnMoney = input.nextInt();

                //if si el monto ingresado es superior
                if (withdrawnMoney > balance){
                    System.out.println("=========================\n" +
                            "Saldo insuficiente.\n" +
                            "=========================");
                }else if (withdrawnMoney <= limitNumber){
                    System.out.println("=========================\n" +
                                    "Monto invalido\n" +
                                    "=========================");
                }else{
                    balance -= withdrawnMoney;
                    System.out.println("=========================\n" +
                            "Recibiendo: $" + withdrawnMoney + "\n" +
                            "Saldo restante: $" + balance + "\n" +
                            "=========================");
                }
            }else if (chosenOption == 3) {
                System.out.println("=========================\n" +
                                "Indique su monto a depositar:\n" +
                                "=========================");
                depositedMoney = input.nextInt();
                if (depositedMoney <= limitNumber){
                    System.out.println("=========================\n" +
                            "Monto invalido\n" +
                            "=========================");
                }else{
                    balance += depositedMoney;
                    System.out.println("=========================\n" +
                            "Depositando: $" + depositedMoney + "\n" +
                            "Saldo actual: $" + balance + "\n" +
                            "=========================");
                }
                System.out.println("3");
            }else if (chosenOption == 9) {
                System.out.println("=========================\n" +
                                "Que tenga buen dia!\n" +
                                "=========================");
            }else {
                System.out.println("=========================\n" +
                        "Seleecione una opcion valida\n" +
                        "=========================");
            }
        } while (chosenOption != 9);

    }
}

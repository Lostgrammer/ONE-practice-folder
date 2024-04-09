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

        String username = "";
        double initialBalance = 1599.00;
        int chosenOption = 0;
        double withdrawnMoney = 0;
        double depositedMoney = 0;
        double newBalance = 0;

        //init app
        username = "Tony Stark";
        System.out.println("Bienvenido Sr(" + username + ")");
        do {
            System.out.println("Que operacion quiere realizar?\n" +
                    "1. Consultar su saldo\n" +
                    "2. Retirar\n" +
                    "3. Depositar\n" +
                    "9. Salir\n");
            chosenOption = input.nextInt();
            if (chosenOption == 1){
                newBalance = initialBalance;
                System.out.println("Su saldo actual es de $" + newBalance);
            } else if (chosenOption == 2) {
                System.out.println("Indique su monto a retirar:");
                //if si el monto ingresado es superior
//                if (){
//
//                }
            } else if (chosenOption == 3) {
                System.out.println("3");
            }else if (chosenOption == 9) {
                System.out.println("Que tenga buen dia!");
            }else {
                System.out.println("=========================\n" +
                        "Seleecione una opcion valida\n" +
                        "=========================");
            }
        } while (chosenOption != 9);

        System.out.println();

    }
}

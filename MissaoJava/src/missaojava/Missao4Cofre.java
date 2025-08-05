package missaojava;

import java.util.Scanner;

public class Missao4Cofre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;

        System.out.println("*** Cofre do Tripulante ***");
        
        System.out.println("\n[1] FATURAS");
        System.out.println("[2] SALDO");
        System.out.println("[3] EMERGENCIA");
        System.out.println("[4] MODO FERIAS");
        
        while (true) {
            System.out.print("\nDigite um codigo entre 1 a 4: ");
            codigo = input.nextInt();

            switch (codigo) {
                case 1:
                    System.out.println("Codigo selecionado: FATURAS");
                    break;
                case 2:
                    System.out.println("Codigo selecionado: SALDO");
                    break;
                case 3:
                    System.out.println("Codigo selecionado: EMERGENCIA");
                    break;
                case 4:
                    System.out.println("Codigo selecionado: MODO FERIAS️");
                    break;
                default:
                    System.out.println("\nCodigo invalido! Digite apenas numeros de 1 a 4.");
                    continue;
            }
            break;
        }

        input.close();
    }
}

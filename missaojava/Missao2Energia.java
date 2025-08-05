/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package missaojava;

import java.util.Scanner;

public class Missao2Energia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valor1, valor2, media,diferenca;
        
        System.out.println("*** Atencao tripulante! Agora que voce ja esta cadastrado, vamos prosseguir para o proximo passo ***");
        System.out.println("** Informe os valores da sua energia para avaliarmos sua situacao **");
                
        while (true) {
            System.out.print("\nInsira o primeiro valor da energia: ");
            valor1 = input.nextDouble();
            
            if (valor1 < 0) {
                System.out.println("Erro! Insira um valor positivo.");
            }
            else {
                break;
            }
        }
        
        while (true) {
            System.out.print("Insira o segundo valor da energia: ");
            valor2 = input.nextDouble();
            
            if (valor2 < 0) {
                System.out.println("\nErro! Insira um valor positivo.");
            }
            else {
                break;
            }
        }
        
        media = (valor1 + valor2) / 2;
        diferenca = Math.abs(valor1 - valor2);
        
        System.out.printf("\nMedia da energia: %.2f%n", media);
        System.out.printf("Diferenca absoluta da energia: %.2f%n", diferenca);
        
        if (diferenca >= 50) {
            System.out.println("Situacao: ESTAVEL");
            System.out.println("\n**Parabens tripulante, voce esta apto a participar das missoes!**");
        } else {
            System.out.println("Situacao: INSEGURA️");
            System.out.println("\n**Sinto muito tripulante, voce nao esta apto a participar das missoes!**");
        }
        
        input.close();
    }
}

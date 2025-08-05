/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package missaojava;

import java.util.Scanner;

public class Missao1Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        String profissao;
        char sexo;
        
        System.out.println("*********** Ola Tripulante! Bem-Vindo a Tripulacao ************");
        System.out.println("* Para darmos continuidade, precisaremos fazer o seu cadastro *");
        
        System.out.print("\nDigite o seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();
        input.nextLine();
        
        System.out.print("Digite a sua profissao: ");
        profissao = input.nextLine();
        
        while (true) {
            System.out.print("Digite seu sexo (M/F): ");
            sexo = input.next().toUpperCase().charAt(0);
            
            if (sexo == 'M' || sexo == 'F') {
                break;
            } 
            else {
                System.out.println("Caractere inválido! Digite apenas M para Masculino ou F para Femminino");
            }
        }
        
        System.out.println("\n*** Tripulante cadastrado com sucesso ***");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissao: " + profissao);
        System.out.println("Sexo: " + sexo + " - " + ( sexo == 'M' ? "Masculino" : "Feminino"));
        
        input.close();
        
    }
}

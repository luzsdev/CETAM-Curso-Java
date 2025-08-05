/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package missaojava;

import java.util.Scanner;
import missaojava.Missao1Cadastro;
import missaojava.Missao2Energia;
import missaojava.Missao3Idade;
import missaojava.Missao4Cofre;
import missaojava.Missao5Array;
import missaojava.MissaoBonusSenha;

public class MenuGeral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("\n=== MENU GERAL - MissaoJava ===");
            System.out.println("1 - Missao 1: Cadastro");
            System.out.println("2 - Missao 2: Energia");
            System.out.println("3 - Missao 3: Idade");
            System.out.println("4 - Missao 4: Cofre");
            System.out.println("5 - Missao 5: Array");
            System.out.println("6 - Missao Bonus: Senha");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    Missao1Cadastro.main(null);
                    break;
                case 2:
                    Missao2Energia.main(null);
                    break;
                case 3:
                    Missao3Idade.main(null);
                    break;
                case 4:
                    Missao4Cofre.main(null);
                    break;
                case 5:
                    Missao5Array.main(null);
                    break;
                case 6:
                    MissaoBonusSenha.main(null);
                    break;
                case 0:
                    System.out.println("Encerrando programa ...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }
}

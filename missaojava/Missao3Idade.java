package missaojava;

import java.util.Scanner;

public class Missao3Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade;
        
        System.out.println("* Para sabermos para que nivel de missao esta apto, precisamos da sua idade para saber em que faixa etaria voce se encaixa *");
        System.out.println("** Preencha o campo **");
        
        while (true) {
            System.out.print("\nInsira sua idade: ");
            idade = input.nextInt();
            
            if (idade > 0 && idade <= 11) {
                System.out.println("Classificacao: CRIANCA");
                break;
            }
            else if (idade > 11 && idade < 18) {
                System.out.println("Classificacao: ADOLESCENTE");
                break;
            }
            else if (idade >= 18) {
                System.out.println("Classificacao: ADULTO");
                break;
            }
            else {
                System.out.print("Erro! Digite uma idade valida.");
            }
        }
    }
}

package missaojava;

import java.util.Scanner;

public class MissaoBonusSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String senha;
        
        System.out.println("*** Caro tripulante! Para manter as missoes seguras e necessario ter uma senha ***");
        System.out.println("* Insira sua senha para finalizar *");
                
        while (true) {
            System.out.println("\nDigite sua senha: ");
            senha = input.nextLine();
            
            if (senha.length() > 6 && (senha.contains("@") || senha.contains("#"))) {
                System.out.println("Senha aceita!");
                break;
            }
            else {
                System.out.println("Senha recusada! A senha deve ter mais de 6 caracteres e conter @ ou #");
            }
        }
        
        input.close();
    }
}

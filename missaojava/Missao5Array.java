package missaojava;
        
public class Missao5Array {
    public static void main(String[] args) {
        String[] pecas = {"Turbina", "Sensor", "Radar", "Motor", "Laser"};
        
        System.out.println("*** Lista de Pecas ***");
        System.out.println("Pecas disponiveis no compartimento da nave:");

        // Estrutura de repetição for para listar as peças
        for (int i = 0; i < pecas.length; i++) {
            System.out.println("["+ i + "] " + pecas[i]);
        }
    }
}

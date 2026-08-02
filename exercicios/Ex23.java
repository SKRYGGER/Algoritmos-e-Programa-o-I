import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n1;

        System.out.println("=== Escolha um tipo de transporte para ser falada a velocidade média ===");
        System.out.println("1 - Carro");
        System.out.println("2 - Bicicleta");
        System.out.println("3 - Ônibus");
        System.out.println("4 - Avião");
        System.out.print("Escolha uma opção: ");
        n1 = e.nextInt();

        if (n1 == 1) {
            System.out.println("A velocidade média de um carro é 80 km/h");
        } else if (n1 == 2) {
            System.out.println("A velocidade média de um bicicleta é 20 km/h");
        } else if (n1 == 3) {
            System.out.println("A velocidade média de um Ônibus é 60 km/h");
        } else if (n1 == 4) {
            System.out.println("A velocidade média de um Avião é 800 km/h");
        } else {
            System.out.println("Escolha o número dentre as opções");
        }
    }
}
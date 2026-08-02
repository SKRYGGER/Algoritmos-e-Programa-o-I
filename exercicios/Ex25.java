import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int opcao;
        double lado, raio, base,altura,area;

        System.out.println("=== Escolha a figura geométrica ===");
        System.out.println("1 - Círculo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Retângulo");
        System.out.print("Opção: ");
        opcao = e.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o raio do círculo:");
            raio = e.nextDouble();
            area = Math.PI * raio * raio;
            System.out.println("Área do círculo é:" + area);

        } else if (opcao == 2) {
            System.out.println("Digite o lado do quadrado:");
            lado = e.nextDouble();
            area = lado * lado;
            System.out.println("Área do quadrado é:" + area);

        } else if (opcao == 3) {
            System.out.println("Digite a base do retângulo:");
            base = e.nextDouble();
            System.out.print("Digite a altura do retângulo: ");
            altura = e.nextDouble();
            area = base * altura;
            System.out.println("Área do retângulo:" + area);

        } else {
            System.out.println("Escolha o número dentre as opções");
        }
    }
}
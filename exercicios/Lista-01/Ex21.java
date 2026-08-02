import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n1;

        System.out.println("=== Menu de Café da Manhã ===");
        System.out.println("1 - Pão com manteiga");
        System.out.println("2 - Café com leite");
        System.out.println("3 - Suco de laranja");
        System.out.println("4 - Omelete");
        System.out.print("Escolha uma opção: ");
        n1 = e.nextInt();

        if (n1 == 1) {
            System.out.println("Você escolheu Pão com manteiga");
        } else if (n1 == 2) {
            System.out.println("Você escolheu Café com leite");
        } else if (n1 == 3) {
            System.out.println("Você escolheu Suco de laranja");
        } else if (n1 == 4) {
            System.out.println("Você escolheu Omelete");
        } else {
            System.out.println("Escolha o número dentre as opções");
        }

        System.out.println("Obrigado");

    }
}
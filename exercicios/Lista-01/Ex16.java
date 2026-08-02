import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n1, n2;
        System.out.print("Insira o 1º número: ");
        n1 = e.nextInt();
        System.out.print("Insira o 2º número: ");
        n2 = e.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número 1º é par.");
        } else {
            System.out.println("O número 1º é ímpar.");
        }

        if (n2 % 2 == 0) {
            System.out.println("O número 2º é par.");
        } else {
            System.out.println("O número 2º é ímpar.");
        }
    }
}
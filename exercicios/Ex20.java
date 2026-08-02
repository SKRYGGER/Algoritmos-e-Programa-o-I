import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        double n1;
        System.out.print("Insira um número: ");
        n1 = e.nextDouble();

        if (n1 % 2 == 0) {
            System.out.println("O número 1º é par.");
        } else {
            System.out.println("O número 1º é ímpar.");
        }
        if (n1 <0) {
            System.out.println("Número negatvo");

        }else {
            System.out.println("Número positivo");
        }
            if (n1 % 1 == 0) {
                System.out.println("É um número inteiro.");
            } else {
                System.out.println("É um número decimal.");
            }
    }
}
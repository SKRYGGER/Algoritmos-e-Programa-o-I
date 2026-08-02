import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double desconto,valor,total;
        System.out.println("Informe o valor da compra:");
        valor = scan.nextDouble();
        if (valor < 0) {
            System.out.println("Valor inválido.");
        }
        if (valor >= 500) {
            desconto = valor * 0.10;
        } else if (valor >= 200 && valor < 500) {
            desconto = valor * 0.05;
        } else {
            desconto = 0.0;
        }
        total = valor - desconto;
        System.out.printf("Valor da compra: R$ %.2f%n", valor);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

    }
}
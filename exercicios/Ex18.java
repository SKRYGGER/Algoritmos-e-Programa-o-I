import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int ano;
        System.out.print("Digite o ano: ");
        ano= e.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É um ano bissexto.");
        } else {
            System.out.println("Não é um ano bissexto.");
        }
    }
}

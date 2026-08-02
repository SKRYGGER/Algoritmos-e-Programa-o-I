import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        String exibir;
        int n1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número:");
        n1 = scan.nextInt();

        if (n1 > 0) {
            exibir = "Número é positivo";
        } else if (n1 < 0) {
            exibir = "Número é negativo";
        } else {
            exibir = "Número é 0";
        }

        System.out.println(exibir);

    }
}

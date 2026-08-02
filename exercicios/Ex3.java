import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String resultado;
        int n1, n2;

        System.out.println("Informe o 1º número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2º número:");
        n2 = scan.nextInt();

        if (n1 > n2) {
            resultado = "1º Número é maior ";
        } else if (n1 < n2) {
            resultado = "2º Número é maior";
        } else {
            resultado = "Números são iguais";
        }

        System.out.println(resultado);

    }
}
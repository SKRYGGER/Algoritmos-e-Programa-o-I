import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String resultado;
        int n1, n2,n3;

        System.out.println("Informe o 1º número:");
        n1 = scan.nextInt();
        System.out.println("Informe o 2º número:");
        n2 = scan.nextInt();
        System.out.println("Informe o 3º número:");
        n3 = scan.nextInt();

        if (n1 == n2 && n2 == n3) {
            resultado = "Todos os números são iguais";
        } else if (n1 >= n2 && n1 >= n3) {
            if (n1 == n2 && n1 > n3) {
                resultado = "1º e 2º números são os maiores";
            } else if (n1 == n3 && n1 > n2) {
                resultado = "1º e 3º números são os maiores";
            } else {
                resultado = "1º número é o maior";
            }
        } else if (n2 >= n1 && n2 >= n3) {
            if (n2 == n3 && n2 > n1) {
                resultado = "2º e 3º números são os maiores ";
            } else {
                resultado = "2º número é o maior";
            }
        } else {
            resultado = "3º número é o maior";
        }


        System.out.println(resultado);

    }
}
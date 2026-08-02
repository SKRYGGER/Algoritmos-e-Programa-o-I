import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        String resultado;
        System.out.println("Informe um número");
        numero = scan.nextInt();
        if (numero % 2 == 0) {
            resultado = "O número é par";
        } else {
            resultado = "O número é í­mpar";
        }
        if (numero % 3 == 0) {
            resultado += "\n O número é divisível por 3";
        } else {
            resultado += "\n O número não é divisível por 3";
        }
        if (numero % 5 == 0) {
            resultado += "\n O número é múltiplo de 5";
        } else {
            resultado += "\n O número nÃo é múltiplo de 5";
        }
        System.out.println(resultado);
    }
}
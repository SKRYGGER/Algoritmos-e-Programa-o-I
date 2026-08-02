import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        String resultado;
        System.out.println("Informe um número");
        numero = scan.nextInt();

        if (numero % 5 == 0) {
            resultado = "O número é múltiplo de 5";
        } else {
            resultado = "O número nÃo é múltiplo de 5";
        }
        System.out.println(resultado);

    }
}
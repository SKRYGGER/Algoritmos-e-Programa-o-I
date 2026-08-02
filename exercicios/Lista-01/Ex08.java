import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        String resultado;

        System.out.println("Informe um número");
        numero = scan.nextInt();


        if (numero % 3 == 0 && numero % 4 == 0) {
            resultado = "O número é divisível por 3 e 4";
        } else {
            resultado = "O número não é divisível por 3 e 4";
        }
        System.out.println(resultado);


    }
}
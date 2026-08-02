import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;

        System.out.println("Informe o 1º lado:");
        a = scan.nextInt();
        System.out.println("Informe o 2º lado:");
        b = scan.nextInt();
        System.out.println("Informe o 3º lado:");
        c = scan.nextInt();

        String resultado;

        if (a <= 0 || b <= 0 || c <= 0) {
            resultado = "Triângulo Inválido";
        }
        else if (a + b <= c || a + c <= b || b + c <= a) {
            resultado = "Triângulo Inválido";
        }
        else {
            resultado = "Triângulo Válido";
        }

        System.out.println(resultado);
    }
}
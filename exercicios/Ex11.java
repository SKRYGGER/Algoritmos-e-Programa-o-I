import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o 1º lado:");
        a = scan.nextInt();
        System.out.println("Informe o 2º lado:");
        b = scan.nextInt();
        System.out.println("Informe o 3º lado:");
        c = scan.nextInt();

        String resultado;

        if (a <= 0 || b <= 0 || c <= 0) {
            resultado = "Triângulo Inválido";
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            resultado = "Triângulo Inválido";
        }
        else if (a == b && b == c)
            resultado = "Triângulo equilátero";
        else if (a == b || b == c || a == c) {
            resultado = "Triângulo Isóceles";
        } else {
            resultado = "Triângulo Escaleno";
        }
        System.out.println(resultado);
    }
}
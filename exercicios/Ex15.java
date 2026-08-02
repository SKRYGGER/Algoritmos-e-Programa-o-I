import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double n1, n2, resultado;
        String operacao;

        System.out.println("Insira o 1º número da operação:");
        n1 = e.nextDouble();
        System.out.println("Insira o 2º número da operação:");
        n2 = e.nextDouble();
        System.out.println("Insira o operador");
        operacao=e.next();

        if (operacao.equals("+")) {
            resultado = n1 + n2;
            System.out.println("O resultado da equação é:" + resultado);
        } else if (operacao.equals("*")) {
            resultado = n1 * n2;
            System.out.println("O resultado da equação é:" + resultado);
        } else if (operacao.equals("/")) {
            resultado = n1/n2;
            System.out.println("O resultado da equação é:" + resultado);
        } else if (operacao.equals("-")) {
            resultado = n1-n2;
            System.out.println("O resultado da equação é:" + resultado);
        }

    }
}
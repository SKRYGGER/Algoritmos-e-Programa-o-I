import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resultado;
        double n1;

        System.out.println("Informe o 1º número:");
        n1 = scan.nextDouble();

        if (n1 >= 7) {
            resultado = "Aluno Aprovado";
        } else {
            resultado = "Aluno Reprovado";
        }

        System.out.println(resultado);
    }
}
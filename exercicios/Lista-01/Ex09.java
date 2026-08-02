import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resultado;
        int n1;

        System.out.println("Informe a idade:");
        n1 = scan.nextInt();

        if (n1 >= 18 && n1 <=70) {
            resultado = "O voto é obrigatório";
        } else {
            resultado = "O voto não é obrigatório";
        }

        System.out.println(resultado);
    }
}
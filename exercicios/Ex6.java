import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resultado;
        int n1;

        System.out.println("Informe a idade:");
        n1 = scan.nextInt();

        if (n1 >= 65) {
            resultado = "Pode-se aposentar";
        } else {
            resultado = "Não pode se aposentar";
        }

        System.out.println(resultado);
    }
}
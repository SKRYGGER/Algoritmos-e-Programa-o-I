import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        double n1;
        System.out.print("Insira um número: ");
        n1 = e.nextDouble();

        if (n1 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
import java.util.Scanner;

public class ProvaEx02{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String caractere1, caractere2;
        int tamanhoMatriz, col, lin;

        System.out.println("---------- Regras para usar ----------");
        System.out.println("O tamanho da matriz deve ser entre 5 e 20");
        System.out.println("Os caracteres informados NÃO podem ser iguais");
        System.out.println("Nenhum dos caracteres informados pode ser a letra x");
        System.out.println();

        do {

            System.out.println("Informe um caractere:");
            caractere1 = sc.nextLine();

            System.out.println("Informe outro caractere:");
            caractere2 = sc.nextLine();

        } while (caractere1.equals(caractere2) || caractere1.equalsIgnoreCase("x") || caractere2.equalsIgnoreCase("x"));

        do {

            System.out.println("Informe o tamanho da matriz:");
            tamanhoMatriz = sc.nextInt();

        } while (tamanhoMatriz < 5 || tamanhoMatriz > 20);

        String[][] matriz = new String[tamanhoMatriz][tamanhoMatriz];
        preencher(matriz, caractere1, caractere2);
        exibir(matriz);
    }

    public static void preencher(String[][] matriz, String caractere1, String caractere2) {

        for (int lin = 0; lin < matriz.length;lin++)

            for(int col = 0; col < matriz[lin].length;col++){

                if (col % 2 == 0){
                    matriz[lin][col] = caractere2;

                } else if (lin % 2 == 0) {
                    matriz[lin][col] = caractere1;

                }else{
                    matriz[lin][col] = "x" ;
                }

            }
    }
    public static void exibir(String[][] matriz) {
        for (int lin = 0; lin < matriz.length; lin++) {

            for (int col = 0; col < matriz[lin].length;col++) {

                System.out.print("-|" + matriz[lin][col] + "|-");
            }
            System.out.println();
        }

    }
}

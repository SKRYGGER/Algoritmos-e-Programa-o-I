import java.util.Random;
import java.util.Scanner;
public class Main {
    // variável global para Scanner
    static Scanner e = new Scanner(System.in);


    // variável global para Random
    static Random rand = new Random();


    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        //Ex3();
        //Ex4();
        //Ex5();
        //Ex6();
        //Ex7();
        //Ex8();
        //Ex9();
        //Ex10();
        //Ex11();
        //Ex12();
        //Ex13();
        //Ex14();
        //Ex15();
        //Ex16();
        //Ex17();
        //Ex18();
        //Ex19();
        //Ex20();
        //Ex21();
        Ex22();

    }
    // EXERCÍCIO 1
    public static void Ex1() {
        int contador = 0;
        String caractere;
        do {
            // gera um caractere baseado na tabela ASCII (33 a 126)
            char carac = (char) rand.nextInt(33, 127);
            // converte char para String
            caractere = carac + "";
            System.out.println("Caractere gerado: " + caractere);
            contador++;
        } while (!caractere.equals("."));
        System.out.printf("Foram gerados %d caracteres%n", contador);
    }

    // EXERCÍCIO 2
    public static void Ex2() {
        String palavra;
        int contador = 0;
        System.out.println("Informe uma palavra:");
        palavra = e.nextLine();
        palavra = palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("Quantidade de vogais: " + contador);
    }

    //EXERCÍCIO 3
    public static void Ex3() {
        int numero;
        String palavra;
        System.out.println("Informe uma palavra:");
        palavra = e.nextLine();
        palavra = palavra.toLowerCase();
        System.out.println("Informe o número de vezes a ser repetido:");
        numero = e.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(palavra);
        }
    }

    //EXERCÍCIO 4
    public static void Ex4() {
        String frase;

        do {
            System.out.println("Informe uma palavra:");
            frase = e.nextLine();

        } while (!frase.equalsIgnoreCase("sair"));

        System.out.println("Programa encerrado");

    }

    //EXERCÍCIO 5
    public static void Ex5() {
        String nome;

        do {
            System.out.println("Informe um Nome:");
            nome = e.nextLine();

        } while (nome.length() < 3);

        System.out.println("Programa encerrado");
    }

    //EXERCÍCIO 6
    public static void Ex6() {
        String senha, confirmacao;
        do {
            System.out.println("Insira sua senha:");
            senha = e.nextLine();
            System.out.println("Insira a confirmação:");
            confirmacao = e.nextLine();
            System.out.println("Senha Incorreta");

        } while (!senha.equals(confirmacao));

        System.out.println("Senha correta");

    }

    //EXERCÍCIO 7
    public static void Ex7() {
        int numeroSecreto, palpite;
        numeroSecreto = rand.nextInt(100) + 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Insira um número de 1 a 100:");
            palpite = e.nextInt();
            if (numeroSecreto == palpite) {
                System.out.println("Você acertou :)");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor");
            }
        }
    }

    //EXERCÍCIO 8
    public static void Ex8() {
        int c1 = 0, c2 = 0, c3 = 0;
        String voto;

        do {
            System.out.println("Vote (1, 2, 3) ou digite fim:");
            voto = e.nextLine();

            if (voto.equals("1")) c1++;
            else if (voto.equals("2")) c2++;
            else if (voto.equals("3")) c3++;

        } while (!voto.equalsIgnoreCase("fim"));

        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);
    }

    //EXERCÍCIO 9
    public static void Ex9() {
        double saldo = 500;
        double saque;

        while (saldo > 0) {
            System.out.println("Saldo atual: " + saldo);
            System.out.println("Digite valor do saque (0 para sair):");
            saque = e.nextDouble();

            if (saque == 0) break;

            if (saque <= saldo) saldo -= saque;
            else System.out.println("Saldo insuficiente");
        }
    }

    //EXERCICÍO 10
    public static void Ex10() {
        String resposta;

        do {
            System.out.println("Qual a capital do Brasil?");
            resposta = e.nextLine();
        } while (!resposta.equalsIgnoreCase("Brasília"));

        System.out.println("Resposta correta!");
    }

    //EXERCÍCIO 11
    public static void Ex11() {
        String cpf;

        do {
            System.out.println("Digite o CPF:");
            cpf = e.nextLine();
        } while (cpf.length() != 11);

        System.out.println("CPF válido!");
    }
//EXERCÍCIO 12
    public static void Ex12() {
        int acertos = 0;
        String resposta;

        for (int i = 0; i < 5; i++) {
            System.out.println("2 + 2 = ?");
            resposta = e.nextLine();
            if (resposta.equals("4")) acertos++;
        }

        System.out.println("Acertos: " + acertos);
    }
//EXERCÍCIO 13
    public static void Ex13() {
        String letra;
        int n;

        System.out.println("Digite uma letra:");
        letra = e.nextLine();

        System.out.println("Digite um número:");
        n = e.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(letra);
        }
        System.out.println();
    }
    //EXERCÍCIO 14
    public static void Ex14() {
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(6) + 1);
        }
    }
    //EXERCÍCIO 15
        public static void Ex15() {
            int opcao;

            do {
                System.out.println("1 - Opção A");
                System.out.println("2 - Opção B");
                System.out.println("3 - Sair");
                opcao = e.nextInt();
            } while (opcao != 3);
        }
        //EXERCÍCIO 16
    public static void Ex16() {
        String letra;
        int vogais = 0;

        do {
            letra = e.nextLine();
            if (letra.matches("[aeiouAEIOU]")) vogais++;
        } while (!letra.equalsIgnoreCase("x"));

        System.out.println("Vogais digitadas: " + vogais);
    }
    //EXERCÍCIO17
    public static void Ex17() {
        String nome;
        double preco, total = 0;

        while (true) {
            System.out.println("Nome do produto (fim para sair):");
            nome = e.nextLine();
            if (nome.equalsIgnoreCase("fim")) break;

            System.out.println("Preço:");
            preco = e.nextDouble();
            total += preco;
            e.nextLine();
        }

        System.out.println("Total geral: " + total);
    }
    //EXERCÍCIO 18
    public static void Ex18() {
        System.out.println("Digite uma frase:");
        String frase = e.nextLine();

        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Quantidade de palavras: " + palavras.length);
    }
    //EXERCÍCIO 19
    public static void Ex19() {
        String senha;

        do {
            System.out.println("Digite a senha:");
            senha = e.nextLine();
        } while (!senha.matches("(?=.*[A-Z])(?=.*\\d).{8,}"));

        System.out.println("Senha válida");
    }
    //EXERCÍCIO 20
    public static void Ex20() {
        String palavra;
        char c;
        int cont = 0;

        System.out.println("Digite uma palavra:");
        palavra = e.nextLine();

        System.out.println("Digite um caractere:");
        c = e.nextLine().charAt(0);

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == c) cont++;
        }

        System.out.println("Aparece " + cont + " vezes");
    }
    //EXERCÍCIO 21
    public static void Ex21() {
        int n;
        do {
            System.out.println("Digite um número entre 1 e 100:");
            n = e.nextInt();
        } while (n < 1 || n > 100);
    }
    //EXERCÍCIO 22
    public static void Ex22() {
        System.out.println("Digite uma string:");
        String s = e.nextLine();
        int soma = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                soma += Character.getNumericValue(s.charAt(i));
            }
        }

        System.out.println("Soma dos dígitos: " + soma);
    }
    }
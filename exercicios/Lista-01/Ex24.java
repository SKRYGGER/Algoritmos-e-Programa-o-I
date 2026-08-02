//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner e = new Scanner(System.in);
    double resultado, valor;
    int opcao;

    System.out.println("Insira o valor para conversão");
    valor = e.nextDouble();

    System.out.println("Escolha a moeda para ser convertida:");
    System.out.println("1 - Dólar");
    System.out.println("2 - Euro");
    System.out.println("3 - Real");
    System.out.print("Opção: ");
    opcao = e.nextInt();

    if (opcao == 1) {
        resultado = valor / 5.23;
        System.out.println("Valor em Dollar:" + resultado);
    } else if (opcao == 2) {
        resultado = valor / 6.06;
        System.out.println("Valor em Euro:" + resultado);
    } else if (opcao == 3) {
        System.out.println("Valor em Real:" + valor);
    }
}

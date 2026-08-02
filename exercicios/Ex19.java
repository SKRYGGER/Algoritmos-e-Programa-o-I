void main() {
  Scanner e=new Scanner(System.in);

  double imc,altura,peso;

    System.out.println("Insira sua altura");
    altura=e.nextDouble();
    System.out.println("Insira seu peso");
    peso=e.nextDouble();

    imc= peso/ (altura*altura);

    if (imc <18.5) {
        System.out.println("Abaixo do peso");

    } else if (imc <24.9) {
        System.out.println("Peso normal");

    } else if (imc <29.9) {
        System.out.println("Sobrepeso");

    } else {
        System.out.println("Obesidade");

    }
}

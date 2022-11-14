import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

    System.out.println("Informe um número abaixo, por favor:");
    int numero = entrada.nextInt();

    if(numero > 0) {
      System.out.println("O número informado é positivo.");
    } else if (numero < 0) {
      System.out.println("O número informado é negativo");
    } else if (numero == 0) {
      System.out.println("O número informado é zero");
    }

  }
}
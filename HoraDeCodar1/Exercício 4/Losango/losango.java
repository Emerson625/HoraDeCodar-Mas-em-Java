import java.util.Scanner;

class Losango {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o valor da diagonal maior do losango:");
    double diag_maior = entrada.nextInt();
    System.out.println("Informe o valor da diagonal menor do losango:");
    double diag_menor = entrada.nextInt();
    System.out.println("A area do seu losango é: " + (diag_maior * //
    diag_menor)/2);

  }}
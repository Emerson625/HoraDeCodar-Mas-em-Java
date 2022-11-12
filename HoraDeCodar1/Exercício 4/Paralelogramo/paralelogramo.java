import java.util.Scanner;

class Paralelogramo {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o valor da base do seu paralelogramo:");
    int base = entrada.nextInt();
    System.out.println("Informe o valor da altura do seu paralelogramo:");
    int altura = entrada.nextInt();
    System.out.println("A area do seu paralelogramo é: " + base * altura);

  }}
import java.util.Scanner;

class Retangulo {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
System.out.println("Informe o valor da base do retângulo:");
int base = entrada.nextInt();
System.out.println("Informe o valor da altura:");
int altura = entrada.nextInt();
System.out.println("O valor da area do retângulo é " + (base*altura));

  }}
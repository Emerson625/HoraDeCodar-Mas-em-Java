import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe seu nome:");
    String name = entrada.nextLine();
    System.out.println("Informe sua idade:");
    int idade = entrada.nextInt();
    System.out.println(name + " sua idade é " + idade);

  }}
import java.util.Scanner;

class Quadrado {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o valor do lado do quadrado:");
    int lado = entrada.nextInt();
    System.out.println("A area do quadrado é: " + (lado*lado));
  }}
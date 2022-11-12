import java.util.Scanner;

class Circulo {
  public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
    System.out.println("Informe o valor do raio do seu círculo:");
    int raio = entrada.nextInt();
    System.out.println("A area do seu círculo é: " + 3.14 * (raio*raio));
    entrada.close();
  }
  }
import java.util.Scanner;

class  Trapezio{
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
    System.out.println("Informe o valor da base maior do seu trapézio:");
    double base_maior = entrada.nextInt();
    System.out.println("Informe o valor da base menor do seu trapézio:");
    double base_menor = entrada.nextInt();
    System.out.println("Informe o valor da altura do seu trapézio:");
    double altura = entrada.nextInt();
    System.out.println("A area do seu trapézio é: " + 
    ((base_maior+base_menor)*altura)/2);

  }}

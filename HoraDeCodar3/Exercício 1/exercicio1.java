import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe um valor abaixo:");
    int num1 = entrada.nextInt();
    int num2;

do {
    System.out.println("Informe outro valor abaixo:");
    num2 = entrada.nextInt();

    if (num2 <= 0) {
        System.out.println("Informe outro valor que seja maior que zero:");
        num2 = entrada.nextInt();
    }
  }while(num2 <= 0);

    double divisao = (num1 / num2);

    System.out.println(divisao);

}
}
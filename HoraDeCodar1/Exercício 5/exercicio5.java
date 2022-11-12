import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
System.out.println("Informe um número:");
int numero = entrada.nextInt();
if (numero == 0) {
System.out.println("O número informado é neutro.");
} else if (numero > 0) {
System.out.println("O número informado é positivo.");
} else {
 System.out.println("O número informado é negativo.");
}

  }}
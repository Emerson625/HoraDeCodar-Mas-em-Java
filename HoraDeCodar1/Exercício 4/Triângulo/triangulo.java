import java.util.Scanner;

class Triangulo {
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
System.out.println("Informe o valor da base do seu trângulo:");
int base = entrada.nextInt();
System.out.println("Informa o valor da altura do seu triângulo:");
int altura = entrada.nextInt();
System.out.println("A area do se triângulo é: " + (base*altura)/2);

  }}
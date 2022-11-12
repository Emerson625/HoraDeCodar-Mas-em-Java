import java.util.Scanner;

class Exercicio6 {
  public static void main(String[] args) {

Scanner entrada = new Scanner (System.in);
System.out.println("Informe 3 números abaixo, por favor:");
int a,b,c;
a = entrada.nextInt();
b = entrada.nextInt();
c = entrada.nextInt();

if (a > b && a > c) {
      System.out.println(a+" é o maior número.");
} else if (b > a && b > c) {
      System.out.println(b+" é o maior número.");
} else if (c > a && c > b) {

 System.out.println(c+" é o maior número.");
 }

  }}
import java.util.Scanner;

class Exercicio61 {
  public static void main(String[] args) {

Scanner entrada = new Scanner (System.in);
System.out.println("Informe 4 números abaixo, por favor:");
int a,b,c,d;
a = entrada.nextInt();
b = entrada.nextInt();
c = entrada.nextInt();
d = entrada.nextInt();
    
if (a > b && a > c && a > d) {
  System.out.println(a + " é o maior número.");
} else if (b > a && b > c && b > d) {
  System.out.println(b + " é o maior número.");
} else if (c > a && c > b && c > d) {
  System.out.println(c + " é o maior número.");
} else if (d > a && d > b && d > c) {
  System.out.println(d + " é o maior número.");
}
  }}
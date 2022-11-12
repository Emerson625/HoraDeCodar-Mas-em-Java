import java.util.Scanner;

class Exercicio8 {
  public static void main(String[] args) {

Scanner entrada = new Scanner (System.in);
    int a,b;

do {
    System.out.println("Informe um número abaixo, por favor:");
    a = entrada.nextInt();

    if ( a <= 0) {
        System.out.println("Informe outro número que não seja zero ou negativo");
        a = entrada.nextInt();
}

} while(a <= 0);

    System.out.println("Informe outro número abaixo, por favor:");
    b = entrada.nextInt();

    System.out.println("O resultado da divisão do primeiro valor lido pelo segundo valor é: " + (a / b));


}
}
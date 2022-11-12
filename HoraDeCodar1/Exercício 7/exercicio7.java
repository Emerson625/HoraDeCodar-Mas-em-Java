import java.util.Scanner;

class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um números, por favor:");
        int a = entrada.nextInt();
        System.out.println("Informe um números, por favor:");
        int b = entrada.nextInt();
        System.out.println("Informe um números, por favor:");
        int c = entrada.nextInt();

        int minimo = Math.min(a, Math.min(b,c));

        System.out.println("A soma dos dois maiores é: " + (a+b+c-minimo));

    }


}
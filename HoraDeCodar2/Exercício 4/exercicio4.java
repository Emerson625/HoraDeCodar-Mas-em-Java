import java.util.Scanner;

class Exercicio4 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Informe um número abaixo, por favor:");
        int num1 = entrada.nextInt();
        System.out.println("Agora outro.");
        int num2 = entrada.nextInt();
        System.out.println("Mais um:");
        int num3 = entrada.nextInt();
        System.out.println("Só mais um:");
        int num4 = entrada.nextInt();
        System.out.println("Tá acabando:");
        int num5 = entrada.nextInt();
        System.out.println("Outro...");
        int num6 = entrada.nextInt();
        System.out.println("Mais um:");
        int num7 = entrada.nextInt();
        System.out.println("Vamos que vai acabar:");
        int num8 = entrada.nextInt();
        System.out.println("Bora:");
        int num9 = entrada.nextInt();
        System.out.println("O ULTIMO:");
        int num10 = entrada.nextInt();

        System.out.println("A média aritmética dos números informados é: " + (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10);

    }
}
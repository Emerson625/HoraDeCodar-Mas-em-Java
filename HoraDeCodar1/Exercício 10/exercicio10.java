import java.util.Scanner;

class Exercicio10 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Informe sua nota abaixo na primeira avaliação, por favor:");
        double nota1 = entrada.nextInt();
        System.out.println("Informe sua nota abaixo na segunda avaliação, por favor:");
        double nota2 = entrada.nextInt();
        System.out.println("Informe sua nota abaixo na terceira avaliação, por favor:");
        double nota3 = entrada.nextInt();
        System.out.println("Informe sua nota abaixo na quarta avaliação, por favor:");
        double nota4 = entrada.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Infelizmente você foi reprovado!");
        }

    }
}
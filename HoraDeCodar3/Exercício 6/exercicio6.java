import java.util.Scanner;

class Exercicio6 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    double nota1, nota2;
    double aprovados = 0;
    char resposta = 's';

    do {
        System.out.println("Informe a primeira nota do aluno abaixo, por favor:");
        nota1 = entrada.nextInt();
        System.out.println("Informe a segunda nota abaixo, por favor:");
        nota2 = entrada.nextInt();

        double media = (nota1 + nota2) / 2;

        if(media > 9.5) {
            System.out.println("Parabéns! O aluno foi aprovado.");
            aprovados++;
        } else {
            System.out.println("Infelizmente O aluno foi reprovado.");
        }

        //System.out.println(resposta.getClass().getSimpleName());
        System.out.println("Calcular a média de outro aluno S/N?");
        resposta = entrada.next().charAt(0);

    } while(resposta == 's');

        System.out.println(aprovados + " alunos foram aprovados!");
}
}
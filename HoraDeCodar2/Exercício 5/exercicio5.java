import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    double nota1, nota2, nota3, nota4;
    double aprovados = 0;
    char resposta = 's';

    do {
        System.out.println("Informe a primeira nota do aluno abaixo, por favor:");
        nota1 = entrada.nextInt();
        System.out.println("Informe a segunda nota abaixo, por favor:");
        nota2 = entrada.nextInt();
        System.out.println("Informe a terceira nota do aluno abaixo, por favor:");
        nota3 = entrada.nextInt();
        System.out.println("Informe a quarta nota abaixo, por favor:");
        nota4 = entrada.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media > 6) {
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
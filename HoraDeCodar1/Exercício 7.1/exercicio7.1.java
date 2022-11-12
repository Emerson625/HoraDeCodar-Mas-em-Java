import java.util.Scanner;

class Exercicio71 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int maior2 = 0;

        for(int i = 0; i < 5; i++) {
        System.out.println(" Digite números:");
        int num = entrada.nextInt();
        if(num > maior) {
        maior2 = maior;
        maior = num;
        } else if(num > maior2) {
        maior2 = num;
        }
    }
        System.out.println("A soma dos dois maiores é: " + (maior + maior2));

    }


}
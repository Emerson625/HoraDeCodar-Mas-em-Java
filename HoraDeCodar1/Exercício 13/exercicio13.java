import java.util.Scanner;

class Exercicio13 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    double num1, num2;
    double qnt = 0;
    double soma = 0;
    
    
    do {
        System.out.println("Informe o primeiro número abaixo, por favor:");
        num1 = entrada.nextInt();
        System.out.println("Informe o segundo número abaixo, por favor:");
        num2 = entrada.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro numero informado deve ser menor que o segundo. Por favor, informe novamente o primeiro numero abaixo:");
            num1 = entrada.nextInt();
        }

        qnt = num2 - num1 + 1;

    } while(num1 > num2);


    for(var i = num1; i <= num2; i++){
        soma += i;
    }

      double media = soma / qnt;

      System.out.println("A média é igual a " + media);
        
}
}
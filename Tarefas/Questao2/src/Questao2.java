import java.util.Scanner;

/*
 * Enunciado
Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve observar quantos parâmetros são enviados via terminal(args).

Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1, deve pedir outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.

No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
 * 
 */

public class Questao2 {

    public static void main(String[] args) {
        double soma = 0;
        if (args.length > 0) {
            String num[] = new String[10];
            for (int i = 0; i < args.length; i++) {
                num[i] = args[i];
            }
            if (args.length == 2) {
                soma = Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
                System.out.println("A soma de " + num[0] + " + " + num[1] + " = " + soma);
            } else if(args.length == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Foi recebido apenas um parametro, por favor digite o segundo numero: ");
                double x = sc.nextDouble();
                soma = Double.parseDouble(num[0]) + x;
                System.out.println("A soma de " + x + " + " + num[0] + " = " + soma);
                sc.close();
            }else {
                System.out.print("Erro! Quantidade de parametros invalida! Por favor digite apenas 2 parametros.");
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nenhum parametro passado!");
            System.out.printf("Digite o primeiro numero: ");
            double x = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double y = sc.nextDouble();
            soma = x + y;
            System.out.println("A soma de " + x + " + " + y + " = " + soma);
            sc.close();
        }
    }
}
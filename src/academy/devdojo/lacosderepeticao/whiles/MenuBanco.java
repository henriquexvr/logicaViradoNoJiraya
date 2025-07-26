package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class MenuBanco {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int numeroMenu = 0;
        double valorImposto = 0, valorCalculado = 0, valorDepositado = 0, saldo = 0;

        while(numeroMenu != 4){
            System.out.println("Digite o numero para entrar no serviço solicitado:\n 1- Calcular imposto\n 2- Depositar \n 3- Saldo \n 4-Sair\n");
            numeroMenu = input.nextInt();

            if(numeroMenu == 1){
                System.out.println("Escreva o valor a ser calculado: ");
                valorImposto = input.nextInt();
                valorCalculado = valorImposto * 0.3;
                System.out.println("VALOR DE IMPOSTO: R$"+valorCalculado+"\n");
            }
            else if(numeroMenu == 2){
                System.out.println("Escreva o valor que voce deseja depositar");
                valorDepositado = input.nextInt();
                System.out.println("Valor depositado = R$"+ valorDepositado+"\n");
            }
            else if(numeroMenu == 3){
                saldo = saldo + valorDepositado;
                System.out.println("O saldo da sua conta é: R$"+ saldo+"\n");
            }
        }
        System.out.println("Fim do programada!");
    }
}

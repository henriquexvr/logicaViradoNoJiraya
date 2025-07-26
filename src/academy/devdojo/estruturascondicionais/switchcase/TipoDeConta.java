package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu tipo de conta?");
        System.out.println("1-Poupança\n2-Corrente\n3-Investimento");
        int conta = input.nextInt();

        switch (conta){
            case 1:
                System.out.println("CONTA_POUPANÇA 0.05%");
                break;
            case 2:
                System.out.println("CONTA_CORRENTE 0.02%");
                break;
            case 3:
                System.out.println("CONTA_INVESTIMENTO 0.1%");
                break;
            default:
                System.out.println("Conta invalida");
                break;
        }
    }
}

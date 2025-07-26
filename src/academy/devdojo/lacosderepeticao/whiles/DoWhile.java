package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2;
        int perguntaValidacao = 1;
        do{
            System.out.println("Escreva um numero de 1 a 10");
            num1 = input.nextInt();

            System.out.println("Escreva um numero de 1 a 10");
            num2 = input.nextInt();

            if(num1 == num2){
                System.out.println("Os numeros sao iguais");
            }else{
                System.out.println("Os numeros são diferentes");
            }
            System.out.println("Voce deseja continuar jogando?");
            System.out.println("1.Sim ou 2.Não?");
            perguntaValidacao = input.nextInt();

        }while(perguntaValidacao == 1);
    }
}

package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class NumerosPrimosUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um valor"); // O usuario deve escrevar um valor de 0 até 100
        int valor = input.nextInt(); //Valor digitado pelo usuario a uma variavel
        int i = 0; //Iteração
        while(i <= valor){
            //Enquanto a iteração (igual a 0) for menor que o valor digitado pelo usuario, o programa vai repetir ate que seja igual
            if(i % 2 != 0){
                System.out.println("i = "+ i);
            }
            i++; //Este incrimento de i+1 vai somar ate chegar ao valor que o usuario digitou, finalizando o while
        }
    }
}

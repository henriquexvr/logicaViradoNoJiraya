package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class UsuarioApertarZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        int numero = input.nextInt();
        while(numero != 0){
            System.out.println("Escreva outro numero: ");
            numero = input.nextInt();
        }
        System.out.println("Programa Finalizado!");
    }
}

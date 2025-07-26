package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class ArraysComFors {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double[] notas = new  double[4];
        //notas.length é o TAMANHO do array notas, por isso no for o i é "i < notas.length" que é igual a "i < 4"
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Escreva a nota "+(i+1));
            notas[i] = input.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota "+i+":"+notas[i]);
            soma = soma + notas[i];
        }
        double media = 0;
        media = soma/notas.length;

        System.out.println("A media das notas é: "+media);
    }
}


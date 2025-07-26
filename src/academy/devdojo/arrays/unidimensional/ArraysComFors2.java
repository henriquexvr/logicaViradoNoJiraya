package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class ArraysComFors2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double[] notas = new  double[4];
        double soma = 0, media = 0;;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Escreva a nota "+(i+1)+":");
            notas[i] = input.nextDouble();
            soma = soma + notas[i];
            media = soma/notas.length;
        }
        System.out.println("A media das notas é: "+media);
    }
}

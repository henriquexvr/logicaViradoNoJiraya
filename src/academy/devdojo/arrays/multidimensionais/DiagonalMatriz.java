package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int diagonalPrimaria = 1, diagonalSecundaria = 1;

        //Preenche a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Preencha cocm valores a matriz na posição ("+ i +" ,"+j+"): ");
                matriz[i][j] = input.nextInt();
            }
        }
        //Mostra a matriz para o usuario
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        //MULTIPLICAÇÃO DIAGONAL PRIMARIA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i == j){
                    diagonalPrimaria = diagonalPrimaria * matriz[i][j];
                }
            }
        }
        //MULTIPLICAÇÃO DIAGONAL SECUNDARIA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==0 && j == 2){
                    diagonalSecundaria = diagonalSecundaria * matriz[i][j];
                } else if (i==1 && j==1) {
                    diagonalSecundaria = diagonalSecundaria * matriz[i][j];
                }
                else if (i== 2 && j==0){
                    diagonalSecundaria = diagonalSecundaria * matriz[i][j];
                }
            }
        }
        System.out.println("Diagonal Primaria = "+ diagonalPrimaria);
        System.out.println("Diagonal Secundaria = "+ diagonalSecundaria);
    }
}

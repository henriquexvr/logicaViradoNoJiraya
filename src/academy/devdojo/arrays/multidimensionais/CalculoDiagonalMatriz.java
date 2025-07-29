package academy.devdojo.arrays.multidimensionais;

public class CalculoDiagonalMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int diagonalPrimaria = 1;
        matriz[0][0] = 2;
        matriz[0][1] = 2;
        matriz[0][2] = 2;
        matriz[1][0] = 2;
        matriz[1][1] = 2;
        matriz[1][2] = 2;
        matriz[2][0] = 2;
        matriz[2][1] = 2;
        matriz[2][2] = 2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" "); //o FOR j vai rodar a pelo tamanho do Array e quando ele terminar vai pular uma linha por causa deste print
        }
        System.out.println("=========================");
        System.out.println("Calculando Diagonal principal da Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    diagonalPrimaria = diagonalPrimaria * matriz[i][j];
                }
            }
        }
        System.out.println(diagonalPrimaria);
    }
}
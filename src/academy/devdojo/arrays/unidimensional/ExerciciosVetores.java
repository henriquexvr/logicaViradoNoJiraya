package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class ExerciciosVetores {
    public static void main(String[] args) {
        int[] V1 = new int[3], V2 = new int[3], VR = new int[3];
        Scanner input = new Scanner (System.in);
        String resultadoMultiplicacaoArrays = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("VETOR 1, POSIÇÃO "+(i+1)+":");
            V1[i] = input.nextInt();
            System.out.println("VETOR 2, POSIÇÃO  "+(i+1)+":");
            V2[i] = input.nextInt();

            VR[i] = V1[i]*V2[i];

            System.out.println("Vetor 1, posição:"+i+" = "+V1[i]);
            System.out.println("Vetor 2, posição:"+i+" = "+V2[i]);
            System.out.println("Vetor Resultado, posição:"+i+" = "+VR[i]);

            resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays + VR[i]+" ";
        }
        System.out.println("Multiplicação dos indicies: "+resultadoMultiplicacaoArrays);
    }
}

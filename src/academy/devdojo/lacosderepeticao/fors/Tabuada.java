package academy.devdojo.lacosderepeticao.fors;

public class Tabuada {
    public static void main(String[] args) {
        //Elaborar um programa que calcule e apresente a tabuada de um numero qualquer
        int resultado;
        for(int i = 1; i <=10; i++){
            System.out.println("TABUADA DO NUMERO: "+ i);
            for(int j = 1; j <= 10; j++){
                resultado = i * j;
                System.out.println(i + "x" + j +" = "+ resultado);
            }
        }
    }
}

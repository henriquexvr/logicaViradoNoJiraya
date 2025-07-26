package academy.devdojo.lacosderepeticao.fors;

public class UmAhCem {
    public static void main(String[] args) {
        //Elaborar uma rotina que apresente todos os numeros pares numa faixa de 0 a 100

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

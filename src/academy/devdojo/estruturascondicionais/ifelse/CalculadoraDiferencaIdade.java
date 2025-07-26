package academy.devdojo.estruturascondicionais.ifelse;

public class CalculadoraDiferencaIdade {
    public static void main (String[] args){
        int firstAge = 10, secondAge = 20, differenceAges;

        differenceAges = firstAge - secondAge;

        if(differenceAges < 0){
            differenceAges = differenceAges * -1;
            System.out.println("A diferenca entre as idades eh de " + differenceAges + " anos.");
        }
        else{
            System.out.println("A diferenca entre as idades eh de " + differenceAges + " anos.");
        }
    }
}

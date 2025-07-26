package academy.devdojo.variaveis;

public class PorcentagemDeUmSalario {
    public static void main(String[] args){
        float salario = 1518.28F, valorPorcentagem = 0.2F, valorSalarioPorcentagem, diferencaSalario;
        valorSalarioPorcentagem = salario * valorPorcentagem;
        diferencaSalario = salario - valorSalarioPorcentagem;
        System.out.println("20% do seu salario eh: " + valorSalarioPorcentagem);
        System.out.println("A diferença entre esse valor e o seu salario da o total de: " + diferencaSalario);
    }
}

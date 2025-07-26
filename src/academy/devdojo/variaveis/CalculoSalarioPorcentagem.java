package academy.devdojo.variaveis;

public class CalculoSalarioPorcentagem {
    public static void main(String[] args) {
        float salario = 5000F, primeiraPorcentagem = 0.30F, segundaPorcentagem = 0.15F, terceiraPorcentagem = 0.05F;
        float resultado;

        resultado = salario * primeiraPorcentagem;
        System.out.println("30% do seu salario é: " + resultado);

        resultado = salario * segundaPorcentagem;
        System.out.println("15% do seu salario é: " + resultado);

        resultado = salario * terceiraPorcentagem;
        System.out.println("5% do seu salario é: " + resultado);
    }
}



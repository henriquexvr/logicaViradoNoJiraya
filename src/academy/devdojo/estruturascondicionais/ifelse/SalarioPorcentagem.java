package academy.devdojo.estruturascondicionais.ifelse;

public class SalarioPorcentagem {
    public static void main(String[] args) {
        float salario = 5000F, trintaPorcento = 0.3F, quinzePorcento = 0.15F, resultado;
        String porcentagem = "";

        if(salario > 4500){
            resultado = salario * trintaPorcento;
            porcentagem = "30%";

        }
        else{
            resultado = salario * quinzePorcento;

            porcentagem = "15%";
        }
        System.out.println("O valor final eh "+porcentagem+" do seu salario atual, que corresponde ah: "+resultado);
    }
}


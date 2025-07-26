package academy.devdojo.estruturascondicionais.ifelse;

public class Condicionais01 {
    public static void main(String[] args) {
        boolean atravessarRua = false;
        if (atravessarRua) {
            System.out.println("Não vem nenhum carro, voce pode atravesar");
        } else {
            System.out.println("Vem alguns carros, espere para atravesar");
        }
    }

    public static class TabelaImpostoDeRenda {
        public static void main(String[] args) {
            float salario = 3869.56F;
            float aliquotaPorCento01 = 0.075F, aliquotaPorCento02 = 0.15F, aliquotaPorCento03 = 0.225F, aliquotaPorCento04 = 0.275F;
            if (salario <= 2259.20) {
                System.out.println("Voce esta isento da aliquota!");
            } else if ((salario >= 2259.21) && (salario <= 2826.65)) {
                System.out.println("Esse cidadao paga uma ALIQUOTA de 7,5%");
            } else if ((salario >= 2826.66) && (salario <= 3751.05)) {
                System.out.println("Esse cidadao paga uma ALIQUOTA de 15%");
            } else if ((salario >= 3751.06) && (salario <= 4664.68)) {
                System.out.println("Esse cidadao paga uma ALIQUOTA de 22,5%");
            } else {
                System.out.println("Esse cidadao paga uma ALIQUOTA de 27,5%");
            }
        }
    }

    public static class VerificaIdade {
        public static void main(String[] args) {
            int idade = 25;

            if (idade > 18) {
                System.out.println("ADULTO");
            }
            else{
                System.out.println("AINDA NÃO EH ADULTO");
            }
        }
    }
}

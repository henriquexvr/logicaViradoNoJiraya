package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Escreva o seu sexo (F/M): ");
        char sexo = input.next().charAt(0);

        if(sexo == 'M' && idade >= 18){
            System.out.println("Alistamento Obrigatorio");
        }
        else if((sexo == 'M' || sexo == 'F')  && idade < 18){
            System.out.println("Alistamento nao Permitido");
        }
        else if(sexo == 'F' && idade >= 18){
            System.out.println("Alistamento Opcional");
            System.out.println("Voce deseja se alistar ao exercito?");
        }
        else{
            System.out.println("Dados invalidos, favor refazer o cadastro");
        }
    }

    public static class DiasDaSemana {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Escreva um numero de 1 a 7");
            int dia = input.nextInt();

            if(dia == 1){
                System.out.println("Segunda-Feira");
            } else if (dia == 2) {
                System.out.println("Terça-Feira");
            }
            else if (dia == 3) {
                System.out.println("Quarta-Feira");
            }
            else if (dia == 4) {
                System.out.println("Quinta-Feira");
            }
            else if (dia == 5) {
                System.out.println("Sexta-Feira");
            }
            else if (dia == 6) {
                System.out.println("Sabado");
            }
            else if (dia == 7) {
                System.out.println("Domingo");
            }else {
                System.out.println("Dia invalido");
            }
        }
    }

    public static class SeONumeroEImparOuPar {
        public static void main(String[] args) {
            int numero = -13;
            if(numero % 2 == 0){
                System.out.println("Esse numero eh par");
            }
            else{
                System.out.println("Esse numero eh impar");
            }
        }
    }

    public static class TorneioDeNatacao {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nome;
            int idade;

            System.out.println("Escreva o seu nome");
            nome = sc.nextLine();
            System.out.println("Escreva a sua idade");
            idade = sc.nextInt();

            if(idade <= 10){
                System.out.println(nome+" participara da categoria infantil");
            }
            else if(idade >= 11 && idade <= 15){
                System.out.println(nome+" participara da categoria juvenil");
            }
            else if(idade >= 16 && idade <= 19){
                System.out.println(nome+" participara da categoria Pre-Adulto");
            }
            else {
                System.out.println(nome+" participara da categoria adulto");
            }
        }
    }
}

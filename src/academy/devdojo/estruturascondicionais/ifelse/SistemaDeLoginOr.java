package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class SistemaDeLoginOr {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();

        if(nome.equalsIgnoreCase("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Nome de usuario invalido");
        }
        else{
            System.out.println(nome + " cadastrado(a) com sucesso");
        }
    }
}

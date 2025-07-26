package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class UsuarioESenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String usuario = "Gon";
        final String senha = "Killua";

        boolean telaLogin = true;
        while (telaLogin) {
            System.out.println("DIGITE SEU USUARIO: ");
            String usuarioDigitado = input.nextLine();

            System.out.println("DIGITE SUA SENHA: ");
            String senhaDigitada = input.nextLine();

            if (usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
                System.out.println("ACESSO CONCEDIDO");
                telaLogin = false;
            } else {
                System.out.println("ACECESSO NEGADO");
            }
        }
    }
}
